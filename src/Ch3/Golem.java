package Ch3;

public class Golem extends Monster {

    public String Name = "골렘";
    public static int Level = 15;
    public static int Hp = 1000;
    public static int MaxHp = 1000;
    public static int Exp = 50;
    public static int Gold = 300;
    public int Attackpower=30;

    public Golem(String name, int hp, int attackpower){
        super("골렘", 1000,30);
    }

    public void goleminfo(){
        System.out.println("쿵..쿵...쿵...");
        System.out.println("주변 지반이 거세게 흔들립니다.. 무언가 거대한 이동이 느껴집니다..");
        System.out.println("커다란 무언가가 서서히 다가옵니다..");
        System.out.println("\n");
        System.out.println("■■■■                       ■■■■");
        System.out.println("■■■■    ■■■■    ■■■■");
        System.out.println("■■■■■■★★■■■■■■");
        System.out.println("        ■■   ■■■■    ■■");
        System.out.println("    ■■       ■■■■        ■■");
        System.out.println("    ■■    ■■■■■■    ■■");
        System.out.println("    ■■    ■■       ■■    ■■");
        System.out.println("               ■■        ■■");
        System.out.println("           ■■■        ■■■");
        System.out.println("\n");
        System.out.println("▣ "+Name + "이 등장하였습니다");
        System.out.println("▶ HP: " + Hp);
        System.out.println("▶ 공격력: " + Attackpower);
    }

    public void Recovery() {
        Recovery = Hp;
        if (Hp <= 0) {
            Hp = MaxHp;
        }
    }
}
