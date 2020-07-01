package collectapples;



public class GameObject {
	
	private char symbol;

	public char getSymbol() {
		return symbol;
	}
	
	public void setSymbol(char newSymbol) {
		this.symbol = newSymbol;
	}
        
        @Override
        public String toString() {
            return symbol + "";
        }
}
