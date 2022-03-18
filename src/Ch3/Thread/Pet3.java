package Ch3.Thread;

import Ch3.Balrog;

public class Pet3 extends Thread {
    volatile boolean stop;
    int count = 0;

    Balrog balrog = new Balrog("발록", 3000, 50);

    public Pet3(){
        this.stop = false;
    }

    public int attack(int attackpower){
        balrog.Hp -= attackpower;
        if (balrog.Hp <= 0) {
            balrog.Hp = 0;
        }
        return attackpower;
    }

    public void run() {
        while (!stop) {
            try {
                int Petattack = attack(10);
                System.out.println("◈ 곤도르의 빛이 마계왕 발록에게 10 데미지를 입혔습니다 " + "▷ 발록HP: " + balrog.Hp + "/" + balrog.MaxHp);
                sleep(5000); //5초에 1번씩 공격
                count++;
                if(balrog.Hp == 600){
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
