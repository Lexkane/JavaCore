package week6.Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HW9 {
	//task A
	public static double div(double a, double b) {

		if (b == 0) {
			System.out.println("second operand is 0, cant be divided to 0 ");
			return 0;
		}
		return a / b;
	}
	
	//task B
	public static int readNumber(int start, int end) throws Exception{
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()){
			int toReturn = sc.nextInt();
			if (start < toReturn && toReturn < end){
				return toReturn;
			} else {
				System.out.println("Exception, you wrote wrong number. Number should be in range from (" + start + "..." + end + ").");
				throw new Exception();
			}
		} else {
			System.out.println("Exception, you wrote not a integer number. Wrote number in range from (" + start + "..." + end + ").");
			throw new Exception();
		}
		
		
	}
	

	public static void main(String[] args) {

		// task A
		double a = 0;
		double b = 0;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("Write down two double numbers,that will be divided");
				a = Double.parseDouble(br.readLine());
				b = Double.parseDouble(br.readLine());
				System.out.println("Result of dividing of two double values is " + div(a, b));
			} catch (NumberFormatException e) {
				System.out.println("You wrote not a double value");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (b == 0);
		
		//Task B
		int n = 0;
		int start = 1;
		int end = 100;
		do {
			try {
				int newStart = readNumber(start, end);
				start = newStart;
				System.out.println("New start range is " + start);
				n++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		} while (n != 10);
		
		
		

	}

}
