package main;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {

		ControllerFacade controller = new ControllerFacade(null, null);
		ViewFacade view = new ViewFacade();
		ModelFacade model = new ModelFacade();
		controller.addObserver(view.getFrame().getObserver());

	}
}
