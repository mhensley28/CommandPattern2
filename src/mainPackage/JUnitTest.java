package mainPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTest {

	@Test
	public void GreenPepperVeggieTest() {
		GreenPepperVeggie junit = new GreenPepperVeggie();
		String result = junit.toSTring();
		Assertions.assertEquals("Green Peppers", result);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void OnionVeggieTest() {
		OnionVeggie junit = new OnionVeggie();
		String result2 = junit.toString();
		Assertions.assertEquals("Onion", result2);
	}

}
