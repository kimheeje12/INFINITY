package INFINITY_TEST;

public class Skull extends Monster {

    public String Name = "해골병사";
    public static int Level = 10;
    public static int Hp = 300;
    public static int MaxHp = 300;
    public static int Exp = 40;
    public static int Gold = 200;
    public static int Attackpower = 30;

    public void skullinfo(){
        System.out.println(Name + "가 등장하였습니다");
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
