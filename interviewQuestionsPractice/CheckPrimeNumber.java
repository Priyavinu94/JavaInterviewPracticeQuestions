// Program to find if the number is prime or not. 

package interviewQuestionsPractice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive integer");
		int num = scanner.nextInt();

		// **** Method 1: Using Loop ****
		boolean isPrime = true;
		for (int div = 2; div <= num / 2; div++) {
			if (num % div == 0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime ? "Number is prime" : "Number is not prime");

		// **** Method 2: Using Stream *****
		isPrime = IntStream.range(2, num / 2).noneMatch(n -> (num % n == 0));
		System.out.println(isPrime ? "Number is prime" : "Number is not prime");

		scanner.close();
	}

}
