package view;

import javax.swing.JOptionPane;

import showboard.BoardFrame;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {
	private BoardFrame frame;

	/** 
	 * Instantiates a new view facade.
	 */
	public ViewFacade() {
		setFrame(new BoardFrame("Lorann"));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see view.IView#displayMessage(java.lang.String)
	 */

	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public BoardFrame getFrame() {
		return frame;
	}

	public void setFrame(BoardFrame frame) {
		this.frame = frame;
	}

	
}
