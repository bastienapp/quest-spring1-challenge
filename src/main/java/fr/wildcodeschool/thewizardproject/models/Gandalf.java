package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gandalf implements WizardInterface {

	@Autowired
	private Outfit outfit;
	
	public Gandalf(Outfit outfit) {
		this.outfit = outfit;
	}
	
	@Override
	public String giveAdvice() {
		return "Fly you fools";
	}

	@Override
	public String changeDress() {
		return outfit.putOn("grey dress");
	}

}
