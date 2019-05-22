import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in the console sentence of five words");
		byte n=0;
		String [] str = {""};
		while(n<5) {
		 str = (scan.nextLine().split(" "));
		 n++;
		}
		
		for(int i=0; i<str.length-1; i++) {
			for(int m=1; m<str.length; m++) {
				if(str[i].length()>str[m].length()) {
					if(m==str.length-1) {
					System.out.println("The longest word is "+str[i]);
					}
				}
			}
		}
		
//		 boolean isSorted = false;
//	        int buf;
//	        while(!isSorted) {
//	            isSorted = true;
//	            for (int i = 0; i < str.length-1; i++) {
//	                if(str[i].length() < str[i+1].length()){
//	                    isSorted = false;
//	 
//	                    buf = str[i].length();
//	                    str[i].length() = str[i+1].length();
//	                    str[i+1].length() = buf;
//	                }
//	            }
//	        }
		
		
		
		
	}

}
