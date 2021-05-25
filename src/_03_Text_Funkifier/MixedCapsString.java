package _03_Text_Funkifier;

import java.util.ArrayList;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    
    public String funkifyText() {
    	String funkified = "";
    	boolean lower = true;
    	for (char c : unfunkifiedText.toCharArray()) {
    		funkified += (lower ? Character.toLowerCase(c) : Character.toUpperCase(c));
    		lower = !lower;
    	}
    	return funkified;
    	
    }

}
