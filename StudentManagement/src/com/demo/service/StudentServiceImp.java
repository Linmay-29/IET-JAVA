package com.demo.service;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;


public class StudentServiceImp implements StudentService {
	Scanner sc = new Scanner(System.in);
	private StudentDao sdao;
	
	public StudentServiceImp() {
		sdao = new StudentDaoImpl();
	}
	@Override
	public boolean addNewStudent() {
		System.out.println("Enter student id");
		int sId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name");
		String sName = sc.nextLine();
		System.out.println("Enter student m1 marks");
		float m1 = sc.nextFloat();
		
		System.out.println("Enter student m2 marks");
		float m2 = sc.nextFloat();
		
		System.out.println("Enter student m2 marks");
		float m3 = sc.nextFloat();
		
		Student s = new Student(sId,sName,m1,m2,m3);
		
		return sdao.save(s);
	}

	@Override
	public void displayAll() {
		sdao.displayAll();
		
	}

	@Override
	public Student searchById(int sId) {
		return sdao.searchById(sId);
	}

	@Override
	public List<Student> searchByName(String sName) {
		return sdao.searchByName(sName);
	}

	@Override
	public boolean deleteById(int sId) {
		return sdao.deleteById(sId);
	}

	@Override
	public boolean deleteByName(String sName) {
		return sdao.deleteByName(sName);
	}

	@Override
	public boolean updateById(int sId, int m) {
		return sdao.updateById(sId, m);
	}

	@Override
	public List<Float> findByAvg() {
		return sdao.findByAvg();
	}

	@Override
	public List<Student> sortById() {
		return sdao.sortById();
	}

	@Override
	public List<Student> sortByName() {
		return sdao.sortByName();
	}

	@Override
	public List<Student> sortByAvg() {
		return sdao.sortByAvg();
	}

}
