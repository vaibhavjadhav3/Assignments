package javaproject1;

public class CallMax
{
	private int x;
	private int y;
	private int z;
	
	
	public int getx()
	{return x;}
	public void setx(int x)
	{this.x=x;}
	
	
	public int gety()
	{return x;}
	
	public void sety(int y)
	{this.y=y;}
	
	
	public int getz()
	{return z;}
	public void setz(int z)
	{this.z=z;}
	
	public  static int CallMax(int x,int y,int z) 
	{/*not needed this.x=x;
	this.y=y;
	this.z=z;*/
	{
		if (x >= y && x>= z) {return x;}
	         //System.out.println( x + " is the maximum number.");
	      else if (y >= x && y >= z) {return y;}
	         //System.out.println( y + " is the maximum number.");
	      else {return z;}
	         //System.out.println( z + " is the maximum number.");
		     //incorrect statement : System.out.println(return);
	}
	}
	

	public static void main(String[] args) 
	{ 
		CallMax case1;
		case1=new CallMax(); 
		System.out.println("HEllO,It took me 40 min");
				int max=CallMax(4,12,13);
				System.out.println(max);
	

	}

}
