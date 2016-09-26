package es.upm.miw.danielgonzalez;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.danielgonzalez.DecimalCollection;

public class DecimalCollectionTest {
    private DecimalCollection dc;

    @Before
    public void before() {
        this.dc = new DecimalCollection();
        this.dc.add(2.0);
        this.dc.add(-1.0);
        this.dc.add(3.0);
        this.dc.add(2.0);
    }

    @Test
    public void testDecimalCollection() {
        this.dc = new DecimalCollection();
        assertEquals(0, this.dc.size());
    }

    @Test
    public void testAdd() {
        assertEquals(4, this.dc.size());
    }

    @Test
    public void testSum() {
        assertEquals(6, this.dc.sum(), 10e-5);
    }

    @Test
    public void testHigher() {
        assertEquals(3, this.dc.higher(), 10e-5);
    }
    
    @Test
    public void testAverage() {
    	assertEquals(1.25, this.dc.average(), 10e-2);
    	
    	this.dc = new DecimalCollection();
        this.dc.add(0);
        this.dc.add(0);
        this.dc.add(0);
        this.dc.add(0);
        assertEquals(0.00, this.dc.average(), 10e-2);
    }

}
