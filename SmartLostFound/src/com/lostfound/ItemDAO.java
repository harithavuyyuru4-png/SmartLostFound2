
package com.lostfound;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ItemDAO {

    // CREATE - Add Item
    public boolean addItem(Item item) {

        String sql = "INSERT INTO items (user_id, item_name, description, location, item_type, status) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, item.getUserId());
            ps.setString(2, item.getItemName());
            ps.setString(3, item.getDescription());
            ps.setString(4, item.getLocation());
            ps.setString(5, item.getItemType());
            ps.setString(6, "OPEN");

            int rows = ps.executeUpdate();

            ps.close();
            con.close();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // READ - View All Items
    public void viewAllItems() {

        String sql = "SELECT * FROM items";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Item ID: " + rs.getInt("item_id"));
                System.out.println("Item Name: " + rs.getString("item_name"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Location: " + rs.getString("location"));
                System.out.println("Type: " + rs.getString("item_type"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("----------------------");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE - Update Item Status
    public boolean updateItemStatus(int itemId, String status) {

        String sql = "UPDATE items SET status = ? WHERE item_id = ?";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, itemId);

            int rows = ps.executeUpdate();

            ps.close();
            con.close();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // DELETE - Delete Item
    public boolean deleteItem(int itemId) {

        String sql = "DELETE FROM items WHERE item_id = ?";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, itemId);

            int rows = ps.executeUpdate();

            ps.close();
            con.close();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
