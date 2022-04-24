import java.util.Random;

abstract public class Player {

    private String name = "default";

    public abstract int guess();

    public void setName(String name) {
        if (name != null && !name.matches("^[a-zA-Z0-9.\\-]{3,}$")) {         //!".equals(name) bezpieczne ze wzgledu na null
            this.name = name;
        }
        else {
            //System.err.println("Wrong name");
            throw new IllegalArgumentExcepion("Wrong name");
        }
    }
    public Player() {}
    public Player (String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }
}

//regex101
//^[a-zA-Z0-9.\-]{3,}$