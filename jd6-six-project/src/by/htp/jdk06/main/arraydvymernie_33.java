package by.htp.jdk06.main;

import java.util.Random;

public class arraydvymernie_33 {

	public static void main(String[] args) {
		
		int [][] arr = new int [10][10];
		arr = PrintMassiv(arr);

		arr = Izmenenie2(arr);
		PrintMassivEnd(arr);
	}
	
	public static int [] [] Izmenenie2(int [][] arr) {
		
		boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
            	for (int j = 0; j < arr[i].length - 1; j++)
                if(arr[i][j] > arr[i + 1][j]){
                    isSorted = false;
 
                    buf = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = buf;
                }
            }
        }
		return arr;
	}
	
public static int Izmenenie1(int [][] arr, int p) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] >= 10 && arr[i][j] <= 99 ) {
					
					p++;
					
				}
				
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
					
					arr1[i][j] = ran.nextInt(999) ;

				}
					
			}
				return arr1;
	}
	}
	
