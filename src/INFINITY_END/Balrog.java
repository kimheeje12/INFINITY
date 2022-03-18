package INFINITY_END;

public class Balrog extends Monster {

    public String Name = "마계왕 발록";
    public static int Hp = 3000;
    public static int MaxHp = 3000;
    public static int Level = 20;
    public int Attackpower = 50;

    public Balrog(String name, int hp, int attackpower) {
        super("발록", 3000, 50);
    }

    public void balroginfo() {
        System.out.println("어두운 기운이 사라지지 않고 주변이 음산하게 변하고 있습니다..\n");
        System.out.println("이 곳이 어둠의 기운으로 가득 차 곧 무슨 일이 일어날 듯 합니다..\n");
        System.out.println("어두운 기운과 함께 천지가 뒤흔들립니다..\n");
        System.out.println("신의 가호가 함께 하기를...\n");
        System.out.println("        ■           ■                      ■           ■");
        System.out.println("    ■               ■                      ■               ■");
        System.out.println("■■■■■    ■■■■■■■■     ■■■■■");
        System.out.println("    ■■■■       ■★■■★■         ■■■■");
        System.out.println("    ■■■■■■■■■■■■■■■■■■");
        System.out.println("        ■■       ■▼▼▼▼▼▼■        ■■");
        System.out.println("        ■■       ■▲▲▲▲▲▲■        ■■");
        System.out.println("    ■■■       ■■■■■■■■         ■■■");
        System.out.println("■    ■   ■    ■■■●●■■■     ■    ■    ■");
        System.out.println("■    ■   ■        ■■■■■■        ■    ■    ■");
        System.out.println("                          ■■■■■■");
        System.out.println("                          ■■       ■■");
        System.out.println("                      ■■■       ■■■");
        System.out.println("                      ■■■       ■■■");
        System.out.println("\n");
        System.out.println("☠ "+Name + "이 등장하였습니다");
        System.out.println("▶ HP: " + Hp);
        System.out.println("▶ 공격력: " + Attackpower);
    }
}