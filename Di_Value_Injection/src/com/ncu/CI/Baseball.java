package com.ncu.CI;


public class Baseball implements ICoach{
private IFortune ifortune;
private String name ;
private int age;
public Baseball() {
	System.out.println("default constructor");
}
public Baseball(String name,int age,IFortune ifortune) {
	this.name=name;
	this.age=age;
	this.ifortune=ifortune;
}

	
//	public Baseball() {
//		this.ifortune = ifortune;
//    }

	@Override
public String toString() {
	return "Baseball [ifortune=" + ifortune + ", name=" + name + ", age=" + age + "]";
}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 30 hrs daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}


	public IFortune getIfortune() {
		return ifortune;
	}


	public void setIfortune(IFortune ifortune) {
		this.ifortune = ifortune;
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
	public void Setup() {
		System.out.println("init method call");
	}
	public void Cleanup() {
		System.out.println("destroy method call");
	}

}