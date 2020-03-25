package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_01 {

	public static void main(String[] args) {
		
		int [][] arr = new int [3][4];
		arr = PrintMassiv(arr);
		arr = VivodMassiva(arr);
		PrintMassivEnd(arr);
	}
	
	public static void PrintMassivEnd(int [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static int [] [] VivodMassiva(int [][] sourse) {
		
		for (int i = 0; i < sourse.length; i++) {
			
			for (int j = 0; j < sourse[i].length; j++) {
				
				if (i == 0) {
					
					sourse[i][j] = 1;
					
				}
				else {
					
					sourse[i][j] = 0;
					
				}
				
			}
			
		}
		
		return sourse;
		
	}

	public static int [] [] PrintMassiv(int [][] arr) {

			  int [][] arr1 = new int[3][4];
				
				Random ran = new Random();
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = ran.nextInt(10) ;

				}
					
			}
				return arr1;
	}
	}
	
