package model.motionless;

import model.Permeability;
import model.Sprite;

public class Energy extends MotionLessElement{
	private static final Sprite SPRITE = new Sprite('E', "Energy.jpg");

	Energy() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
