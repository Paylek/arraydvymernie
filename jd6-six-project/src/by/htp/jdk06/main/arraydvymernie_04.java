package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_04 {

	public static void main(String[] args) {
		
		int n = 6, m = 9;
		int [][] arr = new int [n][m];
		arr = PrintMassiv(arr);
		PrintMassivEnd(arr, m);
	}
	
public static void PrintMassivEnd(int [][] arr, int m) {
		
		for (int i = 0; i < m; i++) {
				System.out.print(arr[0][i] + "\t");
		}
			System.out.println();
			
			for (int i = 0; i < m; i++) {
				System.out.print(arr[arr.length - 1][i] + "\t");
			}
		
	}

	public static int [] [] PrintMassiv(int [][] arr) {

			  int [][] arr1 = new int[6][9];
				
				Random ran = new Random();
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
						
					
					arr1[i][j] = ran.nextInt(10) ;
					
					}
					
			}
				return arr1;
	}
	}
	
