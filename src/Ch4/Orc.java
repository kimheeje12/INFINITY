package Ch4;

public class Orc extends Monster {

    public String Name = "오크";
    public static int Level = 5;
    public static int Hp = 200;
    public static int MaxHp = 200;
    public static int Exp = 30;
    public static int Gold = 100;
    public static int Attackpower = 20;

    public void orcinfo(){
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
