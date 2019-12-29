package monopoly;
import java.util.Scanner;
import java.util.ArrayList;

public class board {// stop here stop here stop here
	
	public static void main(String[] args) {
		Tier1[] t1= new Tier1[2];
		
		Scanner lemon=new Scanner(System.in);
		String [] player1 = new String[27];
		String [] player2 = new String[27];
		Tier1 [] shops = new Tier1[27];
		Utility [] ww=new Utility[27];
		for (int i = 0; i<27; i++) {
			ww[i]=null;
		}
		for (int i = 0; i<27; i++) {
			shops[i]=null;
		}// stop here //stop here //stop here 
		ww[5]=new Utility("Water Works","utility",0,150);
		shops[1]=null;
		shops[2]= new Tier1("Goo Lagoon", "property",0, 30,2);
		shops[3]= new Tier1("Desk Factory", "property",0, 30,4);
		shops[4]= null;
		shops[5]= null;
		shops[6]= new Tier1("Mcjames", "property",0, 50,6);
		shops[7]= new Tier1("T5", "property",0, 60,8);
		shops[8]= null;
		shops[9]= new Tier1("Chaat Bhavaan", "property",0, 70,10);
		shops[10]= new Tier1("Elite", "property",0, 80,12);
		shops[11]= null;
		shops[12]= new Tier1("Steve in The Box", "property",0, 90,14);
		shops[13]= new Tier1("Atlantic Commons Theater", "property",0, 100,16);
		shops[14]= null;
		shops[15]= new Tier1("StarBucks", "property",0, 110,18);
		shops[16]= null;
		shops[17]= null;
		shops[18]= null;
		shops[19]= new Tier1("Tonie's Tacos", "property",0, 130,22);
		shops[20]= new Tier1("Pump University", "property",0, 140,24);
		shops[21]= null;
		shops[22]= new Tier1("48 Hour Fitness", "property",0, 150,26);
		shops[23]= new Tier1("Chunky Cheese", "property",0, 160,28);
		shops[24]= null;
		shops[25]= new Tier1("Will's Fargos", "property",0, 175,35);
		shops[26]= new Tier1("Tilted Towers", "property",0, 200,50);
		
		house [] houses = new house[27];
		houses[1]=null;
		houses[2]= new house(10,30,90,250,50,2);
		houses[3]= new house(20,60,180,450,50,4);
		houses[4]= null;
		houses[5]= null;
		houses[6]= new house(30,90,270,550,50,6);
		houses[7]= new house(40,100,300,600,50,8);
		houses[8]= null;
		houses[9]= new house( 50,150,450,750,100,10);
		houses[10]= new house(60,180,500,900,100,12);
		houses[11]= null;
		houses[12]= new house(70,200,550,950,100,14);
		houses[13]= new house(80,220,600,1000,100,16);
		houses[14]= null;
		houses[15]= new house(90,250,700,1050,150,18);
		houses[16]= null;
		houses[17]= null;
		houses[18]= null;
		houses[19]= new house(110,330,800,1150,150,22);
		houses[20]= new house(120,360,850,1200,150,24);
		houses[21]= null;
		houses[22]= new house(130,390,900,1275,200,26);
		houses[23]= new house(150,450,1000,1400,200,28);
		houses[24]= null;
		houses[25]= new house(175,500,1100,1500,200,35);
		houses[26]= new house(200,600,1400,2000,200,50);
		
		Hotel [] hotels = new Hotel[27];
		hotels[1]=null;
		hotels[2]= new Hotel(250,30,90,160,50,0);
		hotels[3]= new Hotel(450,60,180,320,50,0);
		hotels[4]= null;
		hotels[5]= null;
		hotels[6]= new Hotel(550,90,270,400,50,0);
		hotels[7]= new Hotel(600,100,300,450,50,0);
		hotels[8]= null;
		hotels[9]= new Hotel( 750,150,450,625,100,0);
		hotels[10]= new Hotel(900,180,500,700,100,0);
		hotels[11]= null;
		hotels[12]= new Hotel(950,200,550,750,100,0);
		hotels[13]= new Hotel(1000,220,600,800,100,0);
		hotels[14]= null;
		hotels[15]= new Hotel(1050,250,700,875,150,0);
		hotels[16]= null;
		hotels[17]= null;
		hotels[18]= null;
		hotels[19]= new Hotel(1150,330,800,975,150,0);
		hotels[20]= new Hotel(1200,360,850,10250,150,0);
		hotels[21]= null;
		hotels[22]= new Hotel(1275,390,900,1100,200,0);
		hotels[23]= new Hotel(1400,450,100,1200,200,0);
		hotels[24]= null;
		hotels[25]= new Hotel(1500,500,1100,1300,200,0);
		hotels[26]= new Hotel(2000,600,1400,1700,200,0);

		
		Railroads [] rail = new Railroads[27];
		for (int i = 0; i<27; i++) {
			rail[i]=null;
		}
		rail[4]= new Railroads("San Jose Railway", "property",0, 200,25);
		rail[11]= new Railroads("Irvington Railway", "property",0, 200,25);
		rail[17]= new Railroads("Logan Railway", "property",0, 200,25);
		rail[24]= new Railroads("Palm Railway", "property",0, 200,25);
		
		ArrayList<String> Chance1=new ArrayList<String>();
		ArrayList<String> Chance2=new ArrayList<String>();
		
		Chance1.add("Advance to Go.");//1
		Chance1.add("Advance to Tilted Towers.");//2
		Chance1.add("Cherity tax.");//3
		Chance1.add("Collect 100$.");//4
		Chance1.add("Pay 100 dollars to the the bank.");//5
		Chance1.add("Pay 250$ to the bank.");//7
		Chance1.add("The other player must pay you 300 dollars.");//8


		
		Player p1 = new Player(1,"Player 1",1500);
		Player p2 = new Player(1,"Player 2",1500);
		jail cell = new jail("jail", "jail", 0, false , false);
		printBoard(player1, player2,p1,p2);
		
		
		
		System.out.println("Welcome to Monopoly. The money is displayed on the right of the board. Player one please type \"ok\" \nto roll two dices.");
		
		int kill=3;
		int arrest=0;
		while (p1.getMoney()>0 && p2.getMoney()>0 ) {
			int roll1=rolldice(p1,cell);
			
			printBoard(player1, player2,p1,p2);
			chance(Chance1,Chance2,p1,p2,player1,player2,shops);
			luxuryTax(p1);
			buyww(ww,p1);
			buyProperty(shops, p1);
			buyRr(rail,p1);
			arrest(p1,cell);
			payww1(p2,p1,ww,roll1);
			payRent1(p2,p1,shops);
			payrr1(p2,p1, rail);
			
			p1.print();
			p1.printutil();
			p1.printRailroads();
			
			p2.print();
			p2.printutil();
			p2.printRailroads();
			sellProp1(p1,p2,shops);
			
			sellutil1(p1,p2,ww );
			sellrr1(p1,p2,rail);
			boolean cont = buyHouse(2,3,1,shops,hotels,houses,p1);
			if (cont==true) {cont = buyHouse(6,7,1,shops,hotels,houses,p1);}
			if (cont==true) {cont = buyHouse(9,10,1,shops,hotels,houses,p1);}
			if (cont==true) {cont = buyHouse(12,13,1,shops,hotels,houses,p1);}
			if (cont==true) {cont = buyHouse(19,20,1,shops,hotels,houses,p1);}
			if (cont==true) {cont = buyHouse(22,23,1,shops,hotels,houses,p1);}
			if (cont ==true) {cont = buyHouse(25,26,1,shops,hotels,houses,p1);}
			if (cont ==true) {cont = buyHousesb(25,26,1,shops,hotels,houses,p1);}
			sellhouse(1,shops,houses,p1);
			System.out.println();
			
			if(p1.getMoney()>0&& p2.getMoney()>0) {
				System.out.println("Player 2 please type \"ok\" to roll the two dices.");
				int roll2=rolldice(p2,cell);
				
			
				printBoard(player1, player2,p1,p2);
				chance(Chance1,Chance2,p2,p1,player1,player2,shops);
				luxuryTax(p2);
				buyww(ww,p2);
				buyRr(rail,p2);
				buyProperty(shops, p2);
				arrest(p2,cell);
				payRent2(p1, p2, shops);
				payRentrr2(p1,p2, rail);
				payww2(p1,p2,ww,roll2);
				
				p1.print();
				p1.printutil();
			
				p2.print();
				p2.printRailroads();
				p2.printutil();
				sellProp2(p2,p1,shops);
				sellutil2(p2,p1,ww );
				sellrr2(p2,p1,rail);
				boolean cont1 = buyHouse(2,3,2,shops,hotels,houses,p2);
				if (cont1==true) {cont1 = buyHouse(6,7,2,shops,hotels,houses,p2);}
				if (cont1==true) {cont1 = buyHouse(9,10,2,shops,hotels,houses,p2);}
				if (cont1==true) {cont1 = buyHouse(12,13,2,shops,hotels,houses,p2);}
				if (cont1==true) {cont1 = buyHouse(19,20,2,shops,hotels,houses,p2);}
				if (cont1==true) {cont1 = buyHouse(22,23,2,shops,hotels,houses,p2);}
				if (cont1 ==true) {cont1 = buyHouse(25,26,2,shops,hotels,houses,p2);}
				if (cont1 ==true) {cont1 = buyHousesb(25,26,2,shops,hotels,houses,p2);}
				sellhouse(2,shops,houses,p2);
				System.out.println("Player 1 please type \"ok\" to roll the two dices.");
			}
			
			
		}
		if(p2.getMoney()>0) {
			System.out.println("Player two wins.");
		}
		else {
			System.out.println("Player one wins.");
		}
	}	
		
	public static void printBoard(String[]player1, String[]player2, Player p1, Player p2) {
		for(int i=0; i<=26;i++) {
				player1[i]=" ";
			}
		for(int i=0; i<=26;i++) {
				player2[i]=" ";
			}
		
		player1[p1.getlocation()]="1";
		player2[p2.getlocation()]="2";
		
		System.out.println(" ___________ ___________ ___________ ___________ ___________ ___________ ___________ ___________");
		System.out.println("|Start      |Goo        |Desk       |San Jose   |   Water   |McJames    |T5         |Jail       |");
		System.out.println("|here       |Lagoon     |Factory    |RailWay    |   Works   |           |           |  | | | |  |");
		System.out.println("| ------>  "+ player2[1]+"|          "+ player2[2]+"|          "+ player2[3]+"|          "+ player2[4]+"|  utility "+ player2[5]+"|          "+ player2[6]+"|          "+ player2[7]+"|  | | | | "+ player2[8]+"|");
		System.out.println("| +200$    "+ player1[1]+"|Tier 1    "+ player1[2]+"|Tier 1    "+ player1[3]+"|          "+ player1[4]+"|          "+ player1[5]+"|Tier 2    "+ player1[6]+"|Tier 2    "+ player1[7]+"|  | | | | "+ player1[8]+"|");
		System.out.println("|___________|___________|___________|___________|___________|___________|___________|___________| Player one has "+ p1.getMoney()+"$." );
		System.out.println(" ___________                                                                         ___________");
		System.out.println("|Tilted     |                                                                       |Chaat      | Player two has "+ p2.getMoney()+"$." );
		System.out.println("|Towers     |                                                                       |Bhavaan    |");
		System.out.println("|          "+ player2[26]+"|                                                                       |          "+ player2[9]+"|");
		System.out.println("|Tier 8    "+ player1[26]+"|                                                                       |Tier 3    "+ player1[9]+"|");
		System.out.println("|___________|                                                                       |___________|");
		System.out.println("|Will's     |                                                                       |Elite      |");
		System.out.println("|Fargos     |                                                                       |           |");
		System.out.println("|          "+ player2[25]+"|                                                                       |          "+ player2[10]+"|");
		System.out.println("|Tier 8    "+ player1[25]+"|                                                                       |Tier 3    "+ player1[10]+"|");
		System.out.println("|___________|                                                                       |___________|");
		System.out.println("|Palm       |                                                                       |Irvington  |");
		System.out.println("|RailWay    |                                                                       |RailWay    |");
		System.out.println("|          "+ player2[24]+"|                                                                       |          "+ player2[11]+"|");
		System.out.println("|          "+ player1[24]+"|                                                                       |          "+ player1[11]+"|");
		System.out.println("|___________|                                                                       |___________|");
		System.out.println("|Chunky     |                                                                       |Steve in   |");
		System.out.println("|Cheese     |                                                                       |the Box    |");
		System.out.println("|          "+ player2[23]+"|                                                                       |          "+ player2[12]+"|");
		System.out.println("|Tier 7    "+ player1[23]+"|                                                                       |Tier 4    "+ player1[12]+"|");
		System.out.println("|___________|                                                                       |___________|");
		System.out.println("|48 Hour    |                                                                       |Atlantic   |");
		System.out.println("|Fitness    |                                                                       |Commons    |");
		System.out.println("|          "+ player2[22]+"|                                                                       |Theater   "+ player2[13]+"|");
		System.out.println("|Tier 7    "+ player1[22]+"|                                                                       |Tier 4    "+ player1[13]+"|");
		System.out.println("|___________|                                                                       |___________|");
		System.out.println(" _______________________________________________________________________________________________");
		System.out.println("|Go To      |Pump       |Tonie's    |  ___      |Logan      |  Luxury   |StarBucks  |Free       |");
		System.out.println("|Jail       |University |Tacos      |  ___|     |RailWay    |   Tax     |           |Parking    |");
		System.out.println("|          "+ player2[21]+"|          "+ player2[20]+"|          "+ player2[19]+"| |        "+ player2[18]+"|          "+ player2[17]+"|          "+ player2[16]+"|          "+ player2[15]+"|          "+ player2[14]+"|");
		System.out.println("|          "+ player1[21]+"|Tier 6    "+ player1[20]+"|Tier 6    "+ player1[19]+"| .Chance  "+ player1[18]+"|          "+ player1[17]+"|  pay 75$ "+ player1[16]+"|Tier 5    "+ player1[15]+"|          "+ player1[14]+"|");
		System.out.println("|___________|___________|___________|___________|___________|___________|___________|___________|");                                                                    
		
	}
	
	public static void printproperty(Tier1[] a) {
		int x = 0;
		System.out.print("Player one owns");
		for (int i = 0; i<27; i++) {
			if(a[i]!=null && a[i].getOwner()==1) {
				if (x==0) {
					System.out.print(" ");
					System.out.println(a[i].getName());
					x++;
				}
				if(x!=0) {
					System.out.print(" ");
					System.out.println(a[i].getName()+", ");
				}
			}
		}
		if (x==0) {
			System.out.print(" nothing.");
			System.out.println();
		}
		int xi = 0;
		System.out.print("Player two owns");
		for (int i = 0; i<27; i++) {
			if(a[i]!=null && a[i].getOwner()==2) {
				System.out.print(" ");
				System.out.println(a[i].getName()+", ");
				xi++;
			}
		}
		if (xi==0) {
			System.out.print(" nothing.");
			System.out.println();
		}
	}
	
	public static int rolldice(Player p, jail b) {
		Scanner lemon=new Scanner(System.in);
		int x=4;
		int firstplace=p.getlocation();
		int totmove;
		int roll1 = 0;
		int roll2=0;
		while (x==4) {
			String roll=lemon.nextLine();
			if (roll.equals("ok")) {
				roll1=(int) (Math.random()*5)+1;
				System.out.println("Your first roll yeiled a "+ roll1);
				roll2=(int) (Math.random()*5)+1;
				System.out.println("Your second roll yeiled a "+ roll2);
				totmove=roll1+roll2;
				if ((p.getlocation()+roll1+roll2)>26) {
					p.setMoney(p.getMoney()+200);
					p.setlocation(p.getlocation()+roll1+roll2-26);
					x=32312;
					}
				
				
				else {
					p.setlocation(p.getlocation()+roll1+roll2);
					x=362;
					}
				}
				
			else{
				System.out.println("This is not valid. Type \"ok\" to roll two dices");
				}
			
			
			}
		
		if (b.getPrisoner1()==true && p.getName().equals("Player 1") && roll1==roll2) {
			System.out.println("Player one your dice rolls were identical. You are free.");
			b.setPrisoner1(false);
		}
		
		if (b.getPrisoner2()==true && p.getName().equals("Player 2") && roll1==roll2) {
			System.out.println("Player two your dice rolls were identical. You are free.");
			b.setPrisoner2(false);
		}
		
		
		if (b.getPrisoner1()==true && p.getName().equals("Player 1") && roll1!=roll2) {
			p.setlocation(firstplace);
			System.out.println("Your dice rolls were not identical so you are still in jail. This is p1");
		}
		if (b.getPrisoner2()==true && p.getName().equals("Player 2") && roll1!=roll2) {
			p.setlocation(firstplace);
			System.out.println("Your dice rolls were not identical so you are still in jail. This is p2");
		}
		return roll1+roll2;
		
	}
		
	public static void arrest(Player a, jail b) {
		if (a.getlocation()==21) {
				
			if (a.getName().equals("Player 1")) {
				a.setlocation(8);
				b.setPrisoner1(true);
				System.out.println("Player one, you have been arrested");
			}
			else if (a.getName().equals("Player 2")) {
				a.setlocation(8);
				b.setPrisoner2(true);
				System.out.println("Player two, you have been arrested.");
			}
		}
		
	}
	
	public static void buyProperty(Tier1 [] shops,Player p1) {

		Scanner lemon = new Scanner(System.in);
		if (shops[p1.getlocation()]!=null && shops[p1.getlocation()].getOwner()==0) {
			System.out.println(p1.getName()+" you have landed on "+ shops[p1.getlocation()].getName()+". It costs "
			+ shops[p1.getlocation()].getMortgage()+"$. The rent is "+shops[p1.getlocation()].getRent()+"$. Press k to buy it.\n"
					+ "Press any thing else to not buy it and continue");
			String choice = lemon.nextLine();
			if(choice.equals("k")) {
				shops[p1.getlocation()].buy(p1);
				p1.buyProp((shops[p1.getlocation()]));
				//p1.buyProp(shops[p1.getlocation()]);
			}
		}
	}

	public static void payRent2(Player p1, Player p2, Tier1 [] shops) {
		if (shops[p2.getlocation()]!=null && shops[p2.getlocation()].getOwner()==1) {
			System.out.println(p2.getName()+" you have landed on " + p1.getName()+ "'s property. " + shops[p2.getlocation()].getRent()+"$ has been taken from your bank account \nand given to the owner. The transaction will show up the next time the board is printed.\nReminder( Each player's money is printed on the right.)");
			shops[p2.getlocation()].rent(p1,p2);
		}
	}
	
	public static void payRent1(Player p1, Player p2,Tier1[] shops) {

		if (shops[p2.getlocation()]!=null && shops[p2.getlocation()].getOwner()==2) {
			System.out.println(p2.getName()+" you have landed on " + p1.getName()+ "'s property. " + shops[p2.getlocation()].getRent()+"$ has been taken from your bank account \nand given to the owner. The transaction will show up the next time the board is printed.\nReminder( Each player's money is printed on the right.)");
			shops[p2.getlocation()].rent(p1,p2);
		}
	}

    public static void sellProp1(Player p1,Player p2,Tier1[] shops) {
    	if (p1.getShops().size()!=0) {
    	int x0;//stop here stop here stop here stop here stop hrer stop here sotp hre
    	ArrayList<Tier1> newlist=new ArrayList<Tier1>();
    	int []number= new int[15];
    	for(int sa=0;sa<15;sa++) {
    		number[sa]=54;
    	}
    		System.out.println("\nPlayer 1 press s if would like to sell any of these properties. Press anything else if you dont \nwant to sell anything");
    		Scanner lemon=new Scanner(System.in);
    		String choice=lemon.nextLine();
    		
    		
    		if (choice.equals("s")) {
    			
    			for(int i=0;i<(p1.getShops().size());i++) {
    				System.out.println("Press s to sell "+p1.getShops().get(i).getName()+" to the bank. Press k to sell it to the other player. Press anything \nelse to not sell it. It will be sold for "+ p1.getShops().get(i).getMortgage()+"$. which is the original mortgage.");
    				String choice1=lemon.nextLine();
    				if (choice1.equals("s")) {
    					p1.setMoney(p1.getMoney()+p1.getShops().get(i).getMortgage());
    					p1.getShops().get(i).setOwner(0);
    					//p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else if (choice1.equals("k")) {
    					p1.getShops().get(i).setOwner(2);
    					p2.setMoney(p2.getMoney()-p1.getShops().get(i).getMortgage());
    					p1.setMoney(p1.getMoney()+p1.getShops().get(i).getMortgage());
    					p2.buyProp(p1.getShops().get(i));
    					//p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else { 
    					newlist.add(p1.getShops().get(i));
    				}
    				
    			}
//    			for(int ib=0;ib<15;ib++) {
//    				if (number[ib]!=54) {
//    					p1.getShops().remove(ib);
//    				}
//    			}
    			p1.setShops(newlist);
    		
    		}
    		
    	}
    }
   
    public static void sellProp2(Player p1,Player p2,Tier1[] shops) {
    	if (p1.getShops().size()!=0) {
    	int x=3;
    	ArrayList<Tier1> newlist=new ArrayList<Tier1>();
    	int []number= new int[15];
    	for(int sa=0;sa<15;sa++) {
    		number[sa]=54;
    	}
    		System.out.println("\nPlayer 2 press s if would like to sell any of these properties. Press anything else if you dont \nwant to sell anything");
    		Scanner lemon=new Scanner(System.in);
    		String choice=lemon.nextLine();
    		
    		
    		if (choice.equals("s")) {
    			
    			for(int i=0;i<p1.getShops().size();i++) {
    				System.out.println("Press s to sell "+p1.getShops().get(i).getName()+" to the bank. Press k to sell it to the other player. Press anything \nelse to not sell it. It will be sold for "+ p1.getShops().get(i).getMortgage()+"$. which is the original mortgage.");
    				String choice1=lemon.nextLine();
    				if (choice1.equals("s")) {
    					p1.setMoney(p1.getMoney()+p1.getShops().get(i).getMortgage());
    					p1.getShops().get(i).setOwner(0);
    				  //p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else if (choice1.equals("k")) {
    					p1.getShops().get(i).setOwner(1);
    					p2.setMoney(p2.getMoney()-p1.getShops().get(i).getMortgage());
    					p1.setMoney(p1.getMoney()+p1.getShops().get(i).getMortgage());
    					p2.buyProp(p1.getShops().get(i));
    				  //p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else { 
    					newlist.add(p1.getShops().get(i));
    				}
    				
    			}
    			p1.setShops(newlist);
    		}
    		else {
    			x=1424;
    		}
    	
    	}
    }

    public static void luxuryTax(Player a) {
    	if(a.getlocation()==16) {
    		System.out.println(a.getName()+" You have landed on luxury tax. You will now pay 75 dollars. This will show up on the left next time the board prints.");
    		a.setMoney(a.getMoney()-75);
    	}
    }

    public static void buyww(Utility [] shops,Player p1) {
    	Scanner lemon = new Scanner(System.in);
		if (shops[p1.getlocation()]!=null && shops[p1.getlocation()].getOwner()==0) {
			System.out.println(p1.getName()+" you have landed on "+ shops[p1.getlocation()].getName()+". It costs "
			+ shops[p1.getlocation()].getMortgage()+"$. The rent is the amount of the player roll\nwhen they land on that spot times 4$. Press k to buy it. "
					+ "Press any thing else to not buy it and \ncontinue.");
			String choice = lemon.nextLine();
			if(choice.equals("k")) {
				shops[p1.getlocation()].buy(p1);
				p1.buyUtil((shops[p1.getlocation()]));
				//p1.buyProp(shops[p1.getlocation()]);
			}
		}
    }

    public static void payww2(Player p1, Player p2, Utility [] shops,int c) {
    	if (shops[p2.getlocation()]!=null && shops[p2.getlocation()].getOwner()==1) {
			System.out.println(p2.getName()+" you have landed on " + p1.getName()+ "'s property. Your roll times 4 dollars has been taken from your bank account \nand given to the owner. The transaction will show up the next time the board is printed.\nReminder( Each player's money is printed on the right.)");
			shops[p2.getlocation()].payRent(p1,p2,c);
		}
    }
    
    public static void payww1(Player p1, Player p2, Utility [] shops,int c) {
    	if (shops[p2.getlocation()]!=null && shops[p2.getlocation()].getOwner()==2) {
			System.out.println(p2.getName()+" you have landed on " + p1.getName()+ "'s property. Your roll times 4 dollars has been taken from your bank account \nand given to the owner. The transaction will show up the next time the board is printed.\nReminder( Each player's money is printed on the right.)");
			shops[p2.getlocation()].payRent(p1,p2,c);
		}
    }

    public static void sellutil2(Player p1,Player p2,Utility[] shops) {

    	if (p1.getUtil().size()!=0) {
    	int x=3;
    	
    		System.out.println("\nPlayer 2 press s if would like to sell water works to the bank. \nPress k to sell it to player one. Press anything else to not sell it.");
    		Scanner lemon=new Scanner(System.in);
    		String choice=lemon.nextLine();
    		
    		
    		if (choice.equals("s")) {
    			
    			
    					p1.setMoney(p1.getMoney()+150);
    					p1.getUtil().get(0).setOwner(0);
    					p1.getUtil().remove(0);

    					
    				}
    		else 	if (choice.equals("k")) {
    					p1.getUtil().get(0).setOwner(1);
    					p2.setMoney(p2.getMoney()-150);
    					p1.setMoney(p1.getMoney()+150);
    					p2.buyUtil(p1.getUtil().get(0));
    					p1.getUtil().remove(0);

    					
    				}
    				
    			
    		
    		
    		
    	
    	}
    }

    public static void sellutil1(Player p1,Player p2,Utility[] shops) {
     	if (p1.getUtil().size()!=0) {
        	int x=3;
        	System.out.println("\nPlayer 1 press s if would like to sell water works to the bank. \nPress k to sell it to player 2. Press anything else to not sell it.");
        	Scanner lemon=new Scanner(System.in);
        	String choice=lemon.nextLine();
        	if (choice.equals("s")) {
        			p1.setMoney(p1.getMoney()+150);
        			p1.getUtil().get(0).setOwner(0);
        			p1.getUtil().remove(0);
        			
        			}
        	else 	if (choice.equals("k")) {
        			p1.getUtil().get(0).setOwner(2);
        				p2.setMoney(p2.getMoney()-150);
        			p1.setMoney(p1.getMoney()+150);
        			p2.buyUtil(p1.getUtil().get(0));
        			p1.getUtil().remove(0);
        					
        		}
        	
        	}
    }
   
    public static void chance(ArrayList<String> Chance1,ArrayList<String> Chance2, Player p1, Player p2,String[]player1, String[]player2,Tier1 [] shops) {
    	
    	if(p1.getlocation()==18) {
    		Scanner lemon=new Scanner(System.in);
    		if(Chance1.size()==0) {
    			ArrayList<String> Chance3=new ArrayList<String>();
    			Chance3=Chance2;
    			Chance2=Chance1;
    			Chance1=Chance3;
    		}
    		int steve =(int) (Math.random()*Chance1.size());
    		String job= Chance1.get(steve);
    		System.out.println(p1.getName()+" you have landed on Chance. Press anything to pick a card.");
    		String nothing = lemon.nextLine();
    		Chance2.add(job);
    		Chance1.remove(steve);
    		
    		if(job.equals("Advance to Go.")) {
    			p1.setlocation(1);
    			p1.setMoney(p1.getMoney()+200);
    			
    			if(p1.getName().equals("Player 1")) {
    				printBoard(player1, player2, p1, p2);
    			}
    			
    			if(p1.getName().equals("Player 2")) {
    				printBoard(player1, player2, p2, p1);
    			}
    			System.out.println("You have drawn \"advance to go.\" Your piece has been moved to the starting spot and you have gained 200 hundred dollars." );
    		}
    		if(job.equals("Advance to Tilted Towers.")) {
    			p1.setlocation(26);
    			
    			
    			if(p1.getName().equals("Player 1")) {
    				printBoard(player1, player2, p1, p2);
    				System.out.println("You have drawn \"Advance to Tilted Towers.\" Your piece has been moved to tilted towers." );
    	    		
    				//buyProperty(shops, p1);
    				//payRent1(p2,p1,shops);
    				
    			}
    			
    			if(p1.getName().equals("Player 2")) {
    				printBoard(player1, player2, p2, p1);
    				System.out.println("You have drawn \"Advance to Tilted Towers.\" Your piece has been moved to tilted towers." );
    	    		
    			}
    			
    		}
    		if(job.equals("Cherity tax.")) {
    			System.out.println("You have drawn cherity tax. 100 dollars has been payed to the other player.This will show\nup the next time the board prints.");
    			p1.setMoney(p1.getMoney()-100);
    			p2.setMoney(p2.getMoney()+100);
    		}
    		if(job.equals("Collect 100$.")) {
    			System.out.println("You have drawn Collect 100$. 100 dollars have been transfered to your account. This will show\nup the next time the board prints.");
    			p1.setMoney(p1.getMoney()+100);
    		
    		}
    		if(job.equals("Pay 100 dollars to the the bank.")) {
    			System.out.println("You have drawn Pay 100 dollars to the the bank. 100 dollars have been taken from your account. This will show\nup the next time the board prints.");
    			p1.setMoney(p1.getMoney()-100);
    		
    		}
    		if(job.equals("Pay 250$ to the bank.")) {
    			System.out.println("You have drawn Pay 250 dollars to the the bank. 250 dollars have been taken from your account. This will show\nup the next time the board prints.");
    			p1.setMoney(p1.getMoney()-250);
    		
    		}
    		if(job.equals("The other player must pay you 300 dollars.")) {
    			System.out.println("You have drawn The other player must pay you 300 dollars. 300 dollars have been taken from "+p2.getName() +"'s account. This will show\nup the next time the board prints.");
    			p1.setMoney(p1.getMoney()+300);
    			p2.setMoney(p2.getMoney()-300);
    		
    		}
    		
    		
    		
    		
    	}
    }

    public static void buyRr(Railroads [] shops,Player p1) {

		Scanner lemon = new Scanner(System.in);
		if (shops[p1.getlocation()]!=null && shops[p1.getlocation()].getOwner()==0) {
			System.out.println(p1.getName()+" you have landed on "+ shops[p1.getlocation()].getName()+". It costs "
			+ shops[p1.getlocation()].getMortgage()+"$. The rent is 25$. If you own two\nrailroads the rent is 50$. Three rail roads makes the rent 100 dollars. 4 Rail roads makes it 200 dollars. Press k to buy it."
					+ " Press any thing else to not buy it and continue.");
			String choice = lemon.nextLine();
			if(choice.equals("k")) {
				shops[p1.getlocation()].buy(p1);
				p1.buyRailroads((shops[p1.getlocation()]));
				//p1.buyProp(shops[p1.getlocation()]);
			}
		}
	}   
    public static void payRentrr2(Player p1, Player p2, Railroads [] shops) {
		if (shops[p2.getlocation()]!=null && shops[p2.getlocation()].getOwner()==1) {
			shops[p2.getlocation()].cent(p1,p2);
			System.out.println(p2.getName()+" you have landed on " + p1.getName()+ "'s railroad. " + "Since the owner has "+p1.getRR().size()+" rail roads the rent is " +shops[p2.getlocation()].getRent() +".\nThe transaction will show up the next time the board is printed.\nReminder( Each player's money is printed on the right.)");
			
		}
	}
    public static void payrr1(Player p1, Player p2,Railroads[] shops) {
    	if (shops[p2.getlocation()]!=null && shops[p2.getlocation()].getOwner()==2) {
    		shops[p2.getlocation()].cent(p1,p2);
    		System.out.println(p2.getName()+" you have landed on " + p1.getName()+ "'s railroad. " + "Since the owner has "+p1.getRR().size()+" rail roads the rent is " +shops[p2.getlocation()].getRent() +".\nThe transaction will show up the next time the board is printed.\nReminder( Each player's money is printed on the right.)");
			
		}
    }
    public static void sellrr1(Player p1,Player p2,Railroads[] shops) {
    	if (p1.getRR().size()!=0) {
    	int x0;//stop here stop here stop here stop here stop hrer stop here sotp hre
    	ArrayList<Railroads> newlist=new ArrayList<Railroads>();
    	int []number= new int[15];
    	for(int sa=0;sa<15;sa++) {
    		number[sa]=54;
    	}
    		System.out.println("\nPlayer 1 press s if would like to sell any of the rail roads. Press anything else if you dont \nwant to sell anything");
    		Scanner lemon=new Scanner(System.in);
    		String choice=lemon.nextLine();
    		
    		
    		if (choice.equals("s")) {
    			
    			for(int i=0;i<(p1.getRR().size());i++) {
    				System.out.println("Press s to sell "+p1.getRR().get(i).getName()+" to the bank. Press k to sell it to the other player. Press anything \nelse to not sell it. It will be sold for "+ p1.getRR().get(i).getMortgage()+"$. which is the original mortgage.");
    				String choice1=lemon.nextLine();
    				if (choice1.equals("s")) {
    					p1.setMoney(p1.getMoney()+p1.getRR().get(i).getMortgage());
    					p1.getRR().get(i).setOwner(0);
    					//p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else if (choice1.equals("k")) {
    					p1.getRR().get(i).setOwner(2);
    					p2.setMoney(p2.getMoney()-p1.getRR().get(i).getMortgage());
    					p1.setMoney(p1.getMoney()+p1.getRR().get(i).getMortgage());
    					p2.getRR().add((p1.getRR().get(i)));
    					//p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else { 
    					newlist.add(p1.getRR().get(i));
    				}
    				
    			}
//    			for(int ib=0;ib<15;ib++) {
//    				if (number[ib]!=54) {
//    					p1.getShops().remove(ib);
//    				}
//    			}
    			p1.setRR(newlist);
    		
    		}
    		
    	}
    }
    public static void sellrr2(Player p1,Player p2,Railroads[] shops) {
    	if (p1.getRR().size()!=0) {
    	int x0;//stop here stop here stop here stop here stop hrer stop here sotp hre
    	ArrayList<Railroads> newlist=new ArrayList<Railroads>();
    	int []number= new int[15];
    	for(int sa=0;sa<15;sa++) {
    		number[sa]=54;
    	}
    		System.out.println("\nPlayer 2 press s if would like to sell any of the rail roads. Press anything else if you dont \nwant to sell anything");
    		Scanner lemon=new Scanner(System.in);
    		String choice=lemon.nextLine();
    		
    		
    		if (choice.equals("s")) {
    			
    			for(int i=0;i<(p1.getRR().size());i++) {
    				System.out.println("Press s to sell "+p1.getRR().get(i).getName()+" to the bank. Press k to sell it to the other player. Press anything \nelse to not sell it. It will be sold for "+ p1.getRR().get(i).getMortgage()+"$. which is the original mortgage.");
    				String choice1=lemon.nextLine();
    				if (choice1.equals("s")) {
    					p1.setMoney(p1.getMoney()+p1.getRR().get(i).getMortgage());
    					p1.getRR().get(i).setOwner(0);
    					//p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else if (choice1.equals("k")) {
    					p1.getRR().get(i).setOwner(1);
    					p2.setMoney(p2.getMoney()-p1.getRR().get(i).getMortgage());
    					p1.setMoney(p1.getMoney()+p1.getRR().get(i).getMortgage());
    					p2.getRR().add((p1.getRR().get(i)));
    					//p1.getShops().remove(i);
    					number[i]=i;
    					
    				}
    				else { 
    					newlist.add(p1.getRR().get(i));
    				}
    				
    			}
//    			for(int ib=0;ib<15;ib++) {
//    				if (number[ib]!=54) {
//    					p1.getShops().remove(ib);
//    				}
//    			}
    			p1.setRR(newlist);
    		
    		}
    		
    	}
    }
    public static boolean buyHouse(int a, int b , int c,Tier1 [] shops,Hotel [] hotels,house [] houses,Player p1) {
    	boolean housecheck=true;
    	boolean x= true;
    	String [] z = new String[27];
    	z[0]="a";z[1]="b";z[2]="c";z[3]="e";z[4]="f";z[5]="g";z[6]="h";z[7]="i";z[8]="j";
    	z[9]="k";z[10]="l";z[11]="m";z[12]="n";z[13]="o";z[14]="p";z[15]="q";z[16]="r";z[17]="s";
    	z[18]="t";z[19]="u";z[20]="v";z[21]="w";z[22]="x";z[23]="y";z[24]="z";z[25]="za";z[26]="zb";
    	ArrayList<Tier1> he=new ArrayList<Tier1>();
    	ArrayList<Integer> ww=new ArrayList<Integer>();
    	for(int v=a;v<=b;v++) {
    		if (shops[v].getOwner()!=c) {
    			x=false;
    		}
    		if (shops[v].getOwner()==c) {
    			ww.add(v);
    			he.add(shops[v]);
    		}
    		
    	}
    	if (x==true){
    		System.out.print("You can buy a house at ");
    		for(int fed=0;fed<ww.size()-1;fed++) {
    			System.out.print(shops[ww.get(fed)].getName()+", ");
    		
    		}
    		System.out.println("and "+shops[ww.get(ww.size()-1)].getName()+".");
        	System.out.println("You can only buy one house per turn. Press x if you would like to buy a house at these places. Press anything \nelse if you dont want to buy a house.");
        	Scanner lemon = new Scanner(System.in);
        	String choice= lemon.nextLine();
        	if (choice.equals("x")) {
        		housecheck =house(shops,houses,a,housecheck,p1,hotels);
        		if (housecheck==true) {
        			housecheck = house(shops,houses,b,housecheck,p1,hotels);
        		 }
        		
        	}
        		
    	}
    	return housecheck;
    	
    
    }
    public static boolean house(Tier1 [] shops,house [] houses,int a,boolean housecheck,Player p1,Hotel [] hotels) {
    	
    	Scanner lemon=new Scanner(System.in);
    	System.out.println("Press s to buy a house at "+shops[a].getName()+"$. Press anything else to not buy a house there.");
		System.out.println("One house will make the rent "+ houses[a].getM1()+"$. Two houses will make the rent "+ houses[a].getM2()+"$.Three houses will \nmake the rent "+ houses[a].getM3()+"$. Four houses which is automatically a hotel makes the rent " +hotels[a].getM1()+"$.");
		System.out.println("It will cost "+houses[a].getPrice()+"$.");
		String choice1= lemon.nextLine();
		if (choice1.equals("s")&& shops[a].getRent()==(houses[a].getM4()) ) {
			
			System.out.print("You all ready have a hotel here. You can't increase the rent any more.");
			
		}
		if (choice1.equals("s")&& shops[a].getRent()>(houses[a].getM3()-1) && shops[a].getRent()<houses[a].getM4()) {
			housecheck=false;
			shops[a].setRent(houses[a].getM4());
			p1.setMoney(p1.getMoney()-houses[a].getPrice());
			System.out.print("You have bought 4 houses which makes it a hotel.");
			
		}
		if (choice1.equals("s")&& shops[a].getRent()>(houses[a].getM2()-1) && shops[a].getRent()<houses[a].getM3()) {
			housecheck = false;
			shops[a].setRent(houses[a].getM3());
			p1.setMoney(p1.getMoney()-houses[a].getPrice());
			System.out.print("This is ur third house on this property.");
			
		}
		if (choice1.equals("s")&& shops[a].getRent()>(houses[a].getM1()-1) && shops[a].getRent()<houses[a].getM2()) {
			housecheck = false;
			shops[a].setRent(houses[a].getM2());
			p1.setMoney(p1.getMoney()-houses[a].getPrice());
			System.out.print("This is ur second house on this property.");
			
		}
		if (choice1.equals("s") && shops[a].getRent()<houses[a].getM1()) {
			housecheck=false;
			
			shops[a].setRent(houses[a].getM1());
			p1.setMoney(p1.getMoney()-houses[a].getPrice());
			
		}
		return housecheck;
    }
    public static boolean buyHousesb(int a, int b , int c,Tier1 [] shops,Hotel [] hotels,house [] houses,Player p1) {
    	boolean housecheck=true;
    	
    	if (shops[15].getOwner()==c){
    		System.out.print("You can buy a house at starbucks.");
 
        		housecheck =house(shops,houses,15,housecheck,p1,hotels);
        		
        		
    	}
    	return housecheck;
    	
    
    }
    public static void sellhouse(int c,Tier1 [] shops,house [] houses,Player p1 ) {
    	boolean giveaway= true;
    	for(int fd = 0; fd<shops.length;fd++ ) {
    		if(shops[fd]==null) {
    			continue;
    		}
    		if(shops[fd].getOwner()==c && shops[fd].getRent()!=houses[fd].getOgprice()) {
    			giveaway=false;
    		}
    	}
    	if (giveaway==false) {
    	Scanner lemon = new Scanner (System.in);
    	System.out.println("\n"+p1.getName() + ", press x if you would you like to sell any of your houses back to the bank.\nPress any thing else to not sell them.");
    	String choice = lemon.nextLine();
    	if (choice.equals("x")) {
    		for(int i = 0; i<shops.length;i++) {
    			if(shops[i]==null) {
        			continue;
        		}
    			if(shops[i].getOwner()==c && shops[i].getRent()==houses[i].getM1()) {
    				System.out.println("You have one house on " +shops[i].getName() +". Press x to sell it. Press anything else to not sell it.");
    				String sell=lemon.nextLine();
    				if (sell.equals("x")) {
    					shops[i].setRent(houses[i].getOgprice());
    					p1.setMoney(p1.getMoney()+houses[i].getPrice());
    				}
    			}
    			if(shops[i].getOwner()==c && shops[i].getRent()==houses[i].getM2()) {
    				System.out.println("You have two house on " +shops[i].getName() +". Press x to sell one. Press c to sell two. Press anything else to not sell it.");
    				String sell=lemon.nextLine();
    				if (sell.equals("c")) {
    					shops[i].setRent(houses[i].getOgprice());
    					p1.setMoney(p1.getMoney()+houses[i].getPrice()*2);
    				}
    				if (sell.equals("x")) {
    					shops[i].setRent(houses[i].getM1());
    					p1.setMoney(p1.getMoney()+houses[i].getPrice());
    				}
    				
    			}
    			if(shops[i].getOwner()==c && shops[i].getRent()==houses[i].getM3()) {
    				System.out.println("You have three house on " +shops[i].getName() +". Press x to sell one. Press c to sell two. Press d to sell thee. Press anything else to not sell it.");
    				String sell=lemon.nextLine();
    				if (sell.equals("c")) {
    					shops[i].setRent(houses[i].getM1());
    					p1.setMoney(p1.getMoney()+houses[i].getPrice()*2);
    				}
    				if (sell.equals("x")) {
    					shops[i].setRent(houses[i].getM2());
    					p1.setMoney(p1.getMoney()+houses[i].getPrice());
    				}
    				if (sell.equals("d")) {
    					shops[i].setRent(houses[i].getOgprice());
    					p1.setMoney(p1.getMoney()+houses[i].getPrice()*3);
    				}
    				
    			}
    			if(shops[i].getOwner()==c && shops[i].getRent()==houses[i].getM4()) {
    				System.out.println("You have one hotel on " +shops[i].getName() +". Press x to sell it. Press anything else to not sell it.");
    				String sell=lemon.nextLine();
    				if (sell.equals("x")) {
    					shops[i].setRent(houses[i].getOgprice());
    					p1.setMoney(p1.getMoney()+houses[i].getPrice());
    				}
    			}
    			
    		}
    	}
    	}
    }






}




