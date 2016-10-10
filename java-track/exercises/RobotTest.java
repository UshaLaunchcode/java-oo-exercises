import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void testConvertOrientation() {
		Robot a = new Robot("Rob", 0, 0, 0,90);
		assertTrue("Problem setting orientation constructor", a.getOrientation() == 90);
		assertTrue("Problem rotating 90 degrees", a.convertOrientation() == "east");
		
		
		
	}

}
