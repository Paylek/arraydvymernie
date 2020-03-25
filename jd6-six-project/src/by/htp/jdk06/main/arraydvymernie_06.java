package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_06 {

	public static void main(String[] args) {
		
		int [][] arr = new int [10][10];
		arr = PrintMassiv(arr);
		PrintMassivEnd(arr);
	}
	
	public static void PrintMassivEnd(int [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j % 2 == 1 && arr[0][j] > arr[arr.length - 1][j])
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
	
