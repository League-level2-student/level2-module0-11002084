package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings

		String[] farmAnimals = { "pig", "cow", "sheep", "chicken", "duck" };

		// 2. print the third element in the array

		System.out.println(farmAnimals[2]);

		// 3. set the third element to a different value

		farmAnimals[2] = "goat";

		// 4. print the third element again

		System.out.println(farmAnimals[2]);

		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE

		for (int i = 0; i < farmAnimals.length; i++) {
			System.out.println(farmAnimals[i]);
		}

		// 6. make an array of 50 integers

		int[] integers = new int[50];

		// 7. use a for loop to make every value of the integer array a random number

		Random rand = new Random();
		for (int i = 0; i < integers.length; i++) {
			integers[i] = rand.nextInt(100);
		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
		int valueA = 0;

		for (int i = 0; i < 50; i++) {
			if (integers[i] > valueA) {
				valueA = integers[i];
			}
		}

		System.out.println(valueA);

		System.out.println("");

		// 9 print the entire array to see if step 8 was correct

		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i]);
		}

		// 10. print the largest number in the array.

		int valueB = 100;

		for (int i = 0; i < 50; i++) {
			if (integers[i] < valueB) {
				valueB = integers[i];
			}
		}
		
		System.out.println("");
		System.out.println(valueB);
	}
}
