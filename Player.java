package monopoly;

import java.util.ArrayList;

public class Player implements Pieces {
	int location;
	String Name;
	int money;
	ArrayList<Tier1> shops=new ArrayList<Tier1>();
	ArrayList<Utility> ww=new ArrayList<Utility>();
	ArrayList<Railroads> rr=new ArrayList<Railroads>();
	public Player(int a, String n,int c) {
			location=a;
			Name=n;
			money=c;
			
		}
	
	public int getlocation() {
		
		
		return location;
		
		}
	
	public void setOwner(String Human) {
		Name =Human;
	}
	
	public String getName() {
		return Name;
		}
	
	public void setlocation(int a) {
		location=a;
		}
	
	public void setname(String a) {
		Name=a;
		}
	public int getMoney() {
		return money;
		}
	public ArrayList<Tier1> getShops() {
		return shops;
	}
	
	public void setShops( ArrayList<Tier1> a ){
		shops=a;
	}
	
	public void setRR( ArrayList<Railroads> a ){
		rr=a;
	}
	
	public void setMoney(int a) {
		money = a;
		
		}
	public void buyProp(Tier1 a) {
		shops.add(a);
	}
	
	public void buyRailroads(Railroads a) {
		rr.add(a);
	}
	
	
	public void buyUtil(Utility a) {
		ww.add(a);
	}
	public void print() {
		
		if(shops.size()>1) {
			System.out.print(Name+" owns ");
			for(int i=0;i<shops.size()-1;i++) {
				System.out.print(shops.get(i).getName()+", ");	
			}
			System.out.print("and " + shops.get(shops.size()-1).getName()+".");
		}
		if (shops.size()==1) {
			System.out.println(Name+ " owns "+ shops.get(0).getName()+"." );
		}
	}
	
	public ArrayList<Railroads> getRR(){
		return rr;
	}
	
	public void printutil() {
		if (ww.size()==1 && shops.size()==0) {
			System.out.println(Name+ " owns "+ ww.get(0).getName()+", which is a utility." );
		}
		else if (ww.size()==1 && shops.size()>0) {
			System.out.println(Name+ " also owns "+ ww.get(0).getName()+", which is a utility." );
		}
		
	}

	public void printRailroads() {
		
		if(rr.size()>1) {
			System.out.print(Name+" owns ");
			for(int i=0;i<rr.size()-1;i++) {
				System.out.print(rr.get(i).getName()+", ");	
			}
			System.out.print("and " + rr.get(rr.size()-1).getName()+".");
		}
		if (rr.size()==1) {
			System.out.println(Name+ " owns "+ rr.get(0).getName()+"." );
		}
	}
	
	public ArrayList<Utility> getUtil() {
		return ww;
	}
}


