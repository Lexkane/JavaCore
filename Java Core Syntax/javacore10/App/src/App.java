
public class App {
	public static void main(String[] args) {
		int[] numbers = { 10, 14, 1, 5, 44, 3, 2, -6, -4, -3 };
		int max = numbers[0];
		int hi = 0;
		int sum = 0;
		int counter = 0;

		while (hi < numbers.length) {
			if (numbers[hi] > max) {
				max = numbers[hi];
			}
			if (numbers[hi] < 0) {
				++counter;
				continue;
			}
	
			sum += numbers[hi];
			hi++;
		}
		System.out.print("Maximum = " + max + "\n");

		System.out.println("Sum = " + sum);
		
		System.out.println("Amount of negative values:"+ counter);
		if( counter < numbers.length){
			System.out.println("there is more positive numbers");
		}
		else{
			System.out.println("There is more negative numbers");
		}


	}

}
