package StringHandling.com;

public class Testdemostartswith7 {

		public static void main(String[] args) {
			String []names= {"Dhoni","virat","MSD","Rahul","Rohith","Abhishek"};
			for(String name:names) {
				if(name.toLowerCase().startsWith("r")) {
					System.out.println(name);
					if(name.toLowerCase().startsWith("r")||name.toLowerCase().endsWith("k")) {
						System.out.println(name);
				}

	}

			}
		}
}
