package Ch3.Thread;

import Ch3.Golem;

public class Pet2 extends Thread {
    volatile boolean stop;
    int count = 0;

    Golem golem = new Golem("골렘", 1000, 30);

    public Pet2(){
        this.stop = false;
    }

    public int attack(int attackpower){
        golem.Hp -= attackpower;
        if (golem.Hp <= 0) {
            golem.Hp = 0;
        }
        return attackpower;
    }

    public void run() {
        while (!stop) {
            try {
                int Petattack = attack(10);
                System.out.println("◈ 곤도르의 빛이 골렘에게 10 데미지를 입혔습니다 " + "▷ 골렘HP: "+golem.Hp + "/" +golem.MaxHp);
                sleep(5000); //5초에 1번씩 공격
                count++;
                if(golem.Hp == 200){
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
    public void Stop(boolean stop){
        this.stop = stop;
    }

    public boolean Stop2(boolean stop){
        this.stop = stop;
        return true;
    }

    public int count(){
        return count;
    }
}
