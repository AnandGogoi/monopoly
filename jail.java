package monopoly;
import java.util.ArrayList;
// stop here stop here stop here
public class jail extends SquareType {
	boolean prisoner1;
	boolean prisoner2;
	
	public jail (String a, String b, int c, boolean d, boolean f) {
		super (a,b,c);
		prisoner1=d;
		prisoner2=f;
	}
	
	public boolean getPrisoner1() {
		return prisoner1;
	}
	public void setPrisoner1(boolean a) {
		prisoner1=a;
	}
	
	public boolean getPrisoner2() {
		return prisoner2;
	}
	public void setPrisoner2(boolean a) {
		prisoner2=a;
	}
	
	
	
	
}
