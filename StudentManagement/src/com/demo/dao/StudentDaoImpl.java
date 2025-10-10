package com.demo.dao;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	Scanner sc = new Scanner(System.in);
	static List <Student> sList = new ArrayList<>();
	static {
		sList.add(new Student(01,"Linmay",99,98,97));
		sList.add(new Student(02,"Kunal",99,98,97));
		sList.add(new Student(03,"Manas",99,97,96));
	}
	@Override
	public void displayAll() {
		sList.forEach(System.out::println);
		
	}

	@Override
	public Student searchById(int sId) {
		int pos = sList.indexOf(new Student(sId));
		if(pos!=-1) {
			return sList.get(pos);
		}
		return null;
		
	}

	@Override
	public List<Student> searchByName(String sName) {
		List<Student> temp = sList.stream()
				.filter(stud->stud.getsName().equals(sName))
				.collect(Collectors.toList());
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}

	@Override
	public boolean deleteById(int sId) {
		return sList.removeIf(emp->emp.getsId()==sId);
	}

	@Override
	public boolean deleteByName(String sName) {
		return sList.removeIf(emp->emp.getsName().equals(sName));
	}

	@Override
	public boolean updateById(int sId,int m) {
		Student s = searchById(sId);
		if(m <= 3) {
			if(m == 1) {
				System.out.println("Current M1 marks: " + s.getM1());
				System.out.println("Enter new marks for M1: ");
				float newM = sc.nextFloat();
				s.setM1(newM);
				return true;
			}
			else if(m == 2) {
				System.out.println("Current M2 marks: " + s.getM2());
				System.out.println("Enter new marks for M2: ");
				float newM = sc.nextFloat();
				s.setM2(newM);
				return true;
			}else {
				System.out.println("Current M3 marks: " + s.getM3());
				System.out.println("Enter new marks for M3: ");
				float newM = sc.nextFloat();
				s.setM3(newM);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Float> findByAvg() {
		return sList.stream()
				.map(stud->(stud.getM1() + stud.getM2() + stud.getM3())/3.0f)
				.collect(Collectors.toList());
	}

	@Override
	public List<Student> sortById() {
		List<Student> list = new ArrayList<>();
		for(Student s:sList) {
			list.add(s);
		}
		Comparator<Student> c =(a,b)->{
			return a.getsId()-b.getsId();
		};
		list.sort(c);
		return list;
		
	}

	@Override
	public List<Student> sortByName() {
		List<Student> list = new ArrayList<>();
		for(Student s:sList) {
			list.add(s);
		}
		Comparator<Student> c =(a,b)->{
			return a.getsName().compareTo(b.getsName());
		};
		list.sort(c);
		return list;
	}

	@Override
	public List<Student> sortByAvg() {
		List<Student> list = new ArrayList<>();
		for(Student s:sList) {
			list.add(s);
		}
		Comparator<Student> c =(a,b)->{
			float avg1 = (a.getM1()+a.getM2()+a.getM3())/3.0f;
			float avg2 = (b.getM1()+b.getM2()+b.getM3())/3.0f;
			return Float.compare(avg2, avg1);
		};
		list.sort(c);
		return list;	
	}

	@Override
	public boolean save(Student s) {
		if(s!=null) {
			sList.add(s);
			return true;
		}
		return false;
	}

}
