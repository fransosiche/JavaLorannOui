package model.motionless;

import model.Permeability;
import model.Sprite;

public class Spell extends MotionLessElement {

	private static final Sprite SPRITE = new Sprite('S', "Spell.jpg");

	Spell() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
