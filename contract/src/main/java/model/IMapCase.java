package model;



/**
 * 
 * @author Ahmed
 */
public interface IMapCase {
	/**
	 * get nb cels height
	 */
	public int getNbCellulsHeight();
	/**
	 * get nb cels width
	 */
	public int getNbCellulsWidth();
	/**
	 * get the width
	 */
	public int getWidth();
	/**
	 * get the height
	 */
	public int getHeight();
	/**
	 * get rider 1
	 */
	public IRider getRider1();
	/**
	 * Get the rider 2
	 */
	public IRider getRider2();
	
	public ITimer getTimer();
	
	
	public void saveData();
	
	

}
