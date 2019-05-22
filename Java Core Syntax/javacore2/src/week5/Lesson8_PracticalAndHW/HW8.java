package week5.Lesson8_PracticalAndHW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW8 {

	public static void main(String[] args) {

		// TASK 1)

		System.out.println(
				"Enter in the console sentence of five words separating with whitespace like 'Andrew goes to etc'");

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] fiveWords = sentence.split("\\s+");

		int maxLength = 0;
		int numSum = 0;
		String theLongestWord = null;
		for (String string : fiveWords) {
			numSum += string.length();
			if (string.length() > maxLength) {
				maxLength = string.length();
				theLongestWord = string;
			}
		}
		System.out.println("The longest word is '" + theLongestWord + "'");
		System.out.println("The number of sentence's letters is " + numSum);

		// reverse word by reverse method of StringBuilder
		StringBuilder wordReverse = new StringBuilder(fiveWords[1]).reverse();
		System.out.println(wordReverse);

		// reverse by own algorithm
		StringBuilder reverseSecondWord = new StringBuilder();
		for (int i = 1; i <= fiveWords[1].length(); i++) {
			reverseSecondWord.append(fiveWords[1].charAt(fiveWords[1].length() - i));
		}
		System.out.println(reverseSecondWord);

		// TASK 2
		System.out.println("Enter in the console sentence that contains the words between more than one space."
				+ " e.g 'I    am      learning     Java   Core»'");

		String sentenceWithWhiteSpace = "I    am      learning     Java   Core";
		// 1 variant
		// Pattern p = Pattern.compile("\\s+");
		// Matcher m = p.matcher(sentenceWithWhiteSpace);
		// System.out.println(m.replaceAll(" "));

		// //2 variant
		// System.out.println(Pattern.compile("\\s+").matcher(sentenceWithWhiteSpace).replaceAll("
		// "));

		// 3 variant
		String correctSentence = sentenceWithWhiteSpace.replaceAll("\\s+", " ");
		System.out.println(correctSentence);

		// TASK 3
		Pattern p1 = Pattern.compile("\\$\\d*(\\.\\d{2})?");
		System.out.println("Enter the text from the console that contains several occurrences of US currency");
		Scanner sc1 = new Scanner(System.in);
		String USoccurrencies = sc1.nextLine();
		Matcher m1 = p1.matcher(USoccurrencies);
		while (m1.find()) {
			System.out.print(USoccurrencies.substring(m1.start(), m1.end()) + "\n");
		}
	}

}
