package Lab1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nhap = new Scanner(System.in);
		
		float canh;
		
		System.out.print("Nhap canh cua hinh lap phuong:");
		canh = nhap.nextFloat();
		
		System.out.println("The tich hinh lap phuong: "+Math.pow(canh,3));
	}

}
