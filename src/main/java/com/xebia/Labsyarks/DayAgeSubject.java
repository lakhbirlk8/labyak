package com.xebia.Labsyarks;

import java.util.ArrayList;
import java.util.List;

public class DayAgeSubject extends Subject {
 private int days;
private static DayAgeSubject dayAgeSubject=null;
public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
	this.updateObservers(this.days);
}

private DayAgeSubject()
{
}

public static DayAgeSubject getInstance()
{if(dayAgeSubject!=null)
{return dayAgeSubject;}
else
{
	dayAgeSubject =new DayAgeSubject();
	return dayAgeSubject;
	}
}
	


public static List<Observer> getObservers() {
	return observers;
}

public static void setObservers(List<Observer> observers) {
	DayAgeSubject.observers = observers;
}
public static List<Observer> observers=new ArrayList<Observer>();
@Override
public void detech(Observer observer) {
	observers.remove(observer);
}
@Override
public void attach(Observer observer) {
	observers.add(observer);
}
@Override
public void  updateObservers(int days)
{for(Observer observer :observers)
	{observer.update(days);}
}




}
