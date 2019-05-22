import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please write number one (a):");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Please write number two (b):");
		int b = Integer.parseInt(br.readLine());
		int c = a + b;
		System.out.println("a + b = " + c);
		c = a - b;
		System.out.println("a - b = " + c);
		c = a * b;
		System.out.println("a * b = " + c);
		c = a / b;
		System.out.println("a / b = " + c);
	}
}
