package rs.ac.bg.fon.ai.MavenBiblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KnjigaTest {
	
	Knjiga k;

	@BeforeEach
	void setUp() throws Exception {
		k = new Knjiga();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetNaslov() {
		k = new Knjiga();
		k.setNaslov("Naslov1");
		
		assertEquals("Naslov1", k.getNaslov());
	}


}
