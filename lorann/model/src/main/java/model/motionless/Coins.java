package model.motionless;

import model.Permeability;
import model.Sprite;

public class Coins extends MotionLessElement {
	private static final Sprite SPRITE = new Sprite('C', "Coins.jpg");

	/**
	     * Instantiates a new ditchLeft.
	     */
	    Coins() {
	        super(SPRITE, Permeability.BLOCKING);
	    }
}
