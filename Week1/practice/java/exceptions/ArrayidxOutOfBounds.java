package practice.java.exceptions;

import java.util.Arrays;

public class ArrayidxOutOfBounds {

	public static void main(String[] args) {
		int arr[] = new int[20];

		try {
			Arrays.fill(arr, 25);
			for (int i = 0; i <= arr.length + 5; i++)
				System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
			System.out.println("We tried to access an array index that doesnt exist");
		}

	}

}
