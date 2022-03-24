// Program to change all letter from small case to capital case in a string. 

package interviewQuestionsPractice;

import java.util.Scanner;

public class StringToUppercase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String");
		String sampleString = scanner.nextLine();

		System.out.println("All letters in Uppercase -----" + sampleString.toUpperCase());

		scanner.close();
	}

}





