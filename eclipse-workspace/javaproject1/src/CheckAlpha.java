package javaproject1;
public class CheckAlpha 


{
	private char alph;
	
	public char getalph()
	{return alph;}
	public void setalph(char alph)
	{this.alph=alph;}
	
	public static boolean CheckAlpha(char alph)
	{
		if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
		{return true;}//System.out.println(true);}
		else {return false;}//System.out.println(false);}
  }

	
	
	

	 public static void main(String[] args) 
	{
		CheckAlpha case1 = new CheckAlpha();
		char egg='c';
    CheckAlpha(egg);
    System.out.println("Heyyy,its working");
     //case1.setalph('c');
		
		
		
		
	}
		// TODO Auto-generated method stub
}


