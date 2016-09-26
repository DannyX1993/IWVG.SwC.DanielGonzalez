package es.upm.miw.danielgonzalez;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.danielgonzalez.Point;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
    }
    
    @Test
    public void testPuntoXY() {
    	pt = new Point(2);
    	assertEquals(2, pt.getX());
    	assertEquals(2, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }
    
    @Test
    public void testSetX() {
    	pt.setX(3);
    	assertEquals(3, pt.getX());
    }
    
    @Test
    public void testSetY() {
    	 pt.setY(4);
    	 assertEquals(4, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]", pt.toString());
    }

}
