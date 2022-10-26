package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name, int savedDamage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
        this.savedDamage = savedDamage;
    }

   /* public void setSavedDamage(int savedDamage) {

        this.savedDamage = savedDamage;
    }*/

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && this == heroes[i]){
                heroes[i].setHealth(heroes[i].getHealth()+boss.getDamage()-this.savedDamage);
                boss.setHealth(boss.getHealth()-heroes[i].getDamage()+this.savedDamage);
                System.out.println("Berserk применил суперспособность");
            }

        }



    }
}
