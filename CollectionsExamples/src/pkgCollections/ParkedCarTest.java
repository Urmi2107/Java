package pkgCollections;

public class ParkedCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parked_CarOwnerList l=new Parked_CarOwnerList();
		Parked_CarOwner_Details obj=new Parked_CarOwner_Details("Urmi", "Santro", "WB23456", "Kolkata",98765433);
		System.out.println(l.add_new_car(obj));
		Parked_CarOwner_Details obj1=new Parked_CarOwner_Details("Dhruba", "BMW", "WB89760", "Kolkata",98098765);
		System.out.println(l.add_new_car(obj1));
		Parked_CarOwner_Details obj2=new Parked_CarOwner_Details("ABC", "Ferrari", "WB09871", "Kolkata",98112303);
		System.out.println(l.add_new_car(obj2));
		
		l.showall();
		System.out.println("");
		l.removecar(3);
		l.showall();
		System.out.println("");
		System.out.println(l.get_parked_car_location(21));
		

	}

	}


