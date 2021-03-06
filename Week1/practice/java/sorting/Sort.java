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
				} // Selection sort
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
				if (arr[j] > arr[j + 1]) { // Bubble Sort
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1, temp = arr[i];
			while (j >= 0 && arr[j] > temp) { // Insertion Sort
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

	public static void mergeSort(int[] arr) {

		if (arr.length <= 1)
			return;

		int mid = arr.length / 2;

		int[] l = new int[mid];
		int[] r = new int[arr.length - mid]; // Merge Sort

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < mid)
				l[i] = arr[i];
			else {
				r[j] = arr[i];
				j++;
			}
		}

		mergeSort(l);
		mergeSort(r);
		merge(l, r, arr);

	}

	public static void merge(int[] l, int[] r, int[] arr) {

		int n1 = l.length;
		int n2 = r.length;

		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (l[i] < r[j]) { // Logic for merging 2 sorted arrays
				arr[k] = l[i];
				i++;
				k++;
			} else {
				arr[k] = r[j];
				k++;
				j++;
			}
		}

		while (i < n1) {
			arr[k] = l[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = r[j];
			j++;
			k++;
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void quickSort(int arr[], int f, int l) {

		if (l <= f)
			return;
		int p = partition(arr, f, l); // Quick Sort

		quickSort(arr, f, p - 1);
		quickSort(arr, p + 1, l);

	}

	public static int partition(int[] arr, int f, int l) {

		int pivot = l, i = f - 1, j = f;
		while (j < pivot) { // Logic for partitioning array w.r.t pivot element
			if (arr[j] < arr[pivot]) {
				swap(arr, ++i, j);
			}
			j++;
		}
		swap(arr, ++i, pivot);

		return i;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elements:");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Choost type of sorting:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Insertion Sort"); // Menu
		System.out.println("3. Selection Sort");
		System.out.println("4. Merge Sort");
		System.out.println("5. Quick Sort");

		int temp = sc.nextInt();

		switch (temp) {
		case 1:
			System.out.println("Given array is:");
			System.out.println(Arrays.toString(arr));
			System.out.println("The sorted array is:");
			System.out.println(Arrays.toString(Sort.bubbleSort(arr)));
			break;
		case 2:
			System.out.println("Given array is:");
			System.out.println(Arrays.toString(arr));
			System.out.println("The sorted array is:");
			System.out.println(Arrays.toString(Sort.insertionSort(arr)));
			break;
		case 3:
			System.out.println("Given array is:");
			System.out.println(Arrays.toString(arr));
			System.out.println("The sorted array is:");
			System.out.println(Arrays.toString(Sort.selectionSort(arr)));
			break;
		case 4:
			System.out.println("Given array is:");
			System.out.println(Arrays.toString(arr));
			System.out.println("The sorted array is:");
			Sort.mergeSort(arr);
			System.out.println(Arrays.toString(arr));
			break;
		case 5:
			System.out.println("Given array is:");
			System.out.println(Arrays.toString(arr));
			System.out.println("The sorted array is:");
			Sort.quickSort(arr, 0, arr.length - 1);
			System.out.println(Arrays.toString(arr));
			break;

		default:
			System.out.println("Invalid input");
		}
	}
}
