import java.util.Scanner;

public class PlayerHuman extends Player {

    public PlayerHuman() {
    }

    public PlayerHuman(String name) {
        super(name);
    }

    public int guess() {
        System.out.println("Choose from 1 to 6");
        return new Scanner(System.in).nextInt();
    }
}
