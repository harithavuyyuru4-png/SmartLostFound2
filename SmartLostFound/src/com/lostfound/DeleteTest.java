
package com.lostfound;

public class DeleteTest {

    public static void main(String[] args) {

        ItemDAO dao = new ItemDAO();

        boolean result = dao.deleteItem(1);

        if (result) {
            System.out.println("Item Deleted Successfully!");
        } else {
            System.out.println("Item Delete Failed!");
        }
    }
}

