
public class Token {
	char color;
	int x;
	int y;
	 
	public Token(char color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString(){
		return this.color + " - " + x + " - " + y;
	}
}
