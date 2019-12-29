package monopoly;

public class Utility extends SquareType {
		int mortgage;
	public Utility(String a, String b, int c,int d) {
		super(a,b,c);
		mortgage=d;
	}
	
	public int getMortgage() {
		return mortgage;
	}
	public void buy(Player a) {
		if (a.getName().equals("Player 1")) {
			setOwner(1);
			a.setMoney(a.getMoney()-mortgage);
			
			
		}
		if (a.getName().equals("Player 2")) {
			setOwner(2);
			a.setMoney(a.getMoney()-mortgage);
		}
	}
	public void payRent(Player a, Player b, int c) {
		c=c*4;
		a.setMoney(a.getMoney()+c);
		b.setMoney(b.getMoney()-c);// stop here stop here stop here
	}
}
