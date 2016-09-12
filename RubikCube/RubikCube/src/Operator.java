
public class Operator {
	
	public static void main(String[] args) {
		Cube cube =  new Cube();
		for (int i = 0; i < cube.sides.length; i++) {
			System.out.println(cube.sides[i]);
			
		}
		System.out.println();
		rotate(cube.sides[0], "column", "clockwise", 0);
		System.out.println();		
	}
	

	public void assemble(){
		//Retorna un Cube
	}
	
	public void disarm(){
		
	}
	
	public static void rotate(Side side, String movement, String orientation, int triplet){
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
	
}
