import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String mama = new String("abcdefghij");
		System.out.println(mama.substring(0, 4) + "OO" + mama.substring(4, mama.length() - 1));
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
}
