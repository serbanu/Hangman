import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

public class Main {

	public static int counter = 0;
	public static int counter2 = 0;
	public static char inputWord = ' ';
	public static String luckyShots = new String();
	public static String unluckyShots = new String();
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Type the word you want to be guessed: ");
		String input = getInputString();
		Hangman spanzi = new Hangman(input);
		spanzi.emptySpaces();
		spanzi.spaceMatrix();
		
		while (counter < 6) {
			spanzi.supportForHanging();
			inputWord = getInput();
			if(!isLetterInInput(spanzi)) {
				if(!unluckyShots.contains(String.valueOf(inputWord))) {
					counter ++;
					if(unluckyShots.length() < 1) {
						unluckyShots += inputWord;
					} else {
						unluckyShots += ", " + inputWord;
					}
					switch(counter) {
						case 1:
							spanzi.hangedHead();
							break;
						case 2:
							spanzi.hangedThorax();
							break;
						case 3:
							spanzi.hangedLeftArm();
							break;
						case 4:
							spanzi.hangedRightArm();
							break;
						case 5:
							spanzi.hangedLeftFoot();
							break;
						case 6:		
							spanzi.hangedRightFoot();
							break;
						default:
							break;
					}
				}
			} else {
				for(int i = 0; i < spanzi.input.length(); i++) {
					if(inputWord == spanzi.input.charAt(i)) {
						spanzi.out.setCharAt(2 * i, inputWord);
						luckyShots += inputWord;
						counter2 ++;
					}
				}
			}
			
			System.out.println("Lucky shots   :)  : " + spanzi.out);
			System.out.println("Unlucky shots :(  : " + unluckyShots);
			
			if(counter == 5) {
				if(unluckyShots.contains(String.valueOf(inputWord))) {
					System.out.println("Watch out! You have only ONE shot now!!");
				}
			}
			
			printHangedMan(spanzi);
			if(counter2 == spanzi.input.length()) {
				System.out.println("Congrats! The word we were looking for was " + spanzi.input);
				break;
			}
			
			if(counter == 6) {
				System.out.println("Ouch, sorry, but the word we were looking for was " + spanzi.input);
				break;
			}
		}
	}

	private static void printHangedMan(Hangman spanzi) {
		for (int i = 0; i < spanzi.lineNumbers; i++) {
			for (int j = 0; j < spanzi.columnNumbers; j++) {
				System.out.print(spanzi.hangMatrix[i][j]);
			}
			System.out.println();
		}
	}
	
	private static boolean isLetterInInput(Hangman spanzi) {
		for(int i = 0; i < spanzi.input.length(); i++) {
			if(inputWord == spanzi.input.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	private static char getInput() throws IOException{
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			return stdin.readLine().charAt(0);
		}
		catch(Exception e){
			return e.getMessage().charAt(0);
		}
	}
	
	private static String getInputString() throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			return stdin.readLine();
		} catch(Exception e) {
			return e.getMessage();
		}
	}
}
