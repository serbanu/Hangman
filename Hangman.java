
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
		this.lineNumbers = 8;
		this.columnNumbers = 50;
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
	
	public void supportForHanging() {
		hangMatrix[1][columnNumbers - 2] = "|";
		hangMatrix[0][columnNumbers - 2] = "_";
		hangMatrix[0][columnNumbers - 3] = "_";
		hangMatrix[0][columnNumbers - 4] = "_";
		hangMatrix[0][columnNumbers - 5] = "_";
		hangMatrix[1][columnNumbers - 6] = "|";
		hangMatrix[2][columnNumbers - 6] = "|";
		hangMatrix[3][columnNumbers - 6] = "|";
		hangMatrix[4][columnNumbers - 6] = "|";
		hangMatrix[5][columnNumbers - 6] = "|";
		hangMatrix[6][columnNumbers - 6] = "|";
		hangMatrix[6][columnNumbers - 5] = "_";
		hangMatrix[6][columnNumbers - 4] = "_";
		hangMatrix[6][columnNumbers - 7] = "_";
		hangMatrix[6][columnNumbers - 8] = "_";
	}
	
	public void hangedHead() {
		hangMatrix[2][columnNumbers - 2] = "O";
	}

	public void hangedThorax() {
		hangMatrix[3][columnNumbers - 2] = "|";
		hangMatrix[4][columnNumbers - 2] = "|";
	}

	public void hangedLeftArm() {
		hangMatrix[3][columnNumbers - 3] = "/";
	}
	
	public void hangedRightArm() {
		hangMatrix[3][columnNumbers - 1] = "\\";
	}
	
	public void hangedLeftFoot() {
		hangMatrix[5][columnNumbers - 3] = "/";
	}
	
	public void hangedRightFoot() {
		hangMatrix[5][columnNumbers - 1] = "\\";
	}
}
