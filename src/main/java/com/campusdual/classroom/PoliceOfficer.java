package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	protected void getDetails(){
		System.out.println("*****************************");

		System.out.println("Nombre: " + this.name);
		System.out.println("Apellidos: " + this.surname);
		System.out.println("Equipo: " + this.squad);

	}
}
