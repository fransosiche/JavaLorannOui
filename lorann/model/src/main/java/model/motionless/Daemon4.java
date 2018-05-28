package model.motionless;

import model.Permeability;
import model.Sprite;

public class Daemon4 extends MotionLessElement{
	private static final Sprite SPRITE = new Sprite('1', "Daemon1.jpg");

	Daemon4() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
