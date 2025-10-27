package amna;

import amna.user.Receotionist;
import amna.user.billing;


public class mainc {
	public static void main(String args[]){
		user u =new user();
		u.choice();
		
		Receotionist r =new Receotionist();
		r.id=1;
		r.name="amna";
	
		doctor d =new doctor();
		d.id=2;
		d.name="hassan";
		
	
		patient p =new patient();
		p.id=9;
		p.name="muzammil";
		
		billing b = new billing(1,p.id,p.name,500);
		
		r. GiveAppointment();
		d.checkpatient();
		r.generatebill();
		b.show();
		p.paybill();
			
	}

	
}




