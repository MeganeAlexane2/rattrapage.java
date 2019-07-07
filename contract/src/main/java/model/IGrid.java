package model;



/**
 * <h1>The Grid Interface</h1>
 * 
 * 
 * @version 1.0
 */
public interface IGrid {
	/**
	 * get nb cels height
	 */
	public int getNbCelsHeight();
	/**
	 * get nb cels width
	 */
	public int getNbCelsWidth();
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
	public IRiders getRider1();
	/**
	 * Get the rider 2
	 */
	public IRiders getRider2();
	
	public Itime getTimer();
	
	
	public void save();
	
	

}
