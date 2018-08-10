package com.xebia.Labsyarks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LabyarkMain {
	static List<LabYark> heard=new ArrayList<LabYark>();
	
	
	public static List<LabYark> getHeard() {
		// heard.add(new LabYark("betty-1",4,"f"));
		// heard.add(new LabYark("betty-2",3,"f"));
		// heard.add(new LabYark("betty-3",6,"f"));
		// heard.add(new LabYark("betty-4",11,"f"));
		// heard.add(new LabYark("betty-5",9,"f"));
		 
		return XMLParser.getHerd();
		 
		 
	 }
	public static void main(String[] args) {
        double milk=0;
        double yark=0;
        int days=5;
        LabYark ly;
        DayAgeSubject dayAgesubject = DayAgeSubject.getInstance();
        //dayAgesubject.setDays(25);
        
        heard=getHeard();
        dayAgesubject.setDays(25);
    
		
 
		System.out.println("the total milk " +CalculateProduct.totalmilk);
		System.out.println("the total yark " +CalculateProduct.totalwool);
		
	}
	private static void updateheardList(LabYark ly) {
	
		heard.remove(ly);
	}

}
