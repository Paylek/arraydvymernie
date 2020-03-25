package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_28 {

	public static void main(String[] args) {
		
		int n = 10, max = 0;
		int [][] arr = new int [n][n];
		int [] arr1 = new int[n];
		arr = PrintMassiv(arr);
		arr1 = Izmenenie(arr, max, arr1);
		max = IzmenenieOdnomernii(arr1, max);
		PrintMassivEnd(arr, max);
	}
	
	public static int IzmenenieOdnomernii(int [] arr1, int max) {
		
		for (int i = 1; i < arr1.length; i++) {
			
			if (arr1[i - 1] > arr1[i]) {
				
				max = arr1[i - 1];
				
			}
			
			else {
				
				max = arr1[i];
				
			}
			
		}
		return max;
		
	}
	
	public static int[] Izmenenie(int [][] arr, int max, int [] arr1) {
		
		
		for (int i = 0; i < arr.length; i++) {
			max = 0;
			for (int j = 0; j < arr[i].length; j++) {
				
				max += arr[i][j];
				
			}
			arr1[i] = max;
		}
		return arr1;
	}
	
	public static void PrintMassivEnd(int [][] arr, int max) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Максимальная сумма: " + max);
		
	}
	
	

	public static int [] [] PrintMassiv(int [][] arr) {

		  int [][] arr1 = new int[10][10];
			
			Random ran = new Random();
			
			for (int i = 0; i < arr1.length; i++) {
				
				for(int j = 0; j < arr1[i].length; j++) {
					
				
				arr1[i][j] = ran.nextInt(10) ;
				
				}
				
		}
			return arr1;
}
	}
	
