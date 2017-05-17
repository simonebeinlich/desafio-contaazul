package Test;
import java.util.Arrays;

import junit.framework.TestCase;
import model.Robot;

public class RobotTest extends TestCase {

	public void testMover() {
		
		char comando = 'M';
		String[] retornoEsperado = {"0","1","N"};
		
		String[] retornoFeito = Robot.drive(comando);
		
		assertEquals(Arrays.toString(retornoEsperado), Arrays.toString(retornoFeito));
		
	}

}
