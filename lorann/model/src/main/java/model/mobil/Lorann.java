package model.mobil;

import java.io.IOException;

import controller.Movement;
import model.Permeability;
import model.Sprite;

public class Lorann  {
	
	public static Movement movement = new Movement();
	
	

	private static final Sprite spriteback = new Sprite('H', "lorann_b.png");

	/** The Constant spriteTurnLeft. */
	private static final Sprite spriteTurnLeft = new Sprite('H', "loran_l.png");

	/** The Constant spriteTurnRight. */
	private static final Sprite spriteTurnRight = new Sprite('H', "Mloran_r.png");

	/** The Constant spriteExplode. */
	private static final Sprite spriteup = new Sprite('H', "lorann_u.png");



	private Sprite sprite;

	/**
	 * Instantiates a new my vehicle.
	 *
	 * @param road
	 *            the road
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	
	

	public Lorann() throws IOException {
		// TODO Auto-generated constructor stub
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteup.loadImage();
		spriteback.loadImage();
		movement = new Movement();
	}
	
	


	public final void moveLeft() {
		this.setSprite(spriteTurnLeft);
	}

	

	public final void moveRight() {
		     
		this.setSprite(spriteTurnRight);
	}

	

	protected final void moveBack() {
	
		this.setSprite(spriteback);
	}

	
	public final void moveUp() {
		
		this.setSprite(spriteup);
	}

	
	
	
	private void setSprite(Sprite sprite) {
		// TODO Auto-generated method stub
		this.sprite = sprite;
	}

}