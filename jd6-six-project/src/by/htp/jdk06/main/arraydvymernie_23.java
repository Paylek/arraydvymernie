package by.htp.jdk06.main;

public class arraydvymernie_23 {

	public static void main(String[] args) {
		
		int n = 3, p = 0;
		double [][] arr = new double [n][n];
		arr = PrintMassiv(arr, n);
		PrintMassivEnd(arr);
		KolichPolozit(arr, p);
	}
	
public static void KolichPolozit(double [][] arr, int p) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 0) {
					p++;
				}
			}
		}
		
		System.out.println("Количество положительных: " + p);
		
	}
	
	public static void PrintMassivEnd(double [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	

	public static double [] [] PrintMassiv(double [][] arr, int n) {

			  double [][] arr1 = new double[n][n];
				
				for (int i = 0; i < arr1.length; i++) {
					
					for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = Math.sin((i * i - j * j) / n) ;

				}
					
			}
				return arr1;
	}
	}
	
