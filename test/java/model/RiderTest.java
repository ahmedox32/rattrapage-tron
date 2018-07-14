package model;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class RiderTest {

	private Rider riderman;
	private Grid grid1;
	
	@Before
	public void setUp() throws Exception {
		grid1 = new Grid();
		riderman = new Rider(10, 12, Color.red,Direction.EST,grid1);
		
	}
	
	
	@Test
	public void testturnRight() {
		Direction expected = Direction.SUD;
		riderman.turnRight();
		assertEquals(expected,riderman.getDirection());
		
	} 
	
	
	@Test
	public void testturnLeft() {
		riderman.setDirection(Direction.EST);
		Direction expected = Direction.NORD;
		riderman.turnLeft();
		assertEquals(expected,riderman.getDirection());
		
	} 
	
	
	@Test
	public void testsetColor() {
		// On verifie que le x a été bien incrémenté
		int expected = 11;
		riderman.setDirection(Direction.EST);
		riderman.move();
		assertEquals(expected,riderman.getX());
		
		// on verifie que le nombres de particule as bien augmenté de un aussi
		expected = 1;
		assertEquals(expected,riderman.getParticles().size());
		
	} 
	
	
	

}
