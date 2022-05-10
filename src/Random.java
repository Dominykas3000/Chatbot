
public class Random {
	
	public void random() {
	
	final int num =3;
	double r = Math.random();
	int whichresponse = (int)(r*num);
	if(whichresponse==0) {
		System.out.println("BOT--> I cannot understand you");
	}
	else if(whichresponse==1) {
		System.out.println("BOT--> Ok.. I'm trying to figure it out.. nah I can't");
	}
	else if(whichresponse==2) {
		System.out.println("BOT--> I am not as smart as you think :( try again");
    }
	else if(whichresponse==3) {
		System.out.println("BOT--> You are starting to piss me off. This is your last time trying ");
    }
  }
}