import java.util.Date;

public class Vehicle {
	public static void main(String[] arg) {
		VehicleService v1 = new VehicleService(001,"Linmay","4 wheeler",new Date() );
		System.out.println(v1);
		boolean status = VehicleArray.addData();
		if(status)
			System.out.println("Data Added Successfully...");
		else
			System.out.println("Error : Server is busy... Try Again Later");
		
		VehicleArray.displayObjectArray();
	}
}
