
public class Hangman {

	public String input;
	public String output;
	public StringBuilder out;
	public String[][] hangMatrix;
	public int lineNumbers;
	public int columnNumbers;	
	public Hangman(String input) {
		this.input = input;
		this.output = new String();
		this.lineNumbers = 4;
		this.columnNumbers = columnNumbers;
		this.hangMatrix = new String[this.lineNumbers][this.columnNumbers];
	}

	public void spaceMatrix() {
		for(int i = 0; i < lineNumbers; i++) {
			for(int j = 0; j < columnNumbers; j++) {
				hangMatrix[i][j] = " ";
			}
		}
	}
	
	public String getOutput() {
		emptySpaces();
		return output;
	}
	
	public void emptySpaces() {
		for(int i = 0; i < input.length(); i++) {
			output += "_ ";
		}
		this.out = new StringBuilder(output);
		System.out.println("You better guess this one: " + this.out);
		System.out.println("Also, keep in mind that I'm Case Sensitive! :P");
	}
	
	public void hangedHead() {
		hangMatrix[0][columnNumbers - 2] = "O";
	}

	public void hangedThorax() {
		hangMatrix[1][columnNumbers - 2] = "|";
		hangMatrix[2][columnNumbers - 2] = "|";
	}

	public void hangedLeftArm() {
		hangMatrix[1][columnNumbers - 3] = "/";
	}
	
	public void hangedRightArm() {
		hangMatrix[1][columnNumbers - 1] = "\\";
	}
	
	public void hangedLeftFoot() {
		hangMatrix[3][columnNumbers - 3] = "/";
	}
	
	public void hangedRightFoot() {
		hangMatrix[3][columnNumbers - 1] = "\\";
	}
}
