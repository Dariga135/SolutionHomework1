import java.util.List;

public class RefactoredAdventureGame {
    private Player player;
    private GameLevelManager levelManager;

    public RefactoredAdventureGame() {
        this.player = new Player("Adventurer");
        this.levelManager = new GameLevelManager();
    }

    public void fightEnemy(Enemy enemy) {
        System.out.println(player.getName() + " engages in combat with " + enemy.getType() + "!");
        player.reduceHealth(enemy.getDamage());
        player.addExperience(enemy.getExperienceReward());
        player.displayStatus();
    }

    public void pickUpItem(Item item) {
        System.out.println(player.getName() + " picks up " + item.getName() + ".");
        player.increaseHealth(item.getHealthBoost());
        player.addExperience(item.getExperienceBoost());
        player.displayStatus();
    }

    public void playGame() {
        while (levelManager.getCurrentLevel() <= 3 && player.getHealth() > 0) {
            System.out.println("=== Level " + levelManager.getCurrentLevel() + " ===");
            List<Enemy> enemies = levelManager.getEnemiesForLevel();
            List<Item> items = levelManager.getItemsForLevel();

            for (Enemy enemy : enemies) {
                if (player.getHealth() > 0) {
                    fightEnemy(enemy);
                }
            }

            for (Item item : items) {
                if (player.getHealth() > 0) {
                    pickUpItem(item);
                }
            }

            if (player.getHealth() > 0 && levelManager.getCurrentLevel() < 3) {
                levelManager.advanceLevel();
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has perished. Game Over.");
        } else {
            System.out.println("Congratulations, " + player.getName() + "! You completed the adventure with "
                    + player.getExperience() + " experience points!");
        }
    }

    public static void main(String[] args) {
        RefactoredAdventureGame game = new RefactoredAdventureGame();
        game.playGame();
    }
}