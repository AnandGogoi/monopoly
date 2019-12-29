package monopoly;
import java.util.ArrayList;

public abstract class SquareType{
	  //stop here stop here stop here
	  private String name; 
	  private String tileType; 
	  private int owner; 

	
	public SquareType(String a, String b, int c) {
		name = a;
		tileType=b;
		owner=c;
	}



	public String getName(){
	    return name;
	  }
	  public void setName(String name){
	    this.name=name;
	  }
	  public String getTileType(){
	    return tileType;
	  }
	  public void setTileType(String tileType){
	    this.tileType=tileType;
	  }
	  public int getOwner(){
	    return owner;
	  }
	  public void setOwner(int a){
	    owner=a;
	  }
	}

