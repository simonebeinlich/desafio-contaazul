package controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.Robot;

@RestController
@RequestMapping("/rest")
public class RobotController {
		
		@RequestMapping(value = "/mars/{id}")
		
		public static String[] getComando(@PathVariable("id") String id){

			String command;
			char x;
			int commandPos;
			int i = 0;
			String posicao[] = new String[3];			
			
			commandPos = id.length();
			command = id;
			if (commandPos >= 1) {
				for (i=0; i<commandPos; i++){
					x=command.charAt(i);
					if ((x != 'M') && (x != 'L') && (x != 'R')) 
						{return null;}
					else
						posicao = Robot.drive(x);				
				}								
				
			}
			else
				return null;
			return posicao;
			
		}
}
