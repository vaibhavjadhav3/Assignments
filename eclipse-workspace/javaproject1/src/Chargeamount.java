

public class Chargeamount 
{
	static double payback;
	int charges;
	
	static  double Chargeamount(int charges)
	
	{
	
		if(charges<=500)
	      
		{payback=0.25*charges;
		//return charges;
		}
		if(charges>=500&&charges<=1500)
		{ payback=0.25*500+0.5*(charges-500);
		//return charges;
		}
		if(charges>=1500&&charges<=2500)
		{payback=0.25*500+0.5*(1000)+0.75*(charges-1500);
		//return charges;
		}
		
		if(charges>=2500)
		{payback=0.25*500+0.5*(1000)+0.75*(charges-1500)+1.0*(charges-2500)
		;
		//return charges;
		}
		
		//return payback/100;
	      
	   
	    return payback/100;
	}
	    


	public static void main(String[] args) 
	
		{
		Chargeamount case1=new Chargeamount();
		System.out.println(Chargeamount(2000));
		System.out.println(Chargeamount(2600));
		
		}
	

	
	
	
}