import java.util.HashMap;

public class Side {
	
	String color;
	String name;
	Token[][] tokens;
	//HashMap<String, Side> neighbors;  //String: Arriba, Abajo, Derecha, Izquierda
	
	public Side(String name, Token[][] tokens, String color){
		this.tokens = tokens;
		this.color = color;
		this.name = name;
	}
	
	@Override 
	public String toString(){
		String tok = "";
		System.out.println("Side: " + this.name);
		for (int i = 0; i < tokens.length; i++) {
			for (int j = 0; j < tokens.length; j++) {
				System.out.print(tokens[i][j].color + " ");
			}
			System.out.println();
		}
		//System.out.println(tok);
		return tok;
	}
	
}
