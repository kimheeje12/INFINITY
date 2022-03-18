package INFINITY_TEST;

public class Slime extends Monster {

    public String Name = "슬라임";
    public static int Hp = 100;
    public static int MaxHp = 100;
    public static int Exp = 20;
    public static int Level = 1;
    public static int Gold = 50;
    public static int Attackpower = 10;

    public void slimeinfo(){
        System.out.println(Name + "이 등장하였습니다");
        System.out.println("Level: " + Level);
        System.out.println("HP: " + Hp);
        System.out.println("공격력: " + Attackpower);
    }

    public void Recovery() {
        if (Hp <= 0) {
            Hp = MaxHp;
        }
    }
}
