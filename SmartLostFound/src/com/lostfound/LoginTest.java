
package com.lostfound;

public class LoginTest {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        boolean result = dao.loginUser(
            "haritha123@gmail.com",
            "hari123"
        );

        if (result) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Email or Password!");
        }
    }
}
