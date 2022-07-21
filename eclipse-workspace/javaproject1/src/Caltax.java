
package javaproject1;

public class Caltax 
{
	static int rate;
	
	static double Caltax(int gp)
	
	{
		if(gp<=240)
		{rate=0;}
		if(gp>=240&&gp<=480)
		{rate=15;}
		if(gp>=480)
		{rate=28;}
		
		double taxowed=gp*rate*1/100;
		return taxowed;
		
		
	}


	public static void main(String[] args) 
	
	{
		Caltax case1=new Caltax();
		
		System.out.println(Caltax(2000));
		
		
		
		
		
	
	
	
	}

	
	
	
}
