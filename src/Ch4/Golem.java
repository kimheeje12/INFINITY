package Ch4;

public class Golem extends Monster {

    public String Name = "골렘";
    public static int Level = 15;
    public static int Hp = 400;
    public static int MaxHp = 400;
    public static int Exp = 50;
    public static int Gold = 300;
    public static int Attackpower = 25;

    public void goleminfo(){
        System.out.println(Name + "이 등장하였습니다");
        System.out.println("Level: " + Level);
        System.out.println("HP: " + Hp);
        System.out.println("공격력: " + Attackpower);
    }

    public void Recovery() {
        Recovery = this.Hp;
        if (this.Hp <= 0) {
            this.Hp = this.MaxHp;
        }
    }
}
