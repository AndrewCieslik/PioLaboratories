import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Player player;
    private Random dice = new Random();
    private List<Player> players = new ArrayList();

    public void addPlayer(Player player){
        if (!nameExists(player.getName())) {
            players.add(player);
        } else {
            player.setName(player.getName() + dice.nextInt(10));
            addPlayer(player);
        }
    }

    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
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
