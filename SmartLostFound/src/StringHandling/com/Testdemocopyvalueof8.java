package StringHandling.com;

public class Testdemocopyvalueof8 {

	public static void main(String[] args) {
		String []names= {"Dhoni","virat","MSD","Rahul","Rohith","Abhishek"};
        char[]data= {'a','b','c'};
        String s1=String.copyValueOf(data);
        System.out.println(s1);
	}

}
