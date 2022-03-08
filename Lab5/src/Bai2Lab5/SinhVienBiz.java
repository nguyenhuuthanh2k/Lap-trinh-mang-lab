package Bai2Lab5;

public class SinhVienBiz extends SinhVienPoly{

	protected double diemMarketting;
	protected double diemSales;
	
	public SinhVienBiz(String hoTen, String nganh, double diemMarketting, double diemSales) {
		super(hoTen, nganh);
		this.diemMarketting = diemMarketting;
		this.diemSales = diemSales;
	}

	@Override
	double getDiem() {
		return (2*diemMarketting+diemSales)/3;
	}
	
	
}
