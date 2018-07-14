package showboard;

import java.awt.Point;

/**
 * A class can implement the IPawn interface when it wants to move on a IBoard.
 * @author Ahmed
 * @see IBoard
 * @see ISquare
 * @see Point
 */
public interface IPawn extends ISquare {

    /**
     * Gets the x position.
     *
     * @return the x
     */
    int getX();

    /**
     * Gets the y position.
     *
     * @return the y
     */
    int getY();

    /**
     * Gets the position Point(int x, int y).
     *
     * @return the position
     * @see Point
     */
    Point getPosition();
}
