package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_30 {

	public static void main(String[] args) {
		
		int p = 0;
		int [][] arr = new int [10][10];
		arr = PrintMassiv(arr);
		PrintMassivEnd(arr);
		p = Izmenenie1(arr, p);
	}
	
public static int Izmenenie1(int [][] arr, int p) {
		
		for (int i = 0; i < arr.length; i++) {
			p = 0;
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] == 5 ) {
					
					p++;
					
				}
				
			}
			if (p >= 3) {
				
				System.out.println("������ � ����������� ����� 5: " + i);
				
			}
		}
		return p;
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

			  int [][] arr1 = new int[10][20];
				
				Random ran = new Random();
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = ran.nextInt(15) ;

				}
					
			}
				return arr1;
	}
	}
	
