package javaproject1;

public class Callinterest 
{
	static int rate;
	
	static double Callinterest(int amt)
	
	{
		if(amt<=1000)
		{rate=4;}
		if(amt>=1000&&amt<=5000)
		{rate=(int) 4.5;}
		if(amt>=5000)
		{rate=5;}
		
		double money=amt*rate*1/100;
		return money;
		
		
	}


	public static void main(String[] args) 
	
	{
		Callinterest case1=new Callinterest();
		
		System.out.println(Callinterest(2000));
		
		
		
		
		
	
	
	
	}

	
	
	
}
