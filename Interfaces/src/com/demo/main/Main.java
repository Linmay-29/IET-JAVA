package com.demo.main;
import com.demo.beans.Cat;
import com.demo.beans.Dog;
import com.demo.interfaces.Food;
import com.demo.interfaces.Sounds;

public class Main {

	public static void main(String[] args) {
		Food f1 = new Dog();
		f1.eats();
		Food f2  = new Cat();
		f2.eats();
	}

}
