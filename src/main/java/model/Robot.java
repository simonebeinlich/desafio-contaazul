package model;

public class Robot {
	static String direction = "N";
	static int posX = 0;
	static int posY = 0;
	static String position[] = new String[3];
	public static String[] drive (char command) {
		switch (command){
		case 'M': 		
			if (direction == "N")
				{posY = posY+1;}
			else if (direction == "S")
				{posY = posY-1;}
			else if (direction == "E") 
				{posX = posX+1;}
			else if (direction == "W") 
				{posX = posX-1;}			
		break;
		case 'R':			
			if (direction == "N")
				{direction = "E";}
			else if (direction == "S")
				{direction = "W";}
			else if (direction == "E") 
				{direction = "S";}
			else if (direction == "W") 
				{direction = "N";}
		break;
		case 'L':			
			if (direction == "N")
				{direction = "W";}
			else if (direction == "S")
				{direction = "E";}
			else if (direction == "E") 
				{direction = "N";}
			else if (direction == "W") 
				{direction = "S";}				
		break;		
	}		
		position[0] = Integer.toString(posX);
		position[1] = Integer.toString(posY);
		position[2] = direction;
		if ((posX | posY) > 5) {return null;}
		return position;		
	}
}
