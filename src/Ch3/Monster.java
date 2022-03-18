package Ch3;

import static java.lang.Thread.sleep;

public class Monster extends Character {
    volatile boolean stop;
    int count = 0;

    public int Recovery;
    public static int Spirit = 1;
    int attack;

    int time_count = 0;

    ///////////////////////////////////////////////////////////////////////////////////////

    public Monster(String name, int hp, int attackpower) {
        Name = name;
        Hp = hp;
        Attackpower = attackpower;
    }

    int getExp(int Exp) {
        return Exp;
    }

    int getGold(int Gold) {
        return Gold;
    }

    int getSpirit(int Spirit) {
        return Spirit;
    }

    public int getAttackpower(){
        return Attackpower;
    }

    public int setAttackpower(int attackpower) {
        return Attackpower;
    }

    //MOSTER HP return
    public void Recovery() {
        if (Hp <= 0) {
            Hp = MaxHp;
        }
    }

    public void takeDamage(int damage) {
        Hp -= damage;
        if (Hp < 0) {
            Hp = 0;
        }
    }

    public int Attack(Hero hero) {
        hero.Hp -= Attackpower;
        if (hero.Hp <= 0) {
            hero.Hp = 0;
        }
        return 0;
    }
}
