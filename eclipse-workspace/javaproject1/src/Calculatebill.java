

public class Calculatebill 
{
	static double charges;
	int consumedunits;
	
	static  double Calculatebill(String connectiontype,int consumedunits)
	
	{
	
	    if(connectiontype=="domestic")
	      { 
		if(consumedunits<=100)
	      
		{charges=4*consumedunits;
		//return charges;
		}
		if(consumedunits>=100&&consumedunits<=300)
		{ charges=4*100+4.5*(consumedunits-100);
		//return charges;
		}
		if(consumedunits>=300&&consumedunits<=500)
		{charges=4*100+4.5*(200)+4.47*(consumedunits-300);
		//return charges;
		}
		
		if(consumedunits>=500)
		{charges=4*100+4.5*(200)+4.75*(200)+5*(consumedunits-500);
		//return charges;
		}
		
		//return charges;
	      }
	    else
	    {
		if(consumedunits<=100)
		{
		   
		charges=4.25*consumedunits;
		{
		if(charges<=350)
		{
		 charges=350 ;
		
		}
		else 
		{charges=4.25*consumedunits;}
		}
		
		}
		
		if(consumedunits>=100&&consumedunits<=300)
		{charges=4*100+4.75*(consumedunits-100);
		//return charges;
		}
		
		
		if(consumedunits>=300&&consumedunits<=500)
		{charges=4*100+4.75*(200)+5*(consumedunits-300);
		//return charges;
		}
		
		if(consumedunits>=500)
		{
		    charges=4*100+4.75*(200)+5*(200)+5.25*(consumedunits-500);
		//return charges;
		}
	    
	    }
	    return charges;
	}
	    


	public static void main(String[] args) 
	
		{
		Calculatebill case1=new Calculatebill();
		System.out.println(Calculatebill("domestic",99));
		}
	

	
	
	
}