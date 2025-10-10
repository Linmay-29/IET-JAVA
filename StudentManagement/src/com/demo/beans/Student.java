package com.demo.beans;

public class Student implements Comparable {
	private int sId ;
	private String sName;
	
	public Student(int sId){
		this.sId = sId;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}

	public boolean equals(Object obj) {
		return this.sId == ((Student)obj).getsId();
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public float getM3() {
		return m3;
	}
	public void setM3(float m3) {
		this.m3 = m3;
	}
	private float m1;
	private float m2;
	private float m3;
	public Student(int sId, String sName, float m1, float m2, float m3) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}



	@Override
	public int compareTo(Object o) {
		return this.sId - ((Student)o).getsId();
	}
	
	
}
