import java.util.Scanner;
public class AddMatrices {

	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] sum = new int[3][3];
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++) {
				System.out.println("Enter arr1[" + i + "][" + j + "]:");
				arr1[i][j] = keyboard1.nextInt();
			}
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++) {
				System.out.println("Enter arr2[" + i + "][" + j + "]:");
				arr2[i][j] = keyboard2.nextInt();
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		
		System.out.println("Sum of two matrices: ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) 
				System.out.print(sum[i][j] + " ");
		System.out.println();
		}
	}

}
