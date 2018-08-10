package com.xebia.Labsyarks;

public class CalculateProduct {
	public static int totalmilk=0;
	public static int totalwool=0;
	 static double calculateMilk(LabYark labyark,int day)
	 {if(labyark.getSex().equals("f"))
	 	{  double milk=0;
      int d=labyark.getAge()*100+day;
      
    	  if(d/100>=10)
    	  	{return milk;}
    	  else
    		  totalmilk+=50-d*0.03;
    	   System.out.println("the totalmilk " + totalmilk);
		 return milk;
	 	}
	 return 0.0;
	 }
	 static double calculateYark(LabYark labyark,int days)
	 { double yark=0;
	
    if(days==0&&(labyark.getAge()>1)&&(labyark.getAge()+days/100)<10)
    {
    	totalwool++;
    	labyark.setWoolyeildtime(days);
    	labyark.setLastshaven(days);
    }
    else
    {
    if(days==(labyark.getLastshaven()+labyark.getWoolyeildtime()+labyark.getAge()*100))
    	
    	{	totalwool++;
    	labyark.setLastshaven(labyark.getLastshaven()+labyark.getWoolyeildtime());
    	labyark.setWoolyeildtime(days);
    	}
    }
   System.out.println("the totalwool " + totalwool);
     return totalwool;
	 }
}
