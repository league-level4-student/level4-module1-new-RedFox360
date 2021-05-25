package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	private ArrayList<Patient> patients;
	public Doctor() {
		patients = new ArrayList<Patient>();
	}
	
	public void doMedicine() {
		patients.forEach(patient -> patient.setCaredFor(true));
	}
	
	public void assignPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public abstract boolean makesHouseCalls();
	
	public abstract boolean performsSurgery();
}
