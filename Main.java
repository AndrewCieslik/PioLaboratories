public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.addPlayer(new PlayerHuman("Tytus"));
        game.addPlayer(new PlayerHuman("Romek"));
        game.addPlayer(new PlayerHuman("Romek"));

        game.play();

        game.printPlayers();
        game.removePlayer("Romek");
        game.printPlayers();
    }
}

