package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_36 {
	public static void main(String[] args) {

		int[][] arr = new int[2][2];
		int[][] newarr = new int[2][2];

		arr = initArray(arr);
		printAll(arr);
		System.out.println();

		newarr = initNewArray(arr, newarr);
		printAll(newarr);

	}

	private static int[][] initArray(int[][] arr) {

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = rand.nextInt(9);
			}
		}

		return arr;
	}

	private static int[][] initNewArray(int[][] arr, int[][] newarr) {

		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr[i].length; j++) {

				if (j == 0 && i == 0) {
					newarr[i][j] = (arr[i][j + 1] + arr[i + 1][j]) / 2;
				} else if (i == 0 && j == arr[i].length - 1) {
					newarr[i][j] = (arr[i][j - 1] + arr[i + 1][j]) / 2;
				} else if (i == 0 && j != 0 && j != arr[i].length - 1) {
					newarr[i][j] = (arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j]) / 3;
				} else if (j == 0 && i != 0 && i != arr.length - 1) {
					newarr[i][j] = (arr[i - 1][j] + arr[i][j + 1] + arr[i + 1][j]) / 3;
				} else if (i == arr.length - 1 && j == 0) {
					newarr[i][j] = (arr[i - 1][j] + arr[i][j + 1]) / 2;
				} else if (i == arr.length - 1 && j != 0 && j != arr[i].length - 1) {
					newarr[i][j] = (arr[i - 1][j] + arr[i][j - 1] + arr[i][j + 1]) / 3;
				} else if (i == arr.length - 1 && j == arr[i].length - 1) {
					newarr[i][j] = (arr[i][j - 1] + arr[i - 1][j]) / 2;
				} else if (j == arr[i].length - 1 && i != 0 && i != arr.length - 1) {
					newarr[i][j] = (arr[i - 1][j] + arr[i][j - 1] + arr[i + 1][j]) / 3;
				}else if (j != arr[i].length - 1 && i != 0 && i != arr.length - 1 && j != 0) {
					newarr[i][j] = (arr[i - 1][j] + arr[i][j - 1] + arr[i + 1][j] + arr[i][j + 1]) / 4;
				}		
			}
		}

		return newarr;
	}

	private static void printAll(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");

			}
			System.out.println();
		}

	}
}
