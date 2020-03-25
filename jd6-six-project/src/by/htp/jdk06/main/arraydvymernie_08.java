package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_08 {

	public static void main(String[] args) {
		
		int [][] arr = new int [5][5];
		int p = 0;
		arr = PrintMassiv(arr);
		p = PrintMassivEnd(arr, p);
		Print(p);
	}
	
	public static void Print(int p) {
		
		System.out.println("Количество повторений числа 7: " + p);
		
	}
	
	public static int PrintMassivEnd(int [][] arr, int p) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] == 7) {
					
					p++;
					
				}
				
			}
		}
		
		return p;
		
	}
	
	

	public static int [] [] PrintMassiv(int [][] arr) {

			  int [][] arr1 = new int[5][5];
				
				Random ran = new Random();
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = ran.nextInt(10);

				}
					
			}
				return arr1;
	}
	}
	
