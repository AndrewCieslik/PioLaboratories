import java.util.ArrayList;

public class GraRzutKostkaPIO {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new PlayerHuman("Janusz");
        game.addPlayer(player);
        game.play();
    }
}
//try {
//        player.setName(null);
//        }
//        catch (IllegalArgumentException ex) {
//        System.err.println("Error" + ex.getMessage());
//        }