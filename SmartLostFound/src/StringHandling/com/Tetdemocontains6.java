package StringHandling.com;

public class Tetdemocontains6 {

	public static void main(String[] args) {
		String []names= {"Dhoni","virat","MSD","Rahul","Rohith","Abhishek"};
		for(String name:names) {
			if(name.contains("h")) {
				System.out.println(name);
			}
		}
	}

}
