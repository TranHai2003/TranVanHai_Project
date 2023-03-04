package TranVanHai_10;

import java.util.Scanner;

public class TranVanHai_App_10 {
    public static void main(String[] args) {
		try (Scanner str = new Scanner(System.in)) {
			String name;
			do {
				System.out.println("Nhap chuoi khong qua 80 ky tu : ");
				name = str.nextLine();	
			}while(name.length()>= 80);
			
			System.out.println("Nhap 1 ky tu bat ki : ");
			char kytu = str.next().charAt(0);
			
			int count = 0;
			for(int i=0; i<name.length();i++) {
				if(kytu == name.charAt(i)) {
					count ++;
				}
			}
			System.out.println("So lan xuat hien cua ki tu do trong chuoi la : "+count);
		}
	}
}
