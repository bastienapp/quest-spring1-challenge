package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dumbledore implements WizardInterface {
	
	@Autowired
	private Outfit outfit;
	
	public Dumbledore(Outfit outfit) {
		this.outfit = outfit;
	}
	
	@Override
	public String giveAdvice() {
		return "Happiness can be found, even in the darkest of times, if one only remembers to turn on the light.";
	}

	@Override
	public String changeDress() {
		return outfit.putOn("magic dress");
	}
}
