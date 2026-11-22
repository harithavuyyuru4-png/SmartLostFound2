package StringHandling.com;

public class Testdemoissplit15 {

	public static void main(String[] args) {
		String str="java is simple";
		String[]words=str.split("\\s");
		int count=0;
		for(String word:words) {
			count++;
			System.out.println(word);
		}
		System.out.println(count);
	}

}
