import java.util.Random;
public class Game{
    private Player player;
    private Random dice = new Random();

    public void addPlayer(Player player){
        this.player = player;
    }
    public void play() {
        int number;
        int guess;

        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Dice: " + number);

            guess = player.guess();
            System.out.println("Gracz: " + guess);

            if (guess == number) {
                System.out.println("Great! " + player.getName());
            } else {
                System.out.println("Wrong!");
            }
        } while (number != guess);
    }
}
