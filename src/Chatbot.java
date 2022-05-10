import java.util.Scanner;

public class Chatbot {

	Scanner scanner = new Scanner(System.in);
	Basketball basketball =  new Basketball();
	Name name = new Name();
	Surname surname = new Surname();
	Weather weather =new Weather();
	Maths maths = new Maths();
	Random random = new Random();
	Jbean chat = new Jbean();

	public Chatbot(){
				name.name();
				surname.surname();
		while(true) {
			System.out.println("BOT--> We can talk about *Basketball*, *Weather*, *Maths*");
			System.out.println("BOT--> To select a topic just write topics' name");
			chat.setOption(scanner.nextLine().toLowerCase());

			if(chat.getOption().equals("basketball"))	{
				basketball.basketball();
				System.out.println("BOT--> You can choose a topic again or type \"no more\" and then \"bye\" ");
			}else if(chat.getOption().equals("weather")) {
				weather.weather();
				System.out.println("BOT--> You can choose a topic again or type \"no more\" and then \"bye\" ");
			}else if(chat.getOption().equals("maths")) {
				 maths.math();
				System.out.println("BOT--> You can choose a topic again or type \"no more\" and then \"bye\" ");
			}else if(chat.getOption().equals("no more")) {
				System.out.println("BOT--> Understandable");
				break;
			}else if( !chat.getOption().equals("no more") || !chat.getOption().equals("basketball") || !chat.getOption().equals("weather") || !chat.getOption().equals("math") ) {
				random.random();
				
			}
		}
	}
}