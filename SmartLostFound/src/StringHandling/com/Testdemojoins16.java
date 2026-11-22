package StringHandling.com;

public class Testdemojoins16 {

    public static void main(String[] args) {

        String s1 = "J2SE";
        String s2 = "J2EE";
        String s3 = "MYSQL";
        String s4 = "SPRING";
        String s5 = "SPRINGBOOT";

        String names = String.join("-", s1, s2, s3, s4, s5);

        System.out.println(names);
    }
}