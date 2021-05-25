package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;

	public Hospital() {
		doctors = new ArrayList<Doctor>();
	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void assignPatientsToDoctors() {
		int patientsPerDoctor = patients.size() / doctors.size();
	}
}
