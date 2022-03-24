package interviewQuestionsPractice;

import java.util.Random;
import java.util.Scanner;

public class ArrayInDescendingOrder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random randomInt = new Random();

		System.out.println("Specify the Array Length");
		int arrayLength = scanner.nextInt();

		// instantiating array of type int
		int[] intArray = new int[arrayLength];
		
		//populate array
		for (int i = 0; i < arrayLength; i++) {
			intArray[i] = randomInt.nextInt(100);
		}
		
		//printing elements before sorting
		System.out.println("Array elements are : ");
		for (int element : intArray) {
			System.out.print(element + " ");
		}

		//sorting using loop in descending order
		for (int i = 0; i < arrayLength - 1; i++) {
			int indexOfLargest = i; // variable declared to store the index of maximum value in each iteration
			int temp = intArray[i];
			for (int j = i + 1; j < arrayLength; j++) {
				if (intArray[indexOfLargest] < intArray[j]) {
					indexOfLargest = j;
				}
			}
			intArray[i] = intArray[indexOfLargest];
			intArray[indexOfLargest] = temp;
		}
		
		//printing sorted array
		System.out.println("\nArray elements descending order : ");
		for (int element : intArray) {
			System.out.print(element + " ");
		}
		scanner.close();
	}

}
