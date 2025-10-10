import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VehicleArray {
	static VehicleService []vArr;
	static int cnt;
	
	static {
		vArr = new VehicleService[100];
		vArr[0] = new VehicleService(101,"Hello","2",new Date(2020,10,21));
		vArr[1] = new VehicleService(102,"World","2",new Date(2000,11,00));
		cnt =2;
	}
	static boolean addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vid");
		int vid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of owner");
		String oname = sc.nextLine();
		System.out.println("Enter vehicle type");
		String vtype = sc.nextLine();
		System.out.println("Enter Purchase date eg(DD/MM/YYYY)");
		String pDate = sc.next();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		
		Date pd = null;
		try{
			pd = sd.parse(pDate);
		}catch(Exception ie) {
			ie.printStackTrace();
		}
		VehicleService vs = new VehicleService(103,"Bye","2",new Date(2025,10,30));
		vArr[cnt] = vs;
		cnt++;
		if(cnt == vArr.length)
			return false;
		else
			return true;
	}
	static void displayObjectArray() {
		for(int i=0;i<cnt;i++) {
			System.out.println(vArr[i]);
		}
		System.out.println();
	}
}
