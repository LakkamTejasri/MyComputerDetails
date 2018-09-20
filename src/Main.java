package mycomputer1;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer();
		System.out.println("//***COMPUTER NAME***//");
		System.out.println("COMPUTER NAME: "+(c.co_name="apple"));
		System.out.println();
		 
		c.ccc=new Cpu();
		System.out.println("//***CPU DETAILS IN COMPUTER***//");
		System.out.println("CPU SPEED: " +(c.ccc.cpu_Speed="10ghb"));
		System.out.println("CPU TYPE: " +(c.ccc.cpu_type="Intel"));
		System.out.println("CPU ID : " +(c.ccc. cpu_id="CPU_Z"));
		System.out.println("CPU QUALITYRATE: " +(c.ccc.qulity_rating=4));
		System.out.println("CPU WARRANTYPERIOD " +(c.ccc. warranty_period="1year"));
		System.out.println();
		
		c.kb=new KeyBoard();
		System.out.println("//***KEYBOARD DETAILS IN COMPUTER***//");
		System.out.println("KEYBOARD ID: "+(c.kb. key_id="Key-ID U2F"));
		System.out.println("KEYBOARD QUALITY RATE: "+(c.kb.key_qulity_rating=4));
		System.out.println("KEYBOARD WARRATNTYPERIOD: "+(c.kb. key_warranty_period="1year"));
		System.out.println();
		
		c.m=new Mouse();
		System.out.println("//***MOUSE DETAILS IN COMPUTER***//");
		System.out.println("MOUSE TYPE: "+(c.m.type="mice"));
		System.out.println("MOUSE ID: "+(c.m.id="mouse_Z"));
		System.out.println("MOUSE QUALITYRATE: "+(c.m.qualityrating=4));
		System.out.println("MOUSE WARRANTY PERIOD: "+(c.m. warrentyperiod="1year"));
		System.out.println();
		
		c.mn=new Monitor();
		System.out.println("//***MONITOR DETAILS IN COMPUTER***//");
		c.mn.size=new String[]{"width:12w,hight:4h"};
		
		for(int i=0;i<c.mn.size.length;i++ )
		{
		System.out.println("MONITOR SIZE:"+(c.mn.size[i]));
		}
		System.out.println("MONITOR SPEED: "+(c.mn.mo_Speed="10ghb"));
		System.out.println("MONITOR TYPE: "+(c.mn.mo_type="Intel"));
		System.out.println("MONITOR ID: "+(c.mn. mo_id="moni_Z"));
		System.out.println("MONITOR QUALITY RATE: "+(c.mn.mo_qulity_rating=4));
		System.out.println("MONITOR WARRENTY PERIOD: "+(c.mn.mo_warranty_period="1year"));
		System.out.println();
		
		c.mb=new MotherBoard();
		System.out.println("//***MOTHERBOARD DETAILS IN COMPUTER***//");
		System.out.println("MOTHERBOARD SPEED: "+(c.mb.moth_Speed="10ghb"));
		System.out.println("MOTHERBOARD TYPE: "+(c.mb.moth_type="Intel"));
		System.out.println("MOTHERBOARD ID: "+(c.mb. moth_id="CPU_Z"));
		System.out.println("MOTHERBORAD QUALITY RATE: "+(c.mb.moth_qulity_rating=4));
		System.out.println("MOTHE BORAD WARRANTY PERIOD: "+(c.mb.moth_warranty_period="1year"));
		System.out.println();
		
		c.r=new Ram();
		System.out.println("//***RAM DETAILS IN COMPUTER***//");
		System.out.println("RAM SPEED : "+(c.r.ram_Speed="10ghb"));
		
		System.out.println("RAM ID :"+(c.r.ram_id="ram_Z"));
		System.out.println("RAM RATING : "+(c.r.ram_rating=4));
		System.out.println("RAM WARRENTY PERIOD : "+(c.r.ram_warranty_period="1year"));
		System.out.println();

		Company cc=new Company();
		cc =new Company();
		System.out.println("//***COMPANY PROFILE ***//");
		System.out.println("COMPANY ID : "+(cc. c_id=222));
		System.out.println("COMPANY MAIL : "+(cc. c_email="lakkamtejasri@gmail.com"));
		System.out.println("COMPANY NAME : "+(cc. c_name="tejasri"));
		System.out.println();
		
		cc.ads=new Address();
		System.out.println("//***COMPANY ADDRESS***//");
		System.out.println("COMPANY PICODE : "+(cc.ads.pincode=234));
		System.out.println("COMPANY STEET : "+(cc.ads.streat="Srnagar"));
		System.out.println("COMPANY CITY : "+(cc.ads.city="hyderabd"));
		System.out.println("COMPANY STATE : "+(cc.ads.state="telangana"));
		System.out.println();
		
    	Cpu ccc=new Cpu();
		
		ccc.b=new Bill();
		System.out.println("//***CPU BILL***//");
		System.out.println("CPU ID : "+(ccc.b.b_id=12334));
		System.out.println("CPU SERVIECE TAX : "+(ccc.b.b_Serv_tax=1000));
		System.out.println("CPU TRANP TAX : "+(ccc.b. b_transp_tax=2000));
		System.out.println("CPU CETRAL TAX : "+(ccc.b.b_centra_tax=3000));
		System.out.println();
		
		KeyBoard ke=new KeyBoard();

		ke.b=new Bill();
		System.out.println("//***KEYBOARD BILL***//");
		System.out.println("KEYBOARD ID : "+(ke.b.b_id=12334));
		System.out.println("KEYBOARD SERVICE TAX : "+(ke.b.b_Serv_tax=1000));
		System.out.println("KEYBOARD TRANSPORT TAX : "+(ke.b. b_transp_tax=2000));
		System.out.println("KEYBOARD CENTRAL TAX : "+(ke.b.b_centra_tax=3000));
		System.out.println();
		
		Mouse m=new Mouse();
		m.bb=new Bill();
		System.out.println("//***MOUSE BILL***//");
		System.out.println("MOUSE ID : "+(m.bb.b_id=12334));
		System.out.println("MOUSE SERVICE TAX : "+(m.bb.b_Serv_tax=1000));
		System.out.println("MOUSE TRANSPORT TAX : "+(m.bb. b_transp_tax=2000));
		System.out.println("MOUSE CENTRAL TAX : "+(m.bb.b_centra_tax=3000));
		System.out.println();
		

		Ram r=new Ram();
		

		r.b=new Bill();
		System.out.println("//***RAM BILL***//");
		System.out.println("RAM ID : "+(r.b.b_id=1234));
		System.out.println("RAM SERVECE TAX : "+(r.b.b_Serv_tax=150));
		System.out.println("RAM TRANSPORT TAX : "+(r.b. b_transp_tax=1000));
		System.out.println("RAM CENTRAL TAX : "+(r.b.b_centra_tax=8000));
		System.out.println();
		

		Monitor mm=new Monitor();

		mm.b=new Bill();
		System.out.println("//***MONITOR BILL***//");
		System.out.println("MONITOR ID : "+(mm.b.b_id=123));
		System.out.println("MONITOR SERVICE TAX : "+(mm.b.b_Serv_tax=100));
		System.out.println("MONITOR TARANSPORT TAX : "+(mm.b. b_transp_tax=200));
		System.out.println("MONITOR CENTRAL TAX : "+(mm.b.b_centra_tax=300));
		System.out.println();
		
		
		MotherBoard m1=new MotherBoard();
		

		m1.b=new Bill();
		System.out.println("//***MOTHER BORAD BILL***//");
		System.out.println("MOTHERBOARD  ID : "+(m1.b.b_id=122));
		System.out.println("MOTHER BOARD SERVICE TAX : "+(m1.b.b_Serv_tax=2000));
		System.out.println("MOTHER BOARD TRANSPORT TAX : "+(m1.b. b_transp_tax=4000));
		System.out.println("MOTHER BOARD CENTRAL TAG TAX : "+(m1.b.b_centra_tax=6000));
		

	}

}
