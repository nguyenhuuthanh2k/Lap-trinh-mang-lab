package Lab1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		float diem;
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Ho va ten: ");
		name = nhap.nextLine();
		System.out.print("Diem: ");
		diem = nhap.nextFloat();
		System.out.printf("Ten sinh vien: %s | Diem: %.2f",name,diem);
	}

}
