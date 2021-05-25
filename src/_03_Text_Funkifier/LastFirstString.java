package _03_Text_Funkifier;

public class LastFirstString implements TextFunkifier {
	private String unfunkifiedText;

	public LastFirstString(String unfunkifiedText) {

		this.unfunkifiedText = unfunkifiedText;

	}

	@Override
	public String funkifyText() {
		String funkified = titleCase(unfunkifiedText);
		funkified = titleCase(new StringBuilder(funkified).reverse().toString());
		return new StringBuilder(funkified).reverse().toString();
	}
	public String titleCase(String text) {
		StringBuilder converted = new StringBuilder();

	    boolean convertNext = true;
	    for (char ch : text.toCharArray()) {
	        if (Character.isSpaceChar(ch)) {
	            convertNext = true;
	        } else if (convertNext) {
	            ch = Character.toTitleCase(ch);
	            convertNext = false;
	        } 
	        converted.append(ch);
	    }
	    return converted.toString();
	}
}
