package graph;

import java.awt.Color;

/**
 * A colourable object is an object that has a colour field.
 * Getting the colour should be open, but setting it is protected such that
 * setting the colour of the object can be done only by the game files.
 * <p>
 * Colour may or may not have a significance (if not, is just for show).
 * As such, significant colour should not be changed while a run is proceeding.
 *
 * @author MPatashnik
 */
public interface Colourable {

    /**
     * Return the color of this object.
     */
    Color getColour();

    /**
     * Return true iff the color of this object has significance
     */
    boolean isColourSignificant();
}
