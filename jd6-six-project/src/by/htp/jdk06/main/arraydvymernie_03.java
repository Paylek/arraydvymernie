package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_03 {

	public static void main(String[] args) {
		
		int [][] arr = new int [6][9];
		arr = PrintMassiv(arr);
		PrintMassivEnd(arr);
	}
	
public static void PrintMassivEnd(int [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][0] + "\t" + arr[i][arr[i].length - 1] + "\t");
			System.out.println();
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
	
