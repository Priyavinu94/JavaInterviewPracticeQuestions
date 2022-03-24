// Program to replace 2 number without using third variable.

package interviewQuestionsPractice;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 2 numbers");
		int num1 = scanner.nextInt(); // 3
		int num2 = scanner.nextInt(); // 2

		System.out.println("Values before swap: num1 = " + num1 + ", num2 = " + num2);

		num1 += num2; // num1 = 5
		num2 = num1 - num2; // num2 = 3
		num1 = num1 - num2; // num1 = 2
		
		System.out.println("Values after swap: num1 = " + num1 + ", num2 = " + num2);
		
		scanner.close();
	}

}
