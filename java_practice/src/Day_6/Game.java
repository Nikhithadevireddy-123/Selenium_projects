package Day_6;

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}
public class Game {
    private int bullets;

    public Game(Difficulty diff) {
        System.out.print("Game setup for " + diff + ": ");
        switch (diff) {
            case EASY:
                this.bullets = 3000;
                break;
            case MEDIUM:
                this.bullets = 2000;
                break;
            case HARD:
                this.bullets = 1000;
                break;
            default:
                this.bullets = 0; // Default case
                break;
        }
        System.out.println(this.bullets + " bullets.");
    }

    public static void main(String[] args) {
        new Game(Difficulty.EASY);
        new Game(Difficulty.MEDIUM);
        new Game(Difficulty.HARD);
    }
}
