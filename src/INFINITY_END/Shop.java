package INFINITY_END;

public class Shop extends Town {
    public int Gold;

    public static void showinfo(String Name, String Description, int HpAmount, int Gold) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("▷ 이름: " + Name);
        System.out.println("▷ 설명: " + Description);
        System.out.println("▷ HP회복: " + HpAmount);
        System.out.println("▷ 메소: " + Gold);
        System.out.println("--------------------------------------------------------------------------------");
    }

    public int getGold(int gold) {
        return Gold;
    }
}

