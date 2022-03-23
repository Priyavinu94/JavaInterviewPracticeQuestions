//Program to reverse a string and check if it is a palindrome
package interviewQuestionsPractice;

import java.util.Scanner;

public class StringReverseAndPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String");
		String stringInput = scanner.next();
		
		String revString = "";
		for (int i = stringInput.length() - 1; i >= 0; i--) {
			revString = revString + stringInput.charAt(i);
		}

		System.out
				.println(stringInput.equalsIgnoreCase(revString) ? "String is Palindrome" : "String is Not Palindrome");

		scanner.close();
	}

}
