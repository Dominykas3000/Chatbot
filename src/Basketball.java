	import java.util.Scanner;	
public class Basketball {
	
	Scanner scanner = new Scanner(System.in);
	Jbean bball = new Jbean();
	Random random = new Random();
		
		public void basketball() {
			
			System.out.println("BOT--> Which league do you  prefer more European or American?");
			bball.setChoice(scanner.nextLine().toLowerCase());
			if(bball.getChoice().equals("european")||bball.getChoice().equals("eu")||bball.getChoice().equals("euro")){
			 System.out.println("BOT--> Great choice, I myself enjoy European basketball! If you dont want to continue this conversation type:*no more*. To continue, just press enter");
			}else {
				System.out.println("BOT--> Great choice I love NBA to! If you dont want to continue this conversation type:*no more*. To continue, just press enter");
			}

			while(true){
				bball.setAnwser(scanner.nextLine().toLowerCase());
				if(!bball.getAnwser().equals("no more")) {
				System.out.println("BOT--> Whats ur favourite team ?! I'm dying to know!!");
				bball.setTeam(scanner.nextLine().toLowerCase());
				System.out.println("BOT--> thats a cool team");
				System.out.println("BOT--> who is your favourite player ?");
				bball.setPlayer(scanner.nextLine());
			    System.out.println("BOT--> does "+bball.getPlayer()+" plays in "+bball.getTeam()+" ?(only : yes / no)");
			    bball.setOption(scanner.nextLine().toLowerCase());
	 //------------------------------------------------------------------------------------------------------------------------------------------------------------		    
			    if(bball.getOption().equals("no")) {
			    	System.out.println("BOT--> Wich team than he does play for ?");
			    	bball.setTeam2(scanner.nextLine().toLowerCase());
			    	System.out.println("BOT--> Oh I have not been updated for this change.");
			    	System.out.println("BOT--> thank you, now I will know that "+bball.getPlayer()+ " plays for "+bball.getTeam2());
			    	}
	 //------------------------------------------------------------------------------------------------------------------------------------------------------------
			    else if(bball.getOption().equals("yes")){
			    	System.out.println("BOT--> Oh my! I sorry forgot that "+bball.getPlayer()+ " never changed teams and stayed at "+bball.getTeam2());
			    	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------------

			    else if( !bball.getOption().equals("yes") || !bball.getOption().equals("no") ){
			    	 random.random();
	    		     System.out.println("BOT--> I see you did not understood my question, thus im asking again. Where does "+bball.getPlayer()+ " play right now ?" );
				     bball.setTeam2(scanner.nextLine().toLowerCase());
	    		     System.out.println("BOT--> ahh yes he do play for the " +bball.getTeam2());
	    		     }
	//------------------------------------------------------------------------------------------------------------------------------------------------------------
			    System.out.println("BOT--> thank you for sharing:)");
			    break;
			    }
			    else{
			    	System.out.println("BOT--> thank you for sharing:)");
			    break;
			    }
			   }	
			}
	}