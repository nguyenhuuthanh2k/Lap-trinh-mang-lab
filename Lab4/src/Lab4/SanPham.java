package Lab4;

import java.util.Scanner;

public class SanPham {

	private String tenSP;
	private double donGia;
	private double giamGia;
	
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public SanPham(String tenSP, double donGia, double giamGia) {
		this.tenSP=tenSP;
		this.donGia=donGia;
		this.giamGia=giamGia;
	}
	
	
	public SanPham(String tenSP, double donGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	public SanPham() {
	}
	
	private double getThueNhapKhau() {
		return donGia*0.1;
	}
	
	public void xuat() {
		System.out.println("Ten SP" +tenSP);
		System.out.println("Don gia SP: " +donGia);
		System.out.println("Giam gia: " +giamGia);
		System.out.println("Thue nhap khau: " + getThueNhapKhau());
	}
	public void nhap() {
		Scanner nhap=new Scanner(System.in);
		
		System.out.print("Nhap ten SP: ");
		tenSP = nhap.nextLine();
		
		System.out.print("Nhap gia SP: ");
		donGia = nhap.nextDouble();
		
		System.out.print("Nhap giam gia: ");
		giamGia = nhap.nextDouble();
	}
}
