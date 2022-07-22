
public class Calculateprofit 
{
	static float profit;
	
	static  float Calculateprofit(int numattendees)
	
	{
		
	    /*if(amt<=1000)
		{rate=4;}
		if(amt>=1000&&amt<=5000)
		{rate=(int) 4.5;}
		if(amt>=5000)
		{rate=5;}*/
		
		float profit=(float) (numattendees*(5-0.5)-20);
		return profit;
		
		
	}


	public static void main(String[] args) 
	
	{
		Calculateprofit case1=new Calculateprofit();
		
		System.out.println(Calculateprofit(250));
		
		
		
		
		
	
	
	
	}

	
	
	
}