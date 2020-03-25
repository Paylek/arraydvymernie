package by.htp.jdk06.main;

import java.util.Random;
import java.util.Scanner;

public class arraydvymernie_10 {

	public static void main(String[] args) {
		
		int k = scannerInt();
		int p = scannerInt();
		int n = 5;
		int [][] arr = new int [n][n];
		arr = PrintMassiv(arr, n);
		PrintMassivEnd(arr, k, n, p);
	}
	
	public static void PrintMassivEnd(int [][] arr, int k, int n, int p) {
		
			for (int j = 0; j < n; j++) {
				System.out.print(arr[k][j] + "\t");
			}
			System.out.println();
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i][p] + "\t");
			}
			System.out.println();
		}
		
	
	

	public static int [] [] PrintMassiv(int [][] arr, int n) {

			  int [][] arr1 = new int[n][n];
				
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
		
		System.out.println("Введите строку или столбец: ");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}

	
	}
	
