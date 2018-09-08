package Sinh_Vien;

public class sinhvien {
	private String ms;
	private String ho;
	private String ten;
	private String gt;
	private float sub1;
	private float sub2;
	private float sub3;
	private float sub4;
	private int bien;
		
	public sinhvien(){
		this(0,"","","","",0,0,0,0);
	}
	
	public sinhvien(int bien,String ms, String ho, String ten, String gt, float sub1, float sub2, float sub3, float sub4) {
		super();
		//this.ms = ms;
		//this.ho = ho;
		//this.ten = ten;
		//this.gt = gt;
		//this.sub1 = sub1;
		//this.sub2 = sub2;
		//this.sub3 = sub3;
		//this.sub4 = sub4;
		setMs(ms);
		setHoten(ho,ten);
		setGt(gt);
		setSub1(sub1);
		setSub2(sub2);
		setSub3(sub3);
		setSub4(sub4);
	}
	
	public String getMs() {
		return ms;
	}

	public void setMs(String ms) {
		if(ms != null && !ms.trim().equals(""))
			this.ms = ms;
		else
			this.ms="unknown";
	}

	public String getHo() {
		return ho;     
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setHoten(String ho,String ten) {
		if((ho != null && !ho.trim().equals("")) && (ten != null && !ten.trim().equals(""))) {
			this.ho = ho;
			this.ten = ten; 
		}
			else {
				this.ho="";
				this.ten= "unknown";
			}
	}
		
	public String getGt() {
		return gt;
	}

	public void setGt(String gt) {
		if(gt != null && !gt.trim().equals("")) {
			if(gt.equalsIgnoreCase("Nam") || gt.equalsIgnoreCase("Nữ")) 
				this.gt = gt ;
			else
				this.gt = "unknown";
		}
		else
			this.gt = "unknown";
	}

	public float getSub1() {
		return sub1;
	}

	public void setSub1(float sub1) {
		if(sub1<0 || sub1>10)
			this.sub1 = 0;
		else
			this.sub1 = sub1;
	}

	public float getSub2() {
		return sub2;
	}

	public void setSub2(float sub2) {
		if(sub2<0 || sub2>10)
			this.sub2 = 0;
		else
			this.sub2 = sub2;
		
	}

	public float getSub3() {
		return sub3;
	}

	public void setSub3(float sub3) {
		if(sub3<0 || sub3>10)
			this.sub3 = 0;
		else
			this.sub3 = sub3;
		
	}

	public float getSub4() {
		return sub4;
	}

	public void setSub4(float sub4) {
		if(sub4<0 || sub4>10)
			this.sub4 = 0;
		else
			this.sub4 = sub4;
		
	}

	public float diemtb() {
		float tb;
		tb=((sub1+sub2+sub3+sub4)/4);
		return tb;		
	}
			
	public String rank() {
		String xeploai;
		if(diemtb()<0 || diemtb()>10) 
			xeploai = "Không xác định";
				else 
					if (diemtb()>=8) 
						xeploai = "Giỏi";
							else 
								if(diemtb()>=6 && diemtb()<8) 
									xeploai = "Khá";
										else 
											if(diemtb()>=4.5 && diemtb()<6) 
												xeploai = "Trung bình";
													else
														xeploai = "Yếu";
	return xeploai;	
	}
	
	public String hovaten(){
		String hovaten;
		hovaten=ho.concat(ten);
		return hovaten;
	}
	
	public float diemmin() {
		float min;
		if (sub1<sub2) 
			min=sub1;
				else
					min=sub2;
		if (min>sub3) 
			min=sub3;
				else
					if (min>sub4) 
						min=sub4;
		
		return min;
	}
	
	
	public int diemliet() { 
		int tongcacmonliet=0;
		float[] diem = new float [4];
		diem[0] = sub1;
		diem[1] = sub2;
		diem[2] = sub3;
		diem[3] = sub4;
		for(int i=0;i<4;i++) {
			if (diem[i]<3)
				tongcacmonliet++;
		}
		return tongcacmonliet;
	}
	
	
	public boolean khenthuong() {
		if ((diemtb()>=7.5) && (diemliet()==0))
			return true;
			return false;
	}	
	
	public String toString() {
		return String.format("%-5s%-8s %-13s %-12s %-11s %-12s%-12s%-12s%-12s%s",bien,ms,hovaten(),gt,sub1,sub2,sub3,sub4,diemtb(),rank());
	}	
}


