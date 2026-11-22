package StringHandling.com;

public class Testdemointern12 {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2="java";
		s1=s1.intern();
		System.out.println(s1==s2);

	}

}
