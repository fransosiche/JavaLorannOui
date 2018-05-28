package model.motionless;

import model.Permeability;
import model.Sprite;

public class VerticalWall extends MotionLessElement {
	
	private static final Sprite SPRITE = new Sprite(':', "VerticalWall.jpg");

	VerticalWall() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
