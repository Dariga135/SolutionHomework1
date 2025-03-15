import java.util.ArrayList;
import java.util.List;
class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }

    public void increaseHealth(int amount) {
        health += amount;
    }

    public void addExperience(int amount) {
        experience += amount;
    }

    public void addItem(String item) {
        inventory.add(item);
        System.out.println(name + " picked up " + item + ". Inventory: " + inventory);
    }

    public void displayStatus() {
        System.out.println("Player status: Health = " + health + ", Experience = " + experience);
    }
}
