public class Main {
    public static void main(String[] args) {
        Game game = new Game(new WinStatistics());

        game.addPlayer(new PlayerHuman("Tytus"));
        game.addPlayer(new PlayerHuman("Romek"));

        game.play();
        game.printPlayers();
        game.stats.print();
    }
}

