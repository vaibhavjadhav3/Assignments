package javaproject1;

public class Isprime
	{
	
	  public static boolean Isprime ( int num )
	  {
	    boolean prime = true;
	    int limit = (int) Math.sqrt ( num );  

	    for ( int i = 2; i <= limit; i++ )
	    {
	      if ( num % i == 0 )
	      { prime = false;break;}
	    }

	    return prime;
	  }

	  public static void main( String[] args )
	  {
		Isprime case1=new Isprime();
	    System.out.println (Isprime(60));
	    }
	  }

	

