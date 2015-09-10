package roulette;

import util.ConsoleReader;

public class SingleNumber extends Bet{
	public SingleNumber(String description, int odds) {
		super(description, odds);
	}
	
	
	public String placeBet(){
		String result = "" +(ConsoleReader.promptInt("Please bet number"));
		
		System.out.println();
		return result;
	}
	
	public boolean BetIsMade(String betChoice, Wheel myWheel){
		 return (myWheel.getNumber()%2 == 0 && betChoice.equals("even") ||
				 myWheel.getNumber()%2 == 1 && betChoice.equals("odd"));
	}
}
