package monopoly;

public class house {
	int m1;
	int m2;
	int m3;
	int m4;
	int price;
	int ogprice;
	public house(int a, int b, int c, int d,int e,int f) {
		m1=a;
		m2=b;
		m3=c;
		m4=d;
		price=e;
		ogprice=f;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	public int getM3() {
		return m3;
	}
	public int getM4() {
		return m4;
	}
	public int getPrice() {
		return price;
	}
	public int getOgprice() {
		return ogprice;
	}
	
}
