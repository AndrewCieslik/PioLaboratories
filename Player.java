import java.util.Random;

abstract public class Player {

    private String name = "default";

    public abstract int guess();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z0-9.\\-]{3,}$")) {            //regex101 page
            this.name = name;
        }
        else {
            System.err.println("Wrong name");
           throw new IllegalArgumentException("Wrong name");
        }
    }
    public Player() {

    }

    public Player (String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }
}

