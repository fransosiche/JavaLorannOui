package model.motionless;

import model.Permeability;
import model.Sprite;

public class Doors extends MotionLessElement {

	private static final Sprite SPRITE = new Sprite('O', "Door.jpg");

	/**
	     * Instantiates a new ditchLeft.
	     */
	    Doors() {
	        super(SPRITE, Permeability.BLOCKING);
	    }
}
