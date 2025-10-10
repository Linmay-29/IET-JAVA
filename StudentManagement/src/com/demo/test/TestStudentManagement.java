package com.demo.test;
import java.util.List;
import java.util.Scanner;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImp;
import com.demo.beans.Student;
public class TestStudentManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService sservice=new StudentServiceImp();
		int choice=0;
		do {
			System.out.print("1. add new student\n 2. display all\n3. search by id");
			System.out.print("\n4. Search by name \n5. delete by id \n6. delete by name\n");
			System.out.println("7. update by id \n 8. find all avg \n9. Sort By Id \n10. Sort by name \n11. sort by avg \n12.exit \n choice: ");
			choice=sc.nextInt();
								
				switch(choice) {
				case 1->{
					boolean status=sservice.addNewStudent();
					if(status) {
						System.out.println("added successfully");
					}else {
						System.out.println("not found");
					}
				}
				case 2->{
					sservice.displayAll();
				}
				case 3->{
					System.out.println("Enter id for search");
					int eid=sc.nextInt();
					Student s=sservice.searchById(eid);
					if(s!=null) {
						System.out.println(s);
					}else {
						System.out.println("not found");
					}
				}
				case 4->{
					System.out.println("Enter name for searching");
					String nm=sc.next();
					List<Student> elst=sservice.searchByName(nm);
					if(elst!=null) {
						elst.forEach(System.out::println);
					}else{
						System.out.println("not found");
					}
				}
				case 5->{
					System.out.println("Enter id for delete");
					int sid=sc.nextInt();
					boolean status=sservice.deleteById(sid);
					if(status){
						System.out.println("updated successfully");
					}else{
						System.out.println("Not found");
					}
				}
				case 6->{
					sc.nextLine();
					System.out.println("Enter name for delete");
					String name=sc.nextLine();
					boolean status=sservice.deleteByName(name);
					if(status) {
						System.out.println("deleted successfully");
					}else {
						System.out.println("not found");
					}
				}
				case 7->{
					System.out.println("Enter id to update");
					int sid = sc.nextInt();
					System.out.println("Choose options to update");
					System.out.println("1.M1 \n2.M2 \n3.M3 choose:");
					int m = sc.nextInt();
					boolean status=sservice.updateById(sid, m);
					if(status) {
						System.out.println("Updated successfully");
					}else {
						System.out.println("not found");
					}
				}
				case 8->{
					List<Float> elist= sservice.findByAvg();
					if(elist!=null) {
						elist.forEach(System.out::println);
					}else {
						System.out.println("Not found");
					}
				}
				case 9->{
					List<Student> lst=sservice.sortById();
					lst.forEach(System.out::println);
				}
				case 10->{
					List<Student> lst=sservice.sortByName();
					lst.forEach(System.out::println);
				}
				case 11->{
					List<Student> lst=sservice.sortByAvg();
					lst.forEach(System.out::println);
				}
				case 12->{sc.close();
				     System.out.println("Thank ypu for visiting...."); 
				}
				default->{
					System.out.println("wrong choice");
				}
				
			}
			
		}while(choice!=12);

	}
}

