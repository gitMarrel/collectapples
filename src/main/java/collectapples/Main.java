package collectapples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Constants
        final int SCREEN_WIDTH = 20; // Columns
        final int SCREEN_HEIGHT = 10; // Rows

        // Init screen
        Game game = new Game(SCREEN_WIDTH, SCREEN_HEIGHT);
        
        // Input from player
        Scanner scanner = new Scanner(System.in);
        char input;

        // The game logic starts here
        boolean isRunning = true;

        while (isRunning) {
            game.printScreen();
            // Get input from player and do something
            switch (input = scanner.nextLine().charAt(0)) {
                case 'a':
                    game.movePlayer(Game.DIRECTIONS.LEFT);
                    break;
                case 'd':
                    game.movePlayer(Game.DIRECTIONS.RIGHT);
                    break;
                case 'w':
                    game.movePlayer(Game.DIRECTIONS.UP);
                    break;
                case 's':
                    game.movePlayer(Game.DIRECTIONS.DOWN);
                    break;
            }
            
        }
    }

}
