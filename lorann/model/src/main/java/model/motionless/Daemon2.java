package model.motionless;

import model.Permeability;
import model.Sprite;

public class Daemon2 extends MotionLessElement {
	private static final Sprite SPRITE = new Sprite('2', "Daemon2.jpg");

	Daemon2() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
