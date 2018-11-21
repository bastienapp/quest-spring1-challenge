package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

public class Dumbledore implements WizardInterface {

	@Override
	public void giveAdvice() {
		System.out.println("Happiness can be found, even in the darkest of times, if one only remembers to turn on the light.");
	}

	@Override
	public void changeDress() {
		// TODO Auto-generated method stub
		
	}

}
