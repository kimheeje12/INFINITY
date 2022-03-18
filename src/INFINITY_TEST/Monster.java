package INFINITY_TEST;

public class Monster extends Character {

    public int Recovery;
    public static int Spirit = 1;

    ///////////////////////////////////////////////////////////////////////////////////////
    int getExp(int Exp){
        return Exp;
   }
    int getGold(int Gold){
        return Gold;
   }
    int getSpirit(int Spirit){return Spirit;}

    //MOSTER HP return
    public void Recovery() {
        if (Hp <= 0) {
            Hp = MaxHp;
        }
    }
}
