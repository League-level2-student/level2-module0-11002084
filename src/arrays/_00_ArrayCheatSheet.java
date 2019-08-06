package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String[] farmAnimals = {"pig", "cow", "sheep", "chicken", "duck"};
		
		//2. print the third element in the array
		
		System.out.println(farmAnimals[2]);
		
		//3. set the third element to a different value
		
		farmAnimals[2]= "goat";
		
		//4. print the third element again
		
		System.out.println(farmAnimals[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(int i=0; i<farmAnimals.length; i++) {
			System.out.println(farmAnimals[i]);
		}
		
		//6. make an array of 50 integers
		
		int[] integers = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		
		Random rand = new Random();
		for(int i=0; i<integers.length; i++) {
			integers[i]= rand.nextInt(100);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int valueA;
		int valueB;
		
		for(int i=0; i<50; i++) {
			for(int j=0; j<50; j++) {
				if(integers[i]>integers[j]) {
					valueA=integers[i];
				}else if(integers[j]>integers[i]) {
					valueB=integers[j];
				}
			}
		}
		
		System.out.println();
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
