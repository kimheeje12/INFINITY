package INFINITY_END;

public class Character {
        public String Name;
        public int Hp;
        public int Exp=0;
        public int Attackpower;
        public int Level=1;
        public int MaxHp;
        public int Gold;
        public int Spirit;

        public boolean alive(){
                if(Hp <=0){
                        return false;
                }else{
                        return true;
                }
        }
}
