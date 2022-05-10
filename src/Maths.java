	import java.util.Scanner;

public class Maths {
		Scanner scanner = new Scanner(System.in);
		Jbean math = new Jbean();
		Random random = new Random();

		public void  math() {
			
			System.out.println("BOT--> Do really want to do mathematics right now ? Anwser ( yes / no )");
			while(true) {
				math.setChoice(scanner.nextLine().toLowerCase());
				if(math.getChoice().equals("yes")) {
					System.out.println("BOT--> What do you want to do? You can add, subtract, multiply or devide 2 integers.");
					System.out.println("BOT--> Type addition, subtraction, multiplication, division  to choose it");
					math.setChoice(scanner.nextLine().toLowerCase());
					
					 if(math.getChoice().equals("addition")) {
						System.out.println("BOT--> Enter Two integers:");
						math.setFirstInt(scanner.nextInt());
						System.out.println("BOT--> Your first integer = "+math.getFirstInt());
						math.setSecondInt(scanner.nextInt());
						System.out.println("BOT--> Your second integer = "+math.getSecondInt());
						math.setSolution(math.getFirstInt() + math.getSecondInt());
						System.out.println("BOT--> Your Anwser = "+math.getSolution());
						System.out.println("BOT--> If you want to do more math type - yes. If You are ready to leave type - no");
						math.setChoice(scanner.nextLine().toLowerCase());
					    }
					
					else if(math.getChoice().equals("subtraction")) {
						System.out.println("BOT--> Enter Two integers:");
						math.setFirstInt(scanner.nextInt());
						System.out.println("BOT--> Your first integer = "+math.getFirstInt());
						math.setSecondInt(scanner.nextInt());
						System.out.println("BOT--> Your second integer = "+math.getSecondInt());
						math.setSolution(math.getFirstInt() - math.getSecondInt());
						System.out.println("BOT--> Your Anwser = "+math.getSolution());
						System.out.println("BOT--> If you want to do more math type - yes. If You are ready to leave type - no");
						math.setChoice(scanner.nextLine().toLowerCase());
						}
					
					else if(math.getChoice().equals("multiplication")) {
						System.out.println("BOT--> Enter Two integers:");
						math.setFirstInt(scanner.nextInt());
						System.out.println("BOT--> Your first integer = "+math.getFirstInt());
						math.setSecondInt(scanner.nextInt());
						System.out.println("BOT--> Your second integer = "+math.getSecondInt());
						math.setSolution(math.getFirstInt() * math.getSecondInt());
						System.out.println("BOT--> Your Anwser = "+math.getSolution());
						System.out.println("BOT--> If you want to do more math type - yes. If You are ready to leave type - no");
						math.setChoice(scanner.nextLine().toLowerCase());
						}
					
					else if(math.getChoice().equals("division")) {
						System.out.println("BOT--> Enter Two integers:");
						math.setFirstInt(scanner.nextInt());
						System.out.println("BOT--> Your first integer = "+math.getFirstInt());
						math.setSecondInt(scanner.nextInt());
						System.out.println("BOT--> Your second integer = "+math.getSecondInt());
						math.setSolution(math.getFirstInt() / math.getSecondInt());
						System.out.println("BOT--> Your Anwser = "+math.getSolution());
						System.out.println("BOT--> If you want to do more math type - yes. If You are ready to leave type - no");
						math.setChoice(scanner.nextLine().toLowerCase());
						}
					 
					else if( !math.getChoice().equals("addition") || !math.getChoice().equals("subtraction") || !math.getChoice().equals("multiplication") || !math.getChoice().equals("division") ) {
						random.random();
						System.out.println("BOT--> Something went wrong try again by writting yes");
						}

				}else if(math.getChoice().equals("no")) {
					System.out.println("BOT--> Good choice");
					break;
				}

			}
				
		}
	}