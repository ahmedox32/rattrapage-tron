package model;
/**
 * 
 * @author Ahmed
 */
import java.util.ArrayList;

public interface IRider extends IElements{
	/**
	 * Move the rider
	 */
	public void move();
	/**
	 * Get rider's particles
	 */
	public ArrayList<IElements> getParticles();
	/**
	 * turn rider left
	 */
	public void turnLeft();
	/**
	 * Turn rider Right
	 */
	public void turnRight();
	/**
	 * Check if rider isAlive
	 */
	public boolean isAlive();

	
	
}
