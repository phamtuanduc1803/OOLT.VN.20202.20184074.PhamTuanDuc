import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao chieu cao cua thap hinh sao:");
		int iStar = keyboard.nextInt();
		for(int i=0; i<iStar; i++) {
			for (int j=0; j<2*iStar; j++) {
				if(j < iStar-i-1)
					System.out.print(" ");
				else if(iStar-i-1<=j && j<iStar+i)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
