package roulette;

import util.ConsoleReader;

public class ThreeinRow extends Bet {
	public ThreeinRow(String description, int odds) {
		super(description, odds);
	}
	
	
	public String placeBet(){
		String result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, Wheel.NUM_SPOTS -3);
		
		System.out.println();
		return result;
	}
	
	public boolean BetIsMade(String betChoice, Wheel myWheel){
		 int start = Integer.parseInt(betChoice);
		 return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}
}
