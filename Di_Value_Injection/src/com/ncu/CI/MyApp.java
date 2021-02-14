package com.ncu.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
//ICoach coach=(ICoach)context.getBean("myTCoach");
	ICoach coach1=(ICoach)context.getBean("myBCoach");
	ICoach coach2=(ICoach)context.getBean("myBCoach");
	//System.out.println(coach1.getDailyWorkout());
	//System.out.println(coach1.getDailyFortune());
	System.out.println(coach1);
	System.out.println(coach2);
	//System.out.println(coach1.getDailyFortune());
	//System.out.println(coach1.toString());
	((ClassPathXmlApplicationContext)context).close();
	}

}
