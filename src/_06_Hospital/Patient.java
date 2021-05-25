package _06_Hospital;

public class Patient {
	private boolean caredFor;
	
	public boolean feelsCaredFor() {
		return caredFor;
	}
	public void checkPulse() {
		caredFor = true;
	}
	
	public void setCaredFor(boolean c) {
		caredFor = c;
	}
}
