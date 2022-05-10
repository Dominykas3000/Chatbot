
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		new Chatbot();
		while(true) {
			
			String anwser = scanner.nextLine().toUpperCase();
			
			if(anwser.equals("BYE")) {
				scanner.close();
				break;
			}	
		}
	}
}