package StringHandling.com;

public class TestdemoIndexof13 {
//duplicate elements in a string
	public static void main(String[] args) {
String str="java is simple";
for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
		if(str.indexOf(ch)!=str.lastIndexOf(ch)&&str.indexOf(ch)==i) {
			System.out.println(ch);
	}
}
	}

}
