package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign03.Game;

public class Mage extends Player {

    Mage(String name) {
        super(name);
    }

    public void castSpell(int cost) {
        super.useMana(cost);
    }
}
