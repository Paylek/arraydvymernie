package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_26 {

	public static void main(String[] args) {
		
		int p = 0, max = 0, max1 = 0, min1 = 0, max2 = 0, min2 = 0;
		int [][] arr = new int [10][10];
		arr = PrintMassiv(arr);
		p = Izmenenie1(arr, p);
		System.out.println("Сумма отрицательных: " + p);
		Izmenenie2(arr, max);
		Izmenenie3(arr, max1, min1, max2, min2);
		PrintMassivEnd(arr);
	}
	
public static int Izmenenie1(int [][] arr, int p) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] < 0) {
					
					p += arr[i][j];
					
				}
				
			}
		}
		return p;
	}

public static void Izmenenie2(int [][] arr, int max) {
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 1; j < arr[i].length; j++) {
			
			if (arr[i][j - 1] > arr[i][j]) {
				
				max = arr[i][j - 1];
				
			}
			
			else {
				
				max = arr[i][j];
				
			}
			
		}
		System.out.println("Максимальный элемент " + i + " строки: " + max);
	}
}

public static void Izmenenie3(int [][] arr, int max1, int min1, int max2, int min2) {
	
	int y = 0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 1; j < arr[i].length; j++) {
			
			if (arr[i][j - 1] > arr[i][j]) {
				
				max1 = i;
				max2 = j - 1;
				
			}
			
			else {
				
				max1 = i;
				max2 = j;
				
			}
			
			if (arr[i][j - 1] < arr[i][j]) {
				
				min1 = i;
				min2 = j - 1;
				
			}
			
			else {
				
				min1 = i;
				min2 = j;
				
			}
		}
	}
	y = arr[max1][max2];
	arr[max1][max2] = arr[min1][min2];
	arr[min1][min2] = y;
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
	
