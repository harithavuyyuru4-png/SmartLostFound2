
package com.lostfound;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    // User Registration
    public boolean registerUser(User user) {

        String sql = "INSERT INTO users (full_name, email, password, phone) VALUES (?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getFullName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());

            int rows = ps.executeUpdate();

            con.close();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // User Login
    public boolean loginUser(String email, String password) {

        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean result = rs.next();

            con.close();

            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
