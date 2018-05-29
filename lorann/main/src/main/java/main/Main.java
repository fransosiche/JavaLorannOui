package main;

import java.sql.SQLException;

import controller.LorannController;
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
	 * @throws SQLException 
	 */
	public static void main(final String[] args)  {

		LorannController controller = new LorannController(null, null);
		ViewFacade view = new ViewFacade();
		ModelFacade model = new ModelFacade();
		controller.addObserver(view.getFrame().getObserver());
		try {
			controller.start();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
