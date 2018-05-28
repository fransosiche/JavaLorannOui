package model.motionless;

import model.Permeability;
import model.Sprite;

public class HorizontalWall extends MotionLessElement{
	
	private static final Sprite SPRITE = new Sprite('/', ".jpg");

	HorizontalWall() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
