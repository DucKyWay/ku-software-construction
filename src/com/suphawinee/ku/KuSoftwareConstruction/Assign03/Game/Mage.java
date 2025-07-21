package src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.Game;

public class Mage extends Player {

    Mage(String name) {
        super(name);
    }

    public void castSpell(int cost) {
        super.useMana(cost);
    }
}
