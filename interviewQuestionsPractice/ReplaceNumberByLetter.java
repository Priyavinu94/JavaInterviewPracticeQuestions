package interviewQuestionsPractice;

import java.util.Arrays;
import java.util.Random;

public class ReplaceNumberByLetter {

	public static void main(String[] args) {

//		//ASCII values for A to Z ranges from 65 to 90
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			int i = ch-65;
//			System.out.print(ch+":"+i + " ");//prints A=0 B=1 .... X=25
//		}

		Random randomInt = new Random();
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = randomInt.nextInt(100);
		}

		System.out.println("Integer array elements : ");
		Arrays.stream(intArray).forEach(num -> System.out.print(num + " "));

		System.out.println("\nArray elements replaced with alphabet");
		Arrays.stream(intArray).forEach(num -> System.out.print((char) (num % 26 + 65) + " "));

//		for (int num : intArray) {
//			char ch = (char)(num%26 + 65);
//			System.out.print(ch + " ");
//		}

	}

}
