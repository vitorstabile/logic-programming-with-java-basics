import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		
		System.out.print("How many rows the matrix will be? ");
		M = sc.nextInt();
		System.out.print("How many columns the matrix will be? ");
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Element [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nTyped Matrix:");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");	
			}
			System.out.println();
		}
		
		sc.close();
	}

}
