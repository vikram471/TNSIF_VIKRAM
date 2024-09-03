package com.vikram.day7.Keywords.StaticAbstractFinal;

abstract class Value{
	void show() {
		System.out.println("Vikram");
		}
}
public class Student extends Value  {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.show();
	}
}			