package Sinh_Vien;

import java.text.DecimalFormat;
import java.util.Random;

public class danhsachsv {
	private sinhvien[] ds;
	private int sosinhvien;
	public danhsachsv(int n){
		if(n > 0)
			ds = new sinhvien[n];
		else
			ds = new sinhvien[10];
		sosinhvien = 0;
	}
	public void thongtin() {
		Random rd = new Random();
		DecimalFormat df = new DecimalFormat("00000");
		String[] gioitinh = {
				"Nam","Nữ"	
		};
		String[] dsho = {
				"Nguyễn ", "Trần ", "Lê ", "Hồ ", "Dương ", "Lý ", "Ngô ", "Lưu ", "Phan ", "Đặng ", "Kiều ", "Đậu ",
				"Mạc ", "Châu ", "Đinh "
		};
		String[] dsten = {
				"An", "Anh", "Bình", "Bảo", "Chánh", "Cường", "Duy", "Dũng", "Giang", "Giáp", "Hiếu", "Hiệp",
				"Hoan", "Hoàn", "Huy", "Hân", "Hùng", "Hưng", "Hường", "Hạ", "Hải", "Hậu", "Kha", "Khang", "Khánh", "Khải", "Kim",
				"Kiện", "Lai", "Luân", "Lân", "Minh", "Mạnh", "Nam", "Nghĩa", "Nguyên", "Nhàn", "Nhân", "Nhựt", "Ny", "Phi", "Phong",
				"Phát", "Phúc", "Phương", "Quang", "Quân", "Quốc", "Sang", "Sách", "Sơn", "Thao", "Thiên", "Thiêng", "Thiện", "Thọ",
				"Thành", "Thông", "Thương", "Thạnh", "Thảo", "Thắng", "Thịnh", "Thọ", "Tiến", "Trí", "Trường", "Tuyết", "Tuyền", "Tuân",
				"Tuấn", "Tài", "Tâm", "Tân", "Tùng", "Tú", "Tới", "Tự", "Vi", "Vinh", "Việt", "Vĩ", "Vũ", "Vượng", "Vửng", "Xương", "Ân", "Đạt",
				"Đức"
		};
		int bien=0;
		for (int i=0;i<ds.length; i++){
			String ms = df.format(rd.nextInt(100000));
			String ho = dsho[rd.nextInt(dsho.length)];
			String ten = dsten[rd.nextInt(dsten.length)];
			String gt = gioitinh[rd.nextInt(gioitinh.length)];
			float sub1 = rd.nextInt(11);
			float sub2 = rd.nextInt(11);
			float sub3 = rd.nextInt(11);
			float sub4 = rd.nextInt(11);
			sinhvien sv = new sinhvien(bien++,ms,ho,ten,gt,sub1,sub2,sub3,sub4);
			ds[i] = sv;
			sosinhvien++;
		};
	}
		
	public void in() {
		for (sinhvien sv : ds) {
			if(sv != null)
				System.out.println(sv);
		}
		System.out.println("\nTổng số sinh viên là: " + sosinhvien);
	}
	
	public void dskhenthuong(){
		sosinhvien = 0;
		System.out.println("Danh sách học sinh được khen thưởng: ");
		for (sinhvien sv1 : ds) {
			if(sv1.khenthuong()==true){
				System.out.println(sv1);
				sosinhvien++;
			}
			
		}
		if(sosinhvien == 0) 
			System.out.println("\nTổng số sinh viên được khen thưởng là: " + sosinhvien);	
				else
					System.out.println("\nTổng số sinh viên được khen thưởng là: " + sosinhvien);
	}
	}

