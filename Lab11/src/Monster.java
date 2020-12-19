public class Monster implements Comparable<Monster> {
    private String name;
    private int health;

    // Constructor
    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override

    //C
    public int compareTo(Monster monster) {
        return health - monster.health;
    }

    //Getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean equals(Monster m) {
        return name.equals(m.name) && health == m.health;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
