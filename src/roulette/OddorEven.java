package roulette;

import util.ConsoleReader;

public class OddorEven extends Bet {
	public OddorEven(String description, int odds) {
		super(description, odds);
	}
	
	
	public String placeBet(){
		String result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		
		System.out.println();
		return result;
	}
	
	public boolean BetIsMade(String betChoice, Wheel myWheel){
		 return (myWheel.getNumber()%2 == 0 && betChoice.equals("even") ||
				 myWheel.getNumber()%2 == 1 && betChoice.equals("odd"));
	}
}
