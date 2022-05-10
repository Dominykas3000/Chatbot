import java.util.Scanner;

public class Weather {
	
	Scanner scanner = new Scanner(System.in);
	Jbean weather = new Jbean();
	Random random = new Random();
	
	public void weather() {

		System.out.println("BOT--> What weather do you prefer ? Anwser by only typing: (Colder / Warmer )");
		weather.setPreference(scanner.nextLine().toLowerCase());
//--------------------colder---------------------------------------------------------------------------------------------------------------------------------
		if(weather.getPreference().equals("colder")) {
			System.out.println("BOT--> Could you specify wich season is your favourite? Anwser by only typing: ( Autumn / Winter )");
		    weather.setSeason(scanner.nextLine().toLowerCase());
//--------------------autumn---------------------------------------------------------------------------------------------------------------------------------
			if(weather.getSeason().equals("autumn")) {
				System.out.println("wich autumn month you like the most?");
				weather.setMonth(scanner.nextLine().toLowerCase());
				if( weather.getMonth().equals("september") || weather.getMonth().equals("october") || weather.getMonth().equals("november") ) {
					System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+ " once a year");
					System.out.println("BOT--> Please give me a reason why you  like "+weather.getMonth()+"  this much ?");
					weather.setReason(scanner.nextLine());
					System.out.println("BOT--> Oh... now I get it!");
					System.out.println("BOT--> Wow.. Now I can finally understand why somebody like the colder weather..");
				}
				else if( !weather.getMonth().equals("september") || !weather.getMonth().equals("october") || !weather.getMonth().equals("november") ){
					  random.random();
		          	  System.out.println("BOT--> If you need a reminder these are the months of autumn:");
		          	  System.out.println("BOT--> September, October, November");
		          	  System.out.println("BOT--> The question was wich one is your favourite?");
					  weather.setMonth(scanner.nextLine().toLowerCase());
					  System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+" once a year");
					  System.out.println("BOT--> Please give me a reason why you like "+weather.getMonth()+"  this much ?");
					  weather.setReason(scanner.nextLine());
					  System.out.println("BOT--> Oh... now I get it!");
					  System.out.println("BOT--> Wow.. Now I can finally understand why somebody like the colder weather..");
					  }
			}
			
//--------------------winter---------------------------------------------------------------------------------------------------------------------------------
			else if(weather.getSeason().equals("winter")) {
				System.out.println("wich winter month you like the most?");
				weather.setMonth(scanner.nextLine().toLowerCase());
				if( weather.getMonth().equals("december") || weather.getMonth().equals("january") || weather.getMonth().equals("february") ) {
					System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+ " once a year");
					System.out.println("BOT--> Please give me a reason why you like "+weather.getMonth()+"  this much ?");
					weather.setReason(scanner.nextLine());
					System.out.println("BOT--> Oh... now I get it!");
					System.out.println("BOT--> Wow.. Now I can finally understand why somebody like the colder weather..");
			   }else if( !weather.getMonth().equals("december") || !weather.getMonth().equals("january") || !weather.getMonth().equals("february") ) {
					  random.random();
					  System.out.println("BOT--> If you need a reminder these are the months of winter:");
		          	  System.out.println("BOT--> December, January, February");
		          	  System.out.println("BOT--> The question was wich one is your favourite?");
		          	  weather.setMonth(scanner.nextLine().toLowerCase());
					  System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+" once a year");
					  System.out.println("BOT--> Please give me a reason why you like "+weather.getMonth()+" this much ?");
					  weather.setReason(scanner.nextLine());
					  System.out.println("BOT--> Oh... now I get it!");
					  System.out.println("BOT--> Wow.. Now I can finally understand why somebody like the colder weather..");
					  }
			}			
//------------end-of-colder----------------------------------------------------------------------------------------------------------------------------------
		}
//--------------------warmer---------------------------------------------------------------------------------------------------------------------------------
		if(weather.getPreference().equals("warmer")) {
			System.out.println("BOT--> Could you specify wich season is your favourite? Anwser by only typing: ( Spring / Summer )");
			weather.setSeason(scanner.nextLine().toLowerCase());
//--------------------spring---------------------------------------------------------------------------------------------------------------------------------
			if(weather.getSeason().equals("spring")) {
				System.out.println("wich spring month you like the most?");
				weather.setMonth(scanner.nextLine().toLowerCase());
				if( weather.getMonth().equals("march") || weather.getMonth().equals("april") || weather.getMonth().equals("may") ) {
					System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+ " once a year");
					System.out.println("BOT--> Please give me a reason why you  like "+weather.getMonth()+"  this much ?");
					weather.setReason(scanner.nextLine());
					System.out.println("BOT--> Oh... now I get it!");
					System.out.println("BOT--> Wow.. As a BOT I can finally understand why someone would like warm weather..");
			   }else if( !weather.getMonth().equals("march") || !weather.getMonth().equals("april") || !weather.getMonth().equals("may") ) {
					  random.random();
					  System.out.println("BOT--> If you need a reminder these are the months of spring:");
		          	  System.out.println("BOT--> March, April, May");
		          	  System.out.println("BOT--> The question was wich one is your favourite?");
					  weather.setMonth(scanner.nextLine().toLowerCase());
					  System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+" once a year");
					  System.out.println("BOT--> Please give me a reason why you like "+weather.getMonth()+"  this much ?");
					  weather.setReason(scanner.nextLine());
					  System.out.println("BOT--> Oh... now I get it!");
					  System.out.println("BOT--> Wow.. As a BOT I can finally understand why someone would like warm weather..");
					  }
			}
//--------------------summer---------------------------------------------------------------------------------------------------------------------------------
		else if(weather.getSeason().equals("summer")) {
			System.out.println("wich summer month you like the most?");
			weather.setMonth(scanner.nextLine().toLowerCase());
			if( weather.getMonth().equals("june") || weather.getMonth().equals("july") || weather.getMonth().equals("august") ) {
				System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+ " once a year");
				System.out.println("BOT--> Please give me a reason why you like "+weather.getMonth()+"  this much ?");
				weather.setReason(scanner.nextLine());
				System.out.println("BOT--> Oh... now I get it!");
				System.out.println("BOT--> Wow.. As a BOT I can finally understand why someone would like warm weather");
		   }else if( !weather.getMonth().equals("december") || !weather.getMonth().equals("january") || !weather.getMonth().equals("february") ) {
				  random.random();
				  System.out.println("BOT--> If you need a reminder these are the months of winter:");
	          	  System.out.println("BOT--> June, July, August");
	          	  System.out.println("BOT--> The question was wich one is your favourite?");
				  weather.setMonth(scanner.nextLine().toLowerCase());
				  System.out.println("BOT--> oh I myself enjoy "+weather.getMonth()+" once a year");
				  System.out.println("BOT--> Please give me a reason why you like "+weather.getMonth()+"  this much ?");
				  weather.setReason(scanner.nextLine());
				  System.out.println("BOT--> Oh... now I get it!");
				  System.out.println("BOT--> Wow.. As a BOT I can finally understand why someone would like warm weather");
				  }
		       }
			}
//------------end-of-weather()----------------------------------------------------------------------------------------------------------------------------------
}
}
