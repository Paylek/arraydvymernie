package by.htp.jdk06.main;

public class arraydvymernie_24 {

	public static void main(String[] args) {
		
		int n = 10;
		int [][] arr = new int [n][n];
		int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		arr = PrintMassiv(arr, arr2);
		arr = Izmenenie(arr);
		PrintMassivEnd(arr);
	}
	
	public static int [] [] Izmenenie(int [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = (int) Math.pow(arr[i][j], i + 1);
				
			}
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
	
	

	public static int [] [] PrintMassiv(int [][] arr, int [] arr2) {

			  int [][] arr1 = new int[10][10];
				
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = arr2[j];

				}
					
			}
				return arr1;
	}
	}
	
