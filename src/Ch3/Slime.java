package Ch3;

public class Slime extends Monster {

    public String Name = "슬라임";
    public static int Hp = 100;
    public static int MaxHp = 100;
    public static int Exp = 20;
    public static int Level = 1;
    public static int Gold = 50;
    public int Attackpower = 10;

    public Slime(String name, int hp, int attackpower){
        super("슬라임", 100,10);
    }

    public void slimeinfo(){
        System.out.println("푸른 엘레나 숲 한가운데 시원한 바람이 불고 있습니다");
        System.out.println("콩..콩..콩");
        System.out.println("저기 멀리 말캉거리는 초록색 물체가 빠른 속도로 다가옵니다");
        System.out.println("\n");
        System.out.println("                         ■■＊");
        System.out.println("                      ■");
        System.out.println("           ■■■■■");
        System.out.println("       ■■■■■■■");
        System.out.println("       ■★■■★■■");
        System.out.println("       ■■■■■■■");
        System.out.println("           ■■■■■");
        System.out.println("\n");
        System.out.println("○ "+Name + "이 등장하였습니다");
        System.out.println("▶ HP: " + Hp);
        System.out.println("▶ 공격력: " + Attackpower);
    }

    public void Recovery() {
        if (Hp <= 0) {
            Hp = MaxHp;
        }
    }
}
