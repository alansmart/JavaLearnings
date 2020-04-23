public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 200;

        int highScore = CalculateHighScore(true, 1000, 10, 400);

        System.out.println("Your final score is "+ highScore);
    }

    public static int CalculateHighScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver); {
            int finalScore = score + (levelCompleted *bonus);
            return finalScore;
        } else {
            return -1;
        }
    }


    public static int Cal

}
