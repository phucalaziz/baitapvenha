package Sinh_Vien;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static Scanner nhap = new Scanner(System.in);
	public static danhsachsv ds;
	public static void main(String[] args) {
	Random rd = new Random();
	System.out.println("=====Command Options: =====");
	System.out.println("1: Tạo danh sách sinh viên ngẫu nhiên");
	System.out.println("2: Xuất danh sách sinh viên hiện tại");
	System.out.println("3: Danh sách sinh viên được khen thưởng");
	System.out.println("4: Sắp xếp sinh viên theo tên");
	System.out.println("5: Sắp xếp sinh viên theo điểm TB");
	System.out.println("6: Thêm sinh viên từ bàn phím");
	System.out.println("7: Tìm kiếm theo tên");
	System.out.println("8: Cập nhật thông tin sinh viên");
	System.out.println("9: Xoá sinh viên bằng MSSV");
	System.out.println("0: Quit");
	int choice;
	do {
		choice = nhap.nextInt();
		switch (choice) {
		
		case 1:
			ds = new danhsachsv(rd.nextInt(99));
			ds.thongtin();
			break;
		case 2:
			System.out.println(String.format("%-4s %-8s %-13s %-12s %-11s %-11s %-11s %-11s %-11s %-11s",
					"STT", "MSSV","Họ và tên","Giới tính","Điểm LTH","Điểm TH","Điểm GK","Điểm CK","Điểm TB","Xếp loại"));
			ds.in();
			break;
		case 3:
			ds.dskhenthuong();
				default:
			break;
		}
	}while(choice !=0);			
	}
}
