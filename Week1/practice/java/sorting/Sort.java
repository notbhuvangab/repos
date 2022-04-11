package practice.java.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int idx = i, temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					idx = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		return arr;
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j = i-1,temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	
	public static void mergeSort(int[] arr,int n) {
		int mid = n/2;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elements:");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Sort.insertionSort(arr)));

	}

}