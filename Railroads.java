package monopoly;

public class Railroads extends Tier1 {
	//stop here stop here stop here
//	ArrayList<house> property;
//  hotel trinavago;
	public Railroads(String a, String b,int c, int d,int e) {
		super(a,b,c,d,e);
		
	}
	
	public void cent(Player a, Player b) {
			if (a.getRR().size()==2) {
				rent=50;
			}
			if (a.getRR().size()==3) {
				rent=100;
			}
			if (a.getRR().size()==4) {
				rent=200;
			}
			a.setMoney(a.getMoney()+rent);
			b.setMoney(b.getMoney()-rent);
	}
}
