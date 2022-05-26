import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Player player;
    private Random dice = new Random();
    private List<Player> players = new ArrayList();

    public void addPlayer(Player player){
        players.add(player);
    }

    public void play() {
        int number;
        int guess;

        boolean repeat;

        do {
            repeat = true;

            number = dice.nextInt(6) + 1;
            System.out.println("Dice: " + number);

            for (Player player : players) {
                guess = player.guess();
                System.out.println("Player " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("Not today Sir!");
                } else {
                    System.out.println("Win!");
                    repeat = false;
                }
            }

        } while (repeat);
    }
}
