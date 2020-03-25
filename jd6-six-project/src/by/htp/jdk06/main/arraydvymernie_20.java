package by.htp.jdk06.main;

public class arraydvymernie_20 {

	public static void main(String[] args) {
		
		int n = 10, k = 9;
		int [][] arr = new int [n][n];
		arr = PrintMassiv(arr);
		arr = Izmenenie(arr, n, k);
		PrintMassivEnd(arr);
	}
	
	public static int [] [] Izmenenie(int [][] arr, int n, int k) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[i].length - i - 1; j++) {
				
				arr[i][j] = 0;
				
			}
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= arr[i].length - i; j--) {
				
				arr[i][j] = 0;
				
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
	
	

	public static int [] [] PrintMassiv(int [][] arr) {

			  int [][] arr1 = new int[10][10];
				
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = 1;

				}
					
			}
				return arr1;
	}
	}
	
