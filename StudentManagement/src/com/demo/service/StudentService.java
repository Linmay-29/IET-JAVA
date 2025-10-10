package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {
	public boolean addNewStudent();
	public void displayAll();
	public Student searchById(int sId);
	public List <Student> searchByName(String sName);
	public boolean deleteById(int sId);
	public boolean deleteByName(String sName);
	public boolean updateById(int sId,int m);
	public List<Float> findByAvg();
	public List<Student> sortById();
	public List<Student> sortByName();
	public List<Student> sortByAvg();
	
}
