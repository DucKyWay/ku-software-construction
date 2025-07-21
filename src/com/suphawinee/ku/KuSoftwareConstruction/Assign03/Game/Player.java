package src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.Game;

public class Player {
    private final String name;
    private int health;
    private int mana;

    Player(String name) {
        this.name = name;
        this.health = GameSettings.MAX_HEALTH;
        this.mana = GameSettings.MAX_MANA;
    }

    public void useMana(int amount) {
        if (mana >= amount) {
            this.mana -= amount;
        }
    }

    public void displayStats() {
        System.out.println(name + ": hp: " + health + " mana: " + mana);
    }
}
