package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_29 {

	public static void main(String[] args) {
		
		int n = 10;
		int [][] arr = new int [n][n];
		int [] arr1 = new int[n];
		arr = PrintMassiv(arr);
		arr1 = Izmenenie(arr, arr1);
		PrintMassivEnd(arr1);
	}
	
	public static int[] Izmenenie(int [][] arr, int [] arr1) {
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (i == j && arr[i][j] > 0) {
					
					arr1[i] = arr[i][j];
					
				}
				
			}
		}
		return arr1;
	}
	
	public static void PrintMassivEnd(int [] arr1) {
		
		for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + "\t");
			}
			System.out.println();
		
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
	
