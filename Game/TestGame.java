import java.util.*;


public class TestGame {
    public static void main(String[] args) {
        Random random = new Random();
        Game[] games = new Game[10];

        for (int i = 0; i < games.length; i++) {
            if (random.nextBoolean()) {
                games[i] = new BoardGame("Game" + i, random.nextInt(10) + 1, random.nextInt(20) + 1);
            } else {
                games[i] = new CardGame("Game" + i, random.nextInt(10) + 1, random.nextInt(52) + 1);
            }
        }

        System.out.println("Games before sorting:");
        for (Game game : games) {
            System.out.println(game);
        }


        Arrays.sort(games);

        System.out.println("\nGames after sorting:");
        for (Game game : games) {
            System.out.println(game);
        }

        System.out.println("\nPlaying games:");
        for (Game game : games) {
            game.play();
        }

        System.out.println("Time complexities:");
for (Game game : games) {
    System.out.println(game.getClass().getName() + ": " + game.getTimeComplexity());
}
    }
}