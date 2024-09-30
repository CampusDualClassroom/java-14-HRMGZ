package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public void getDetails(){
		System.out.println("*****************************");

		System.out.println("Nombre: " + this.name);
		System.out.println("Apellidos: " + this.surname);
		System.out.println("Area: " + this.area);

	}
}
