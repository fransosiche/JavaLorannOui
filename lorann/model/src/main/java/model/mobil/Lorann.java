package model.mobil;

import java.io.IOException;

import model.Permeability;
import model.Sprite;

public class Lorann extends mobil{
	
	private static final Sprite sprite          = new Sprite('H', "MyVehicle.png");

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteTurnLeft  = new Sprite('H', "MyVehicleLeft.png");

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteTurnRight = new Sprite('H', "MyVehicleRight.png");

    /** The Constant spriteExplode. */
    private static final Sprite spriteExplode   = new Sprite('H', "MyVehicleExplode.png");

    /**
     * Instantiates a new my vehicle.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param road
     *            the road
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public Lorann(final int x, final int y, final IRoad road) throws IOException {
        super(x, y, sprite, road, Permeability.BLOCKING);
        spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
        spriteExplode.loadImage();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
     */
 
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteTurnLeft);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
     */
 
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteTurnRight);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
     */
  
    protected final void die() {
        super.die();
        this.setSprite(spriteExplode);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
     */
   
    public final void doNothing() {
        super.doNothing();
        this.setSprite(sprite);
    }

}
