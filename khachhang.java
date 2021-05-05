package ktra;
import java.util.Scanner;
public class khachhang{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		int maKhachHang;
		String tenKhachHang, soDienThoai;
		Scanner s = new Scanner(System.in);
		  System.out.println("Nhap ma khac hang");
		  maKhachHang = s.nextInt();
		  s.nextLine();
		  System.out.println("Nhap ten khach hang");
		  tenKhachHang = s.nextLine();
		  System.out.println("Nhap so dien thoai");
		  soDienThoai = s.nextLine();
	}
		 public void hienthi() {
			  System.out.println("Ho ten:" + tenKhachHang);
			  System.out.println("So dien thoai:" + soDienThoai);
			  System.out.println("Ma khach hang:" + maKhachHang);
			 
}
}