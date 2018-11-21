package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

public class Gandalf implements WizardInterface {

	@Override
	public void giveAdvice() {
		System.out.println("Fly you fools");
	}

	@Override
	public void changeDress() {
		// TODO Auto-generated method stub

	}

}
