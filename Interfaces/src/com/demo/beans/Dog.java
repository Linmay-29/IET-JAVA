package com.demo.beans;
import com.demo.interfaces.Food;
import com.demo.interfaces.Sounds;
public class Dog implements Sounds,Food{
	public void makeSounds() {
		System.out.println("in normal override : Boom baam");
	}
	public void eats() {
		System.out.println("Dog eats Bones");
	}
}
