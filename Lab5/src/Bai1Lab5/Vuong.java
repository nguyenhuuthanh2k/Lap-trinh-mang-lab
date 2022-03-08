package Bai1Lab5;

public class Vuong extends ChuNhat{
	
	public Vuong(double canh) {
		super(canh,canh);
	}
	
	public void xuat() {
		System.out.printf("Dien tich Vuong: "+getDienTich());
		 System.out.printf("Chu vi Vuong: "+getChuVi());
	}
}