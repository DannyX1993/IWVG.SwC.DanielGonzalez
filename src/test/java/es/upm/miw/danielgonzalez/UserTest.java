package es.upm.miw.danielgonzalez;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {
	
	User u;

	@Test
	public void testUser() {
		u = new User(10, "Daniel", "Antona");
		assertEquals(10, u.getNumber());
		assertEquals("Daniel", u.getName());
		assertEquals("Antona", u.getFamilyName());
		
		u = new User(-1, "$A%_@G", "A:@D_-");
		assertEquals(-1, u.getNumber());
		assertEquals("$a%_@g", u.getName());
		assertEquals("A:@d_-", u.getFamilyName());
	}

	@Test
	public void testGetNumber() {
		u = new User(10, "Daniel", "González");
		assertEquals(10, u.getNumber());
	}

	@Test
	public void testGetName() {
		u = new User(10, "Daniel", "González");
		assertEquals("Daniel", u.getName());
		
		u = new User(-1, "$A%_@G", "A:@D_-");
		assertEquals("$a%_@g", u.getName());
	}

	@Test
	public void testGetFamilyName() {
		u = new User(10, "Daniel", "González");
		assertEquals("González", u.getFamilyName());
		
		u = new User(-1, "$A%_@G", "A:@D_-");
		assertEquals("A:@d_-", u.getFamilyName());
	}

	@Test
	public void testFullName() {
		u = new User(10, "Daniel", "González");
		assertEquals("Daniel González", u.fullName());
		
		u = new User(-1, "$A%_@G", "A:@D_-");
		assertEquals("$a%_@g A:@d_-", u.fullName());
	}

	@Test
	public void testInitials() {
		u = new User(10, "Daniel", "González");
		assertEquals("D.", u.initials());
		
		u = new User(-1, "$A%_@G", "A:@D_-");
		assertEquals("$.", u.initials());
	}
	
	@Test
	public void testGetUpperCaseName() {
		u = new User(10, "Daniel", "González");
		assertEquals("DANIEL", u.getUpperCaseName());
	}

}
