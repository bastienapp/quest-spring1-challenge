package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Outfit {
	
	private String outfit;

	public String putOn(String outfit) {
		this.outfit = outfit;
		return String.format("Put on %s", outfit);
	}
}
