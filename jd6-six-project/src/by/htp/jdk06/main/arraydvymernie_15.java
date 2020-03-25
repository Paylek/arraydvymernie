package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_15 {

	public static void main(String[] args) {
		
		int n = 10, k = 9;
		int [][] arr = new int [n][n];
		arr = PrintMassiv(arr);
		arr = Izmenenie(arr, n, k);
		PrintMassivEnd(arr);
	}
	
	public static int [] [] Izmenenie(int [][] arr, int n, int k) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (i == j) {
					
					arr[i][j] = arr.length - i;
					
				}
				
				else {
					
					arr[i][j] = 0;
					
				}
				
			}
		}
		return arr;
	}
	
	public static void PrintMassivEnd(int [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
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
	
