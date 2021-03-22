package rs.ac.bg.fon.ai.MavenBiblioteka;
import rs.ac.bg.fon.ai.MavenBiblioteka.Knjiga;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KnjigaTest {

	@Before
	public void setUp() throws Exception {
		Knjiga k = new Knjiga();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetNaslov() {
		Knjiga k = new Knjiga();
		k.setNaslov("Naslov1");
		
		assertEquals("Naslov1", k.getNaslov());
	}

}
