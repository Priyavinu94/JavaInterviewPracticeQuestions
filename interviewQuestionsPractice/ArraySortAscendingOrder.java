// Program to sort an array of number -- ascending order.

package interviewQuestionsPractice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArraySortAscendingOrder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no of elements in array");
		int arrayLength = scanner.nextInt();
		
		int[] intArray = new int[arrayLength];
		Random randomInt = new Random();
		
		//populating array with random integers
		for (int i = 0; i < arrayLength; i++) {
			intArray[i] = randomInt.nextInt(100);
		}
		
		//printing array elements before sorting
		System.out.println("Array elements are : ");
		for (int element : intArray) {
			System.out.print(element + " ");
		}
		
		
		//sorting -- using loop
		for (int i = 0; i < arrayLength - 1; i++) {
			int indexOfSmallest = i; // variable declared to store the index of maximum value in each iteration
			int temp = intArray[i];
			for (int j = i + 1; j < arrayLength; j++) {
				if (intArray[indexOfSmallest] > intArray[j]) {
					indexOfSmallest = j;
				}
			}
			intArray[i] = intArray[indexOfSmallest];
			intArray[indexOfSmallest] = temp;
		}
		
		//sorting -- using sort() of Arrays class
		Arrays.sort(intArray);

		System.out.println("\nArray elements ascending order : ");
		for (int element : intArray) {
			System.out.print(element + " ");
		}
		
		scanner.close();
	}

}
