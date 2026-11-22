package StringHandling.com;

public class Testdemomatches17 {

	public static void main(String[] args) {
	String phone="9056778864";
	boolean isValid=phone.matches("[6-9]{1}[]0-9]{9}");
	System.out.println(isValid);

	}

}
