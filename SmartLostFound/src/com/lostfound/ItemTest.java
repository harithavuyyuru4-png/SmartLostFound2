package com.lostfound;

public class ItemTest {

    public static void main(String[] args) {

        Item item = new Item();

        item.setUserId(1);
        item.setItemName("Black Wallet");
        item.setDescription("Black leather wallet");
        item.setLocation("KPHB Bus Stop");
        item.setItemType("LOST");

        ItemDAO dao = new ItemDAO();

        boolean result = dao.addItem(item);

        if (result) {
            System.out.println("Item Added Successfully!");
        } else {
            System.out.println("Item Addition Failed!");
        }
    }
}