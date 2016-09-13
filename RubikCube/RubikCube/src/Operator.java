
public class Operator {
	static Cube cube =  new Cube();
	
	public static void main(String[] args) {
		/*
		for (int i = 0; i < cube.sides.length; i++) {
			System.out.println(cube.sides[i]);
			
		}
		System.out.println("//////////////////");*/
		
		operation(2,true, 1);
		operation(2,true, 4);
		operation(2,true, 2);
		operation(2,true, 3);
		operation(2,true, 5);
		operation(2,true, 2);
		for (int i = 0; i < cube.sides.length; i++) {
			System.out.println(cube.sides[i]);
			
		}
		System.out.println("ROTAR");
		cube.sides[1].rotate();
		for (int i = 0; i < cube.sides.length; i++) {
			System.out.println(cube.sides[i]);			
		}
	}
	

	public void assemble(){
		//Retorna un Cube
	}
	
	public void disarm(){
		
	}
	
	public static void operation(int times, boolean clock, int movement) {
		Token[] aux;
		if (clock) {
			switch (movement) {
			case 1:
				aux = cube.sides[0].getRow(2);
				cube.sides[0].setRow(2, cube.sides[4].getRow(2));
				cube.sides[4].setRow(2, cube.sides[5].getRow(2));
				cube.sides[5].setRow(2, cube.sides[3].getRow(2));
				cube.sides[3].setRow(2, aux);
				cube.sides[1].rotate();
				break;
			case 2:
				aux = cube.sides[0].getRow(2);
				cube.sides[0].setRow(0, cube.sides[4].getRow(0));
				cube.sides[4].setRow(0, cube.sides[5].getRow(0));
				cube.sides[5].setRow(0, cube.sides[3].getRow(0));
				cube.sides[3].setRow(0, aux);
				// cube.sides[2].rotate();
				break;
			case 3:
				aux = cube.sides[0].getColumn(0);
				cube.sides[0].setColumn(0, cube.sides[2].getColumn(0));
				cube.sides[2].setColumn(0, cube.sides[5].getColumn(0));
				cube.sides[5].setColumn(0, cube.sides[1].getColumn(0));
				cube.sides[1].setColumn(0, aux);
				// cubes.sides[3].rotate(); Diferente
				break;
			case 4:
				aux = cube.sides[0].getColumn(0);
				cube.sides[0].setColumn(2, cube.sides[2].getColumn(2));
				cube.sides[2].setColumn(2, cube.sides[5].getColumn(2));
				cube.sides[5].setColumn(2, cube.sides[1].getColumn(2));
				cube.sides[1].setColumn(2, aux);
				// cubes.sides[3].rotate(); Diferente
				break;
			case 5:
				aux = cube.sides[2].getColumn(2);
				cube.sides[2].setColumn(2, cube.sides[4].getRow(2));
				cube.sides[4].setRow(2, cube.sides[1].getColumn(0));
				cube.sides[1].setColumn(0, cube.sides[3].getRow(0));
				cube.sides[3].setRow(0, aux);
				// cubes.sides[1].rotate(); Diferente
				break;
			case 6:
				aux = cube.sides[2].getColumn(2);
				cube.sides[2].setColumn(0, cube.sides[4].getRow(0));
				cube.sides[4].setRow(0, cube.sides[1].getColumn(2));
				cube.sides[1].setColumn(0, cube.sides[3].getRow(2));
				cube.sides[3].setRow(2, aux);
				// cubes.sides[1].rotate(); Diferente
				break;
			}
		}

	}
	
	public boolean validate(){
		return true;
	}
	
}
