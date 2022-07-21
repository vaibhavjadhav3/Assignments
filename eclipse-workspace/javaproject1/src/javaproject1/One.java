package javaproject1;

public class callMax
{
	private int x;
	private int y;
	private int z;
	
	
	public int getx()
	{
		return x;
		
	}
	public void setx(int x)
	{
		this.x=x;
	}
	
	
	public int gety()
	{
		return x;
		
	}
	public void sety(int y)
	{
		this.y=y;
	}
	
	
	public int getz()
	{
		return z;
		
	}
	public void setz(int z)
	{
		this.z=z;
	}
	
	static int callMax(int x,int y,int z)
	
	{
		if (x >= y && x>= z)
	         return x;//System.out.println( x + " is the maximum number.");
	      else if (y >= x && y >= z)
	         return y;//System.out.println( y + " is the maximum number.");
	      else
	         return z;//System.out.println( z + " is the maximum number.");
	}
	

	public static void main(String[] args) 
	{ 
		One numset= new One(11,12,13);
				//m.out.println("HEllo");
		// TODO Auto-generated method stub

	}

}
