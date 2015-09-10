# example_roulette
Parit Burintrathikul (pb111)
Zdravko Paskalev (zap3)

Program to refactor that plays a game of roulette

Analysis of the code:

Currently, the way to add in an extra bet would be to add a new if statement in every single method and a new Bet object in the initial formation of the Bet[] in Game.java, which is very inefficient and ugly. 

We refactored the code in a way which removes the redundancy of the multiple if statements by polymorphism and extending the bets class in a a variety of different subclasses for each bet. The refactored code is simpler in the sense that the if statements are removed and the new bets are set up in a way that you can make a new class for each new bet. This way it is a lot easy to look through the code since every bet is separated in its own class.
