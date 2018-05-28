package model.motionless;

import model.Permeability;
import model.Sprite;

public class Daemon3 extends MotionLessElement{
	private static final Sprite SPRITE = new Sprite('3', "Daemon3.jpg");

	Daemon3() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
