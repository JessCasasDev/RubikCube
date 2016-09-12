package RubikCube1;

public class Operator {
	static Cube cube =  new Cube();
	
	public static void main(String[] args) {
		
		for (int i = 0; i < cube.sides.length; i++) {
			System.out.println(cube.sides[i]);
			
		}
		System.out.println("//////////////////");
		rotate(2,true, 1);
		System.out.println();		
	
		for (int i = 0; i < cube.sides.length; i++) {
			System.out.println(cube.sides[i]);
			
		}
	}
	

	public void assemble(){
		//Retorna un Cube
	}
	
	public void disarm(){
		
	}
	
	public static void rotate( int times, boolean clock, int movement){
		
		if(clock){
			switch(movement){
				case 1: 
					Token[] aux = cube.sides[0].getRow(2);
					cube.sides[0].setRow(2, cube.sides[4].getRow(2));
					cube.sides[4].setRow(2, cube.sides[5].getRow(2));
					cube.sides[5].setRow(2, cube.sides[3].getRow(2));
					cube.sides[3].setRow(2,aux);
				//	trasp(1); //por definir
			}		
		}
			
					
		}
				
	
	public boolean validate(){
		return true;
	}
	
}
