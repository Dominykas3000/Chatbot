import java.util.Scanner;
public class Name {
	
	Scanner scanner = new Scanner(System.in);
	Jbean name = new Jbean();
	Random random = new Random();
	
		public void name() {
			
			System.out.println("BOT--> Hello what is your name ?");
			name.setName(scanner.nextLine().toLowerCase()); 
			if(!name.getName().matches("^[a-zA-Z]+$")) {
				random.random();
				System.out.println("BOT--> Your last try to enter your name using ONLY WITH ALPABETICAL SYMBOLS");
				name.setName(scanner.nextLine().toLowerCase());
				}
			System.out.println("BOT--> nice to meet you "+name.getName()+", what is your surname?");

		}
	}