import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		int avg = 0;
		for (int i=0; i<10; i++) {
			System.out.println("Enter the " + i + " element:");
			arr[i] = keyboard.nextInt();
			sum += arr[i];
		}
		avg = sum/10;
		for (int i = 9; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
		System.out.print("Array after sorted: ");
		for (int i=0; i<10; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average of array elements: " + avg);
	}

}
