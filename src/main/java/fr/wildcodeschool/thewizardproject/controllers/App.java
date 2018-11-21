package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.Dumbledore;

public class App {
	
	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		
		Dumbledore dumbledore = new Dumbledore();
		dumbledore.giveAdvice();
	}
}
