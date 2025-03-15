import java.util.ArrayList;
import java.util.List;

class GameLevelManager {
    private int level;

    public GameLevelManager() {
        this.level = 1;
    }

    public int getCurrentLevel() {
        return level;
    }

    public void advanceLevel() {
        level++;
        System.out.println("Advancing to level " + level);
    }

    public List<Enemy> getEnemiesForLevel() {
        List<Enemy> enemies = new ArrayList<>();
        switch (level) {
            case 1 -> {
                enemies.add(new Enemy("Skeleton", 10, 20));
                enemies.add(new Enemy("Zombie", 15, 30));
            }
            case 2 -> enemies.add(new Enemy("Vampire", 25, 50));
            case 3 -> {
                enemies.add(new Enemy("Vampire", 25, 50));
                enemies.add(new Enemy("Zombie", 15, 30));
            }
        }
        return enemies;
    }

    public List<Item> getItemsForLevel() {
        List<Item> items = new ArrayList<>();
        switch (level) {
            case 1 -> {
                items.add(new Item("Gold Coin", 0, 5));
                items.add(new Item("Health Elixir", 20, 0));
            }
            case 2 -> items.add(new Item("Magic Scroll", 0, 15));
            case 3 -> {
                items.add(new Item("Health Elixir", 20, 0));
                items.add(new Item("Gold Coin", 0, 5));
            }
        }
        return items;
    }
}