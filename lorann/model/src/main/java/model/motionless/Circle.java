package model.motionless;

import model.Permeability;
import model.Sprite;

public class Circle extends MotionLessElement {
	private static final Sprite SPRITE = new Sprite('!', "Circle.jpg");

	Circle() {
		super(SPRITE, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
	}

}
