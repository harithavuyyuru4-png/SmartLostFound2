
package com.lostfound;

public class RegisterTest {

    public static void main(String[] args) {

        User user = new User();

        user.setFullName("Haritha");
        user.setEmail("haritha123@gmail.com");
        user.setPassword("hari123");
        user.setPhone("9876543210");

        UserDAO dao = new UserDAO();

        boolean result = dao.registerUser(user);
        if (result) {
            System.out.println("User Registered Successfully!");
        } else {
            System.out.println("Registration Failed!");
        }
    }
}

