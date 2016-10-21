package fcu.iecs.oop.tiida;

public class NissanTiida{

	public int count=1;
	
	public  void tiida () 
		{
		int i=0,j=0;
	
		
		for(i=0;i< count ;i++)
		{
			
			System.out.println("\n");
			
			for(j=0;j< count ;j++)
			{
				  System.out.printf("*");
				
			}
			
			
		}System.out.println("\n");
		  count++;
	}

}