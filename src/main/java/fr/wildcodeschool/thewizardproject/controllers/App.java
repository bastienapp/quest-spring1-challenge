package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {
	
	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		
		// change with dumbledore or gandalf here
		WizardInterface wizard = context.getBean("dumbledore", WizardInterface.class);
		context.close();
		
		System.out.println("");
		System.out.println("***********");
		System.out.println(wizard.giveAdvice());
		System.out.println("***********");
		System.out.println(wizard.changeDress());
		System.out.println("***********");
	}
}
