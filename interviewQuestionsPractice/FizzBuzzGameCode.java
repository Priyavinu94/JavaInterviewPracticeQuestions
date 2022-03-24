/*
 * FizzBuzz is a fun game mostly played in elementary school. The rules are simple: when your turn arrives, you say the next number. However, if that number is a multiple of 
 * three, you should say the word “fizz” (preferably with a French accent) instead. If the number is a multiple of five, you should say “buzz.” And if it is a multiple of both, 
 * you should say “fizzbuzz.” If you mess up, you’re out, and the game continues without you.

Ex. 1 2 Fizz  4 Buzz  fizz 7 8 fizz Buzz 11 fizz 13 14 fizzbuzz 16 17 …..

 */

package interviewQuestionsPractice;

public class FizzBuzzGameCode {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0 && i % 5 == 0) {
//				System.out.println("fizzbuzz");
//			} else if (i % 3 == 0) {
//				System.out.println("Fizz");
//			} else if (i % 5 == 0) {
//				System.out.println("Buzz");
//			} else {
//				System.out.println(i);
//			}
//		}

		for (int i = 1; i <= 100; i++) {
			System.out.println(
					(i % 3 == 0 && i % 5 == 0) ? "fizzbuzz" : (i % 3 == 0) ? "Fizz" : (i % 5 == 0) ? "Buzz" : i);
		}

	}

}
