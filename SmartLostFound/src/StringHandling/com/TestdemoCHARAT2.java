package StringHandling.com;

import java.util.Scanner;

public class TestdemoCHARAT2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String rstr = "";

        for(int i=0; i<str.length(); i++) {

            char c = str.charAt(i);

            rstr = c+rstr;
        }

        System.out.println("reverse string of a given string is:"+rstr);

        System.out.println("-----------------------------------");

        if(str.equalsIgnoreCase(rstr)) {
            System.out.println("the given string is palindrome");
        }
        else {
            System.out.println("the given string is not a palindrome");
        }
    }
}