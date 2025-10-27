package amna;

public class user {
int id;
String name;
void choice(){
	System.out.println("choose an option");
}
class Receotionist extends user{
	void GiveAppointment(){
		System.out.println("APPOINTMENT GIVEN BY "+ name );
	}
	void generatebill(){
		System.out.println("BILL GIVEN BY "+ name );
	}
}
class patient extends user{
	
	void paybill(){
		System.out.println("BILL payed BY "+ name );
	}
}

class doctor extends user{
	void checkpatient(){
		System.out.println("patient checked by "+ name );
	}
	
}
class billing {
	int billno;
	int pid;
	String pname;
	float billamount;
	
	billing(int billno , int pid,String pname, float billamount){
		this.billno=billno;
		this.pid=pid;
		this.pname=pname;
		this.billamount=billamount;
		
	}
	void show(){
		System.out.println("bill number "+billno+"for"+pname+":rs."+billamount );
		
	}
	
	
}
}
