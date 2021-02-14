package com.ncu.TE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
	TextEditor te=(TextEditor)ac.getBean("texteditor");
	te.SpellChecker();

}
}

