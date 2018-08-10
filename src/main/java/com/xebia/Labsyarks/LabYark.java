package com.xebia.Labsyarks;

public class LabYark extends Observer{
private String name;
private int age;
private String sex;
private int dayage;
private DayAgeSubject dayAgeSubject;
private  int days=0;
private  int woolyeildtime;
private  int lastshaven=0;
public int getWoolyeildtime() {
	return woolyeildtime;
}

public void setWoolyeildtime(int day) {
	 int yield=(this.getAge()*100);
			this.woolyeildtime=(int) (8+(yield+day)*0.01);
}

public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
}
public int getDayage() {
	return dayage;
}
public void setDayage(int dayage) {
	this.dayage = dayage;
}

public DayAgeSubject getDayAgeSubject() {
	return dayAgeSubject;
}
public void setDayAgeSubject(DayAgeSubject dayAgeSubject) {
	this.dayAgeSubject = dayAgeSubject;
}
public LabYark(String name, String age, String sex) {
	super();
	this.name = name;
	
	this.age = Integer.parseInt(age) ;
	this.sex = sex;
	this.dayAgeSubject=DayAgeSubject.getInstance();
	this.dayAgeSubject.attach(this);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public boolean checkAlive() {
	if(age<10)
	return true;
	else
	return false;
}

@Override
public void update(int days)
{this.setDays(days);
System.out.println("the day :" + this.getDays());
CalculateProduct calculateProduct=new CalculateProduct();
int d=0;
while(d<=days)
{
calculateProduct.calculateMilk(this, d);
calculateProduct.calculateYark(this, d);

d++;
}

	}

public int getLastshaven() {
	return lastshaven;
}

public void setLastshaven(int lastshaven) {
	this.lastshaven = lastshaven;
}


}
