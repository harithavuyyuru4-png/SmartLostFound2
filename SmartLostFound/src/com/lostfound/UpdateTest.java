
package com.lostfound;

public class UpdateTest {

    public static void main(String[] args) {

        ItemDAO dao = new ItemDAO();

        boolean result = dao.updateItemStatus(1, "FOUND");

        if (result) {
            System.out.println("Item Updated Successfully!");
        } else {
            System.out.println("Item Update Failed!");
        }
    }
}

