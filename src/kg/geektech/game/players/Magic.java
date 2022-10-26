package kg.geektech.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
            int n=2;
          for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i] && boss.getHealth()>0) {
               heroes[i].setDamage(heroes[i].getDamage()*n);

            }
        }
        System.out.println("увеличил силу каждого героя в "+n +" раза ");


    }
}
