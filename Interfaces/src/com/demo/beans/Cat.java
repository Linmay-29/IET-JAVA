package com.demo.beans;
import com.demo.interfaces.Food;
import com.demo.interfaces.Sounds;
public class Cat implements Sounds,Food{
	public void makeSounds() {
		System.out.println("Meoww");
	}
	public void eats() {
		System.out.println("Cat eats Fish");
	}
}
