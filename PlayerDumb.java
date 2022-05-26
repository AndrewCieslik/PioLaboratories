public class PlayerDumb extends Player{

    public PlayerDumb() {
    }

    public PlayerDumb(String name) {
        super(name);
    }

    @Override
    public int guess() {
        return 3;
    }
}