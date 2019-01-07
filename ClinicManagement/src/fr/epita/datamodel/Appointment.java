package fr.epita.datamodel;

import java.util.Date;
import java.util.List;

public class Appointment {

	private Doctor doctor;
	
	private Patient patient;
	
	private Date appointmentDate;
	
	private AppointmentType type;
	
	private List<Nurse> nursesInvolved;

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public AppointmentType getType() {
		return type;
	}

	public void setType(AppointmentType type) {
		this.type = type;
	}

	public List<Nurse> getNursesInvolved() {
		return nursesInvolved;
	}

	public void setNursesInvolved(List<Nurse> nursesInvolved) {
		this.nursesInvolved = nursesInvolved;
	}
	
	
	
}
