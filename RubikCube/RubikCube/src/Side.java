import java.util.HashMap;

public class Side implements Constants{
	
	int color;
	int name;
	Token[][] tokens;
	//HashMap<String, Side> neighbors;  //String: Arriba, Abajo, Derecha, Izquierda
	
	public Side(int name, int color){
		this.color = color;
		this.name = name;
		this.init(this.color);
	}	

	private void init(int color){
		Token[][] list = new Token[3][3];
		for(int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				switch(color){
				case 1:
					list[i][j] = new Token(w, i, j);
					break;
				case 2:
					list[i][j] = new Token(g, i, j);
					break;
				case 3:
					list[i][j] = new Token(b, i, j);
					break;
				case 4:
					list[i][j] = new Token(r, i, j);
					break;
				case 5:
					list[i][j] = new Token(o, i, j);
					break;
				case 6:
					list[i][j] = new Token(y, i, j);
					break;
				default:
					break;
				}
			}
		}
		tokens = list;
	}
	
	@Override 
	public String toString(){
		String tok = "";
		switch(this.name){
		case 10:
			System.out.println("Front");
			break;
		case 11:
			System.out.println("Back");
			break;
		case 12:
			System.out.println("Left");
			break;
		case 13:
			System.out.println("Right");
			break;
		case 14:
			System.out.println("Top");
			break;
		case 15:
			System.out.println("Bottom");
			break;
		default:
			break;
		}
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
