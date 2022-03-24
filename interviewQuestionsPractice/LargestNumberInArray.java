// Program to find the maximum (largest) number in an array 
package interviewQuestionsPractice;

import java.util.Random;
import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random randomInt = new Random();
		
		System.out.println("Specify array length");
		int arrayLength = scanner.nextInt();
		//instantiation integer array of length 5
		int[] randomArray = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			randomArray[i] = randomInt.nextInt(100);
		}

		int largestElement = randomArray[0];
		for (int element : randomArray) {
			if (element > largestElement) {
				largestElement = element;
			}
		}

		System.out.println("Largest element in the array is : " + largestElement);

		System.out.print("\nArray Elements :  \n");
		for (int element : randomArray) {
			System.out.print(element + "  ");
		}
		
		scanner.close();
	}

}
