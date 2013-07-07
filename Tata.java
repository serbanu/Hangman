
public class Tata {

	public static void main(String[] args) {
		Hangman tata = new Hangman("Tata");
		tata.emptySpaces();
		tata.spaceMatrix();
		tata.hangedHead();
		tata.hangedThorax();
		tata.hangedLeftArm();
		tata.hangedRightArm();
		tata.hangedLeftFoot();
		tata.hangedRightFoot();
		
		System.out.println(tata.output);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(tata.hangMatrix[i][j]);
			}
			System.out.println();
		}
	}

}
