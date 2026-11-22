package StringHandling.com;

import java.util.Scanner;

public class TestdemoUsers9 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter your username");
String username=sc.next();
System.out.println("enter your password");
sc.nextLine();
String password=sc.nextLine();
if(username.equalsIgnoreCase("user")&&password.equalsIgnoreCase("Admin@123")) {
	System.out.println("welcome to home page");
}else {
	System.out.println("invalid user credintials");
}

	}

}
