package Ch4;

public class Shop extends Town {
    public int Gold;

    public static void showinfo(String Name, String Description, int HpAmount, int Gold) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("이름: " + Name);
        System.out.println("설명: " + Description);
        System.out.println("HP회복: " + HpAmount);
        System.out.println("메소: " + Gold);
        System.out.println("--------------------------------------------------------------------------------");
    }

    public int getGold(int gold) {
        return Gold;
    }

    public void bankruptcy(int gold) {
        if (gold == 0) {
            System.out.println("\n");
            System.out.println("상점 주인:" + "\n메소가 부족하니 물건을 내어줄 수 없네");
            System.out.println("미안하지만 다음에 다시 찾아오게나");
            System.out.println("\n");
        }
    }
}

