package week6.Lesson10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson10HW {

	public static void main(String[] args) {

//		 task 1
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();
	

		try {
			Thread t3 = new MyThread3(t1, t2);
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TASK 4
		String[] arrayString = new String[10];
		String fileNameRead = "file1.txt";
		String fileNameWrite = "file2.txt";
		String s = null;
		int numberOfLines = 0;
		int num = 0;
		int countOfSymbols = 0;
		int longestLineQ = 0;
		int longestLineNum = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(fileNameRead))) {
			br.mark(1);

			br.reset();
			while ((s = br.readLine()) != null) {

				arrayString[num] = s;
				countOfSymbols = arrayString[num].length();

				System.out.println("Row number " + (num + 1) + ": '" + arrayString[num]
						+ "'. Numbers of symbols of this line is " + countOfSymbols + ".");

				if (longestLineQ < countOfSymbols) {
					longestLineQ = countOfSymbols;
					longestLineNum = num;
				}

				num++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Numbers of Lines in file1.txt: " + (num));
		
		System.out.println(
				"Longest line is " + (longestLineNum+1) + ". Numbers of symbols of longest line is " + longestLineQ);

		String myName = "Yura";
		String birthDay = "1990-09-16";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"))) {
			bw.write(String.valueOf(num) + "\n");
			bw.write(arrayString[longestLineNum] + "\n");
			bw.write(myName + "\n");
			bw.write(birthDay + "\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
	}

}
