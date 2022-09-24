package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int Damag = RPG_Game.random.nextInt(50);
        setSavedDamage(this.getDamage() + Damag);
        boss.setHealth(boss.getHealth() - getSavedDamage());
        System.out.println("Berserk  seved  damag" + getSavedDamage());
    }
}
