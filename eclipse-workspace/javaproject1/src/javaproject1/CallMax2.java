package javaproject1;

public class CallMax2 
{
	  private  1int x,y,z;
	  static int max;
	  CallMax2(int x,int y,int z)
	  {
	    this.x=x;
	    this.y=y;
	    this.z=z;
	  }
	  static int CallMax2(int x,int y,int z)
	  {
	    if(x>y&&x>z)
	    {
	    	 max=x;
		     return max;
		    
	    	
	    }
	    else if(y>x&&y>z)
	    {
	      max=y;
	      return max;
	    }
	    else
	    {
	      max=z;
	      return max;
	    }
	  }
	    public static void main(String[] args) 
	    {
	       /*Scanner s=new Scanner(System.in);
	       int a=s.nextInt();
	       int b=s.nextInt();
	       int c=s.nextInt();
	      Max m=new Max(a,b,c);
	      int r=Max.calMax(m.x,m.y,m.z);
	      System.out.println(r);*/
	    	CallMax2 numset =new CallMax2(3,2,1);
	    	
	    	System.out.println(max);
	    }
}