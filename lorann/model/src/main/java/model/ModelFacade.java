package model;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import model.dao.BDD;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade extends Observable implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public InputStream getExampleById(final int id) throws SQLException {
        return BDD.getExampleById(id).getBinaryStream();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return BDD.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
    */ 
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return BDD.getAllExamples();
    } 

} 
