package fr.epita.datamodel;

public class Doctor extends Person{

	public Doctor(String name, int age) {
		super(name, age);
	}

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	
}
