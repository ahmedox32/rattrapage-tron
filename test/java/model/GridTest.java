package model;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;

import org.junit.Test;

public class GridTest {

	private Grid grid;
	
	@Before
	public void setUp() throws Exception {
		this.grid = new Grid();
		
	}
	
	
	
	@Test
	public void testcheckCilision() {
		// au debue elle doit il y as pas de colision
		Boolean expected = false;
		assertEquals(expected,grid.checkColision((Rider) grid.getRider1()));
		// apres 100 etapes il y a forcement colision vue qu'il est hors de l'ecran
		expected = true;
		for (int i=0;i<100;i++) {grid.getRider1().move();}
		assertEquals(expected,grid.checkColision((Rider) grid.getRider1()));
		
		
		
		
		
	} 
	
	
		
	

}
