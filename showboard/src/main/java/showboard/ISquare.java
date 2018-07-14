package showboard;

import java.awt.Image;

/**
 * A class can implement the ISquare interface when it wants to be show on a IBoard.
 * @author Ahmed
 * @version 1.1
 * @see Image
 */
public interface ISquare {

    /**
     * Gets the image.
     *
     * @return the image
     */
    Image getImage();
}
