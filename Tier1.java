package monopoly;
import java.util.ArrayList;

public class Tier1  extends SquareType {
	int mortgage;
	int rent;//stop here stop here stop here
	ArrayList<house> houses= new ArrayList<house>();
//  hotel trinavago;
	public Tier1(String a, String b,int c, int d,int e) {
		super(a,b,c);
		mortgage=d;
		rent = e;
	}
	public int getMortgage() {
		return mortgage;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int a) {
		rent=a;
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
	public void rent(Player a, Player b) {
			a.setMoney(a.getMoney()+rent);
			b.setMoney(b.getMoney()-rent);
	}
	public ArrayList<house> getHouses(){
		return houses;
	}
	
	
}
