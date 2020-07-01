package collectapples;

public class Game {

    public static enum DIRECTIONS {
        LEFT, RIGHT, UP, DOWN
    };

    private int width, height;
    private GameObject[][] matrix;
    private Player player;

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new GameObject[this.width][this.height];
        initGame();
    }

    // Fill array with dots
    private void initGame() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                if ((i == 0 || i == width - 1) || (j == 0 || j == height - 1)) {
                    matrix[i][j] = new Wall();
                }
            }
        }

        
        player = new Player();
        matrix[width/2][height/2] = player;
        
        placeObjectRandomly(new Apple());
        
    }

    public void placeObjectRandomly(GameObject obj) {
        int x, y;
        do {
            x = (int) (Math.random() * width);
            y = (int) (Math.random() * height);
        } while (matrix[x][y] != null);
        matrix[x][y] = obj;
    }

    public int[] getPlayerPos() {
        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                if (this.matrix[x][y] == player) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }

    // Print the screen to console
    public void printScreen() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                if (this.matrix[x][y] == null) {
                    System.out.print('.');
                } else {
                    System.out.print(this.matrix[x][y]);
                }
            }
            System.out.println();
        }
        System.out.println("SCORE: " + player.getScore());
    }

    // Getters
    public int getGameWidth() {
        return this.width;
    }

    public int getGameHeight() {
        return this.width;
    }

    public void movePlayer(DIRECTIONS direction) {
        int changeX = 0, changeY = 0;
        switch (direction) {
            case UP:
                changeY = -1;
                break;
            case DOWN:
                changeY = 1;
                break;
            case LEFT:
                changeX = -1;
                break;
            case RIGHT:
                changeX = -1;
                break;
        }

        int[] currentPlayerPos = getPlayerPos();
        GameObject objOnTargetPos = matrix[currentPlayerPos[0] + changeX][currentPlayerPos[1] + changeY];
        if (objOnTargetPos instanceof Wall) {

        } else {
            boolean foundApple = false;
            if (objOnTargetPos instanceof Apple) {
                foundApple = true;
            }
            matrix[currentPlayerPos[0]][currentPlayerPos[1]] = null;
            matrix[currentPlayerPos[0] + changeX][currentPlayerPos[1] + changeY] = player;
            if(foundApple) {
                player.increaseScore();
                placeObjectRandomly(new Apple());
            }
        }
    }
}
