package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_11 {

	public static void main(String[] args) {
		
		int [][] arr = new int [5][5];
		arr = PrintMassiv(arr);
		PrintMassivEnd(arr);
	}
	
	public static void PrintMassivEnd(int [][] arr) {
		int i = 0, j = 0;
		for (i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
			for (j = arr[i].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
			}
			else {
				
				for (j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				
			}
				System.out.println();
	}
		}
}
	
	

	public static int [] [] PrintMassiv(int [][] arr) {

			  int [][] arr1 = new int[5][5];
				
				Random ran = new Random();
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = ran.nextInt(10) ;

				}
					
			}
				return arr1;
	}
	}
	
