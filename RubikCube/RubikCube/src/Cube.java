
public class Cube implements Constants {
	Side[] sides = new Side[6];
	
	public Cube(){
		
		//frontal posterior, derecha, izquierda, inferior, superior.
		Side front_white = new Side(front, white);
		Side right_green = new Side(right, green);
		Side left_blue = new Side(left, blue);
		Side top_red = new Side(top, red);
		Side bottom_orange = new Side(bottom, orange);
		Side back_yellow = new Side(back, yellow);
		
		sides[0] = front_white;
		sides[1] = right_green;
		sides[2] = left_blue;
		sides[3] = top_red;
		sides[4] = bottom_orange;
		sides[5] = back_yellow;
	}
	
	
	@Override
	public String toString(){
		
		return "";
	}
}
