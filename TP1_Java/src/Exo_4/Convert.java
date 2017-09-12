package Exo_4;

import java.lang.Integer;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] names = {"12","15"};
		int tabentier [] = GetTab(names);
		
		for(int i = 0; i<tabentier.length; i++)
		{
			System.out.println(tabentier[i]) ;
		}		
		
		System.out.println(SumTab(tabentier));
		
	}
	
	
	public static int[] GetTab(String[] arg){
		int tabEnt[] = new int[arg.length];
		for(int i = 0; i<arg.length; i++)
		{
			tabEnt[i] = Integer.parseInt(arg[i]);
		}
		return tabEnt;
	}
	
	public static int SumTab(int[] arg){
		int sum = 0;
		for(int i = 0; i<arg.length; i++)
		{
			sum += arg[i];
		}
		return sum;
	}


}



