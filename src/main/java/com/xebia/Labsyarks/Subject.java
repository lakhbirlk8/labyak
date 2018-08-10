package com.xebia.Labsyarks;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private int state;
	private int dayage;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public static List<Observer> getObservers() {
		return observers;
	}
	public static void setObservers(List<Observer> observers) {
		Subject.observers = observers;
	}
	private static List<Observer> observers=new ArrayList<Observer>();
    public void detech(Observer observer) {
    	observers.remove(observer);
    }
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void  updateObservers(int days)
	{for(Observer observer :observers)
		{observer.update(days);}
	}
	
	
	
}
