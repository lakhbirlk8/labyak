package com.xebia.Labsyarks.restcontrollers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.Labsyarks.CalculateProduct;
import com.xebia.Labsyarks.DayAgeSubject;
import com.xebia.Labsyarks.LabYark;
import com.xebia.Labsyarks.LabyarkMain;

@RestController
public class LabsyarksRestController {
	 @RequestMapping("/getherds")
	    public List<LabYark> getHerd() {
	        return LabyarkMain.getHeard();
	    }
	 @RequestMapping("/getdetails")
	    public Map<String,String> getdetails(@RequestParam(value="days")String days) {
		  DayAgeSubject dayAgesubject = DayAgeSubject.getInstance();
	        
	        
		  List<LabYark>  heard=LabyarkMain.getHeard();
		  int day=Integer.parseInt(days);
	        dayAgesubject.setDays(day);
	       Map<String,String> details=new HashMap<String,String>();
	       String milk=""+CalculateProduct.totalmilk;
	       String wool=""+CalculateProduct.totalwool;
	       details.put("Total milk:",milk);
	       details.put("Total wool:",wool);
	       return details;
	    }

}
