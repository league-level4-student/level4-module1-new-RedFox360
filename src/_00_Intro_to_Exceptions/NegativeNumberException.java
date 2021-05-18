package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	
	public void scaryPopup() {
		JOptionPane.showMessageDialog(null, "YOUR COMPUTER HAS BEEN INFECTED WITH A VIRUS! IT WILL BE DESTROYED IF YOU DO NOT CALL THIS PHONE NUMBER 000 000 0000. YOU WILL NEED TO PAY AN ADVANCE FEE OF 750 BITCOINS TO FIX YOUR COMPUTER. OR ELSE YOUR COMPUTER WILL BE HACKED AN ALL OF YOUR PERSONAL DATA WILL BE STOLEN.");
	}

}
