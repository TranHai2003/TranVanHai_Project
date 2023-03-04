package TranVanHai_12;

import java.util.Scanner;

public class TranVanHai_App_12 {
    public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int n,m;
			System.out.print("Nhap vao so hang : ");
			n = scn.nextInt();
			System.out.print("Nhap vao so cot : ");
			m = scn.nextInt();
			int a[][] = new int[n][m];
			System.out.println();
			for(int i=0; i<n ; i++) {
				for(int j=0; j<m ; j++) {
					System.out.print("Nhap vao phan tu thu a["+i+"]["+j+"] = ");
					a[i][j] = scn.nextInt();
				}
			}
			
			System.out.println("Ma tran vua nhap la : ");
			for(int i=0; i<n ; i++) {
				for(int j=0; j<m ; j++) {
					System.out.print(a[i][j]+ "     ");
				}
				System.out.println();
			}
			System.out.println();
			int Max = 0;
			for(int i=0; i<n ; i++) {
				for(int j=0; j<m ; j++) {
					if(a[i][j] > Max) {
						Max = a[i][j];
					}
				}
			}
			System.out.println("Gia tri lon nhat cua ma tran la : "+Max);
		}
	}
}
