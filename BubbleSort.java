package basic_assignments;

import java.util.Arrays;

public class BubbleSort {
	static void bubble(int[] numbers) {
		int n = numbers.length;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(numbers[j-1] > numbers[j]) {
					temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}


public static void main(String[] args) {
	int numbers[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	System.out.println("Before Bubble sort:");
	for(int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]+ " ");
	}
	System.out.println();
	bubble(numbers);
	System.out.println("After Bubble sort:");
	for(int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i] + " ");
	}
}
}
