
public class Cube {
	Side[] sides = new Side[6];
	
	public Cube(){
		Token[][] white = Token.construct("white");
		Token[][] yellow = Token.construct("yellow");
		Token[][] green = Token.construct("green");
		Token[][] blue = Token.construct("blue");
		Token[][] red = Token.construct("red");
		Token[][] orange = Token.construct("orange");
		
		//frontal posterior, derecha, izquierda, inferior, superior.
		Side front_white = new Side("Front", white, "White");
		Side right_green = new Side("Right", green, "Green");
		Side left_blue = new Side("Left", blue, "Blue");
		Side top_red = new Side("Top", red, "Red");
		Side bottom_orange = new Side("Bottom", orange, "Orange");
		Side back_yellow = new Side("Back", yellow, "Yellow");
		
		sides[0] = front_white;
		sides[1] = right_green;
		sides[2] = left_blue;
		sides[3] = top_red;
		sides[4] = bottom_orange;
		sides[5] = back_yellow;
	}
	
	public static void main(String[] args) {
		Cube cube =  new Cube();
		for (int i = 0; i < cube.sides.length; i++) {
			System.out.println(cube.sides[i]);
			
		}
		System.out.println();
		cube.rotate(cube.sides[0], "column", "clockwise", 0);
		System.out.println();
		
	}
	public void assemble(){
		//Retorna un Cube
	}
	
	public void disarm(){
		
	}
	
	public void rotate(Side side, String movement, String orientation, int triplet){
		if(movement.equals("column")){
			if(orientation.equals("clockwise")){
				Token[] aux = new Token[3];
				for (int i = 0; i < side.tokens.length; i++) {
					aux[i] = side.tokens[i][triplet];
					
				}
				for (int i = 0; i < aux.length; i++) {
					System.out.println(aux[i]);
				}
				
			}
			else if(orientation.equals("anticlockwise")){
				
			}
		}
		else if(movement.equals("row")){
			
		}
	}
	
	public boolean validate(){
		return true;
	}
	
	@Override
	public String toString(){
		
		return "";
	}
}
