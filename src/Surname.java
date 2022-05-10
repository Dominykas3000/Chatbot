import java.util.Scanner;

public class Surname {
	
	Jbean surname = new Jbean();
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	public void surname() {
	
		 surname.setSurname(scanner.nextLine().toLowerCase());
		if(!surname.getSurname().matches("^[a-zA-Z]+$")) {
			random.random();
			System.out.println("BOT--> your last try to enter your surname ONLY WITH ALPABETICAL SYMBOLS");
			 surname.setSurname(scanner.nextLine().toLowerCase());
			 }
		System.out.println("BOT--> Nice to meet you");
	}
}
