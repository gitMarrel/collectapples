package collectapples;

public class Player extends GameObject {
    
    private int score;

    public Player(char symbol) {
        setSymbol(symbol);
    }

    public Player() {
        this('@');
    }
    
    public int getScore() {
        return score;
    }
    
    public void increaseScore() {
        increaseScore(1);
    }
    
    public void increaseScore(int amount) {
        score += amount;
    }
}
