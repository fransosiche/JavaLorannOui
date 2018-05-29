package model.mobil;

import java.awt.Point;

import model.IElement;
import showboard.IPawn;

public interface IMobil extends IPawn, IElement {

	/**
	 * Move up.
	 */
	void moveUp();

	/**
	 * Move left.
	 */
	void moveLeft();

	/**
	 * Move down.
	 */
	void moveDown();

	/**
	 * Move right.
	 */
	void moveRight();

	/**
	 * Do nothing.
	 */
	void doNothing();

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */

	int getX();

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */

	int getY();

	/**
	 * Checks if is alive.
	 *
	 * @return the alive
	 */
	Boolean isAlive();

	/**
	 * Checks if the car crashed.
	 *
	 * @return the boolean
	 */
	Boolean isCrashed();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.showboard.IPawn#getPosition()
	 */

	Point getPosition();

}
