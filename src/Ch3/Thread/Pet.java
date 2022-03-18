package Ch3.Thread;

import Ch3.Slime;

public class Pet extends Thread{
    volatile boolean stop;
    int count = 0;

    Slime slime = new Slime("슬라임", 100, 10);

    public Pet(){
        this.stop = false;
    }

    public int attack(int attackpower){
        slime.Hp -= attackpower;
        if (slime.Hp <= 0) {
            slime.Hp = 0;
        }
        return attackpower;
    }

    public void run() {
        while (!stop) {
            try {
                int Petattack = attack(10);
                System.out.println("◈ 곤도르의 빛이 슬라임에게 10 데미지를 입혔습니다 " + "▷ 슬라임HP: "+slime.Hp + "/" +slime.MaxHp);
                sleep(5000); //5초에 1번씩 공격
                count++;
                if(slime.Hp == 20){
                    Stop(true);
                }
                if(stop == true){
                    Stop(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void Stop(boolean stop){this.stop = stop;}

    public boolean Stop2(boolean stop){
        this.stop = stop;
        return true;
    }

    public int count(){
        return count;
    }
}
