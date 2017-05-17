package Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import controller.RobotController;

public class RobotControllerTeste {

	@Test
	public void testGetComando() {
		
		String comando = "MML";
		String[] retornoEsperado = {"0","2","W"};
		
		String[] retornoFeito = RobotController.getComando(comando);
		
		assertEquals(Arrays.toString(retornoEsperado), Arrays.toString(retornoFeito));

	}

}
