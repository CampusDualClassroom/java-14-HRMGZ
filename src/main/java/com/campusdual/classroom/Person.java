package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	protected void getDetails(){
		System.out.println("*****************************");
		System.out.println("Nombre: " + this.name);
		System.out.println("Apellidos: " + this.surname);

	}
}
