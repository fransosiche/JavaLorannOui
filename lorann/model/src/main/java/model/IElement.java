package model;

import java.awt.Image;

import showboard.ISquare;

public interface IElement extends ISquare{
	
	 Sprite getSprite();

	    /**
	     * Gets the permeability.
	     *
	     * @return the permeability
	     */
	    Permeability getPermeability();

	    /*
	     * (non-Javadoc)
	     * @see fr.exia.showboard.ISquare#getImage()
	     */
	    
	    Image getImage();

}
