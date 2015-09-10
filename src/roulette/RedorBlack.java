package roulette;

import util.ConsoleReader;

public class RedorBlack extends Bet {
	

	public RedorBlack(String description, int odds) {
		super(description, odds);
	}
	
	
	public String placeBet(){
		String result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		
		System.out.println();
		return result;
	}
	
	public boolean BetIsMade(String betChoice, Wheel myWheel){
		 return myWheel.getColor().equals(betChoice);
	}
	
}
