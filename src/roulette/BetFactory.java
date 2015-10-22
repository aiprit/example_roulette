package roulette;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import roulette.bets.*;

public class BetFactory {

	private Map<String,Class> myMap = new HashMap();

	public void addBet(String Id, Class product){
		myMap.put(Id,product);
	}
	public Bet getBet(String str,Integer in ){
//		if(str.equals("Odd or Even")){
//			return new OddEven(str, 1);
//		}
//		else if(str.equals("Red or Black")){
//			return new RedBlack(str, 1);
//		}
//		else if(str.equals("Three Consecutive")){
//			return new ThreeConsecutive(str, 1);
//		}
//		return null;
		Class productClass = (Class) myMap.get(str);
		try {
			Constructor productCons = productClass.getDeclaredConstructor(new Class[]{String.class,Integer.class});
			return (Bet) productCons.newInstance(str,in);
		}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
