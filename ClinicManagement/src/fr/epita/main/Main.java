package fr.epita.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.epita.datamodel.Appointment;
import fr.epita.datamodel.AppointmentType;
import fr.epita.datamodel.Doctor;
import fr.epita.datamodel.Nurse;
import fr.epita.datamodel.Patient;

public class Main {

	
	public static void main(String[] args) {
		Doctor doctor = new Doctor("John Smith", 42);      // instantiation of doctor
		Patient patient = new Patient("Bobby Rickman", 28);  // instantiation of patient
		Nurse nurse = new Nurse("Marlene Simmons", 38);    // instantiation of nurse
		Appointment appointment = new Appointment(doctor, patient, new Date(), AppointmentType.OPERATION);
		// instantiation of appointment with doctor, patient, date and appointment type as parameters
		List<Nurse> nursesInvolved = new ArrayList<Nurse>();
		nursesInvolved.add(nurse); // put the nurse in a list
		
		appointment.setNursesInvolved(nursesInvolved); // add list of nurses to appointment
		
		System.out.println("Appointment set for " + appointment.getAppointmentDate());
		System.out.println("Doctor of the appointment : " + doctor.getName());
		System.out.println("Patient concerned : " + patient.getName());
		for (Nurse nurseInvolved : appointment.getNursesInvolved()) { // for each nurse involved in the operation
			System.out.println("Nurse involved : " + nurseInvolved.getName());
		}
	}
}
