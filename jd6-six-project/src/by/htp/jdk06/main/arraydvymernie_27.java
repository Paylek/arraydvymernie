package by.htp.jdk06.main;

import java.util.Random;
import java.util.Scanner;

public class arraydvymernie_27 {

	public static void main(String[] args) {
		
		int k = scannerInt();
		int m = scannerInt();
		int [][] arr = new int [10][10];
		arr = PrintMassiv(arr);
		arr = Izmenenie3(arr, k, m);
		PrintMassivEnd(arr);
	}
	
	
	public static int [] [] Izmenenie3(int [][] arr, int k, int m) {
		
		int [] arr2 = new int [10];
		for (int i = 0; i < arr.length; i++) {
			
				arr2[i] = arr[i][k];
				arr[i][k] = arr[i][m];
				arr[i][m] = arr2[i];
				
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
	
public static int scannerInt() {
 		
 		@SuppressWarnings("resource")
 		Scanner in = new Scanner(System.in);
 		
 		int number;
 		
 		System.out.println("Введите столбец: \r");
 		
 		while(!in.hasNextInt()) {
 			
 			in.next();
 			
 			System.out.println("Некорректный ввод!\r ");
 			System.out.println("Введите число: \r");
 		}
 		number = in.nextInt();
 	
 		return number;
 		
 	}
	
	}
	
