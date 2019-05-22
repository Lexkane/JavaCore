package week5.Lesson8_PracticalAndHW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson8 {

	public static void main(String[] args) {

		String name = "yura";
		String pseudo = "yyasicyura";

		// taks 1) using own algorithm

		boolean contains = false;
		int j = 0;
		int i = 0;
		while (j < pseudo.length()) {
			if (name.charAt(i) == pseudo.charAt(j)) {
				i++;

			} else if (j >= 1 && i > 0) {
				i = 0;
				j -= 1;
			}
			if (i == name.length()) {
				System.out.println("Yeah, pseudo contains name");
				contains = true;
				break;
			} else if (j > pseudo.length() - name.length() && i == 0) {
				System.out.println("Nope pseudo doesn't contains name");
				break;
			}
			j++;
		}

		if (!contains) {
			System.out.println("Nope pseudo doesn't contains name");
		}

		// task 1) using java lang methods

		System.out.println("Does psesudo contains name value in: " + pseudo.contains(name));
		System.out.println();
		// task 2)
		String wholeName = "Stadnyk Yuriy Mykhaylovych";
		String[] dividedName = wholeName.split("\\s");
		System.out.println(dividedName[0] + " " + dividedName[1].charAt(0) + ". " + dividedName[2].charAt(0) + ".");
		System.out.println(dividedName[1]);
		System.out.println(dividedName[1] + " " + dividedName[2] + " " + dividedName[0]);
		System.out.println();
		
		
		// task 3)

		System.out.println("Write down a names in one line separating with whitespace like 'Andrew Yura Taras etc' "
				+ "The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.");
		
		Scanner sc = new Scanner(System.in);
		String namesReg = sc.nextLine();
		String [] fiveNames = namesReg.split("\\s+");
		Pattern p = Pattern.compile("\\w{3,15}");
		int z = 0;
		do {
			Matcher m = p.matcher(fiveNames[z]);
			
			if (m.matches()){
				System.out.println("Name Matches to the rules. The login name is '" + m.group() + "'");
			} else {
				System.out.println("The name '" + fiveNames[z] + "' doesn't mathes to the rules: "
						+ "the user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. ");
			}

			z++;
		} while (z != fiveNames.length);
		
	}

}
