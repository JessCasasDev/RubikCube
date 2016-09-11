
public class Token {
	String color;
	int x;
	int y;
	 
	public Token(String color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public static Token[][] construct(String color){
		Token[][] list = new Token[3][3];
		for(int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				list[i][j] = new Token(color, i, j);
			}
		}
		return list;
	}
	
	@Override
	public String toString(){
		return this.color + " - " + x + " - " + y;
	}
}
