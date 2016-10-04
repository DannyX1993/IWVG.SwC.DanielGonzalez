package es.upm.miw.danielgonzalez;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {
	Fraction f;
	
	@Test
	public void testFractionIntInt() {
		f = new Fraction(2, 3);
		assertEquals(2, f.getNumerator());
		assertEquals(3, f.getDenominator());
	}

	@Test
	public void testFraction() {
		f = new Fraction();
		assertEquals(1, f.getNumerator());
		assertEquals(1, f.getDenominator());
	}

	@Test
	public void testGetNumerator() {
		f = new Fraction(2, 3);
		assertEquals(2, f.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		f = new Fraction(2, 3);
		assertEquals(3, f.getDenominator());
	}

	@Test
	public void testDecimal() {
		f = new Fraction(1, 4);
		assertEquals(0.25, f.decimal(), 10e-2);
		
		f = new Fraction(2, 0);
		assertTrue(Double.isInfinite(f.decimal()));
	}
	
	@Test
	public void testIsPropia() {
		f = new Fraction(1, 4);
		assertTrue(f.isPropia());
		
		f = new Fraction(4, 3);
		assertFalse(f.isPropia());
	}
	
	@Test
	public void testIsImpropia() {
		f = new Fraction(1, 4);
		assertFalse(f.isImpropia());
		
		f = new Fraction(4, 3);
		assertTrue(f.isImpropia());
	}
	
	@Test
	public void testIsEquivalente() {
		f = new Fraction(1, 4);
		assertTrue(f.isEquivalente(new Fraction(4, 16)));
		assertFalse(f.isEquivalente(new Fraction(2, 5)));
		assertFalse(f.isEquivalente(new Fraction(2, 0)));
	}
	
	@Test
	public void testIsMayor() {
		f = new Fraction(1, 4);
		Fraction f2 = new Fraction(2, 4);
		assertFalse(f.isMayor(f2));
		
		f2 = new Fraction(2, 0);
		assertFalse(f.isMayor(f2));
		
		f2 = new Fraction(1, 5);
		assertTrue(f.isMayor(f2));
	}
	
	@Test
	public void testIsMenor() {
		f = new Fraction(1, 4);
		Fraction f2 = new Fraction(2, 4);
		assertTrue(f.isMenor(f2));
		
		f2 = new Fraction(2, 0);
		assertTrue(f.isMenor(f2));
		
		f2 = new Fraction(1, 5);
		assertFalse(f.isMenor(f2));
	}
	
	@Test
	public void testMult() {
		f = new Fraction(2, 3);
		Fraction f2 = new Fraction(3,4);
		Fraction result = f.mult(f2);
		assertEquals(6, result.getNumerator());
		assertEquals(12, result.getDenominator());
	}

}
