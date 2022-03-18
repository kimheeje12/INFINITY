package Ch3.Thread;

import Ch3.Balrog;
import Ch3.Golem;
import Ch3.Slime;

public class Mapeffect extends Thread {

    public static boolean day = true;
    Timer time = new Timer();
    Thread Time = new Thread(time);

    Slime slime = new Slime("슬라임", 100, 10);
    Golem golem = new Golem("골렘", 1000, 30);
    Balrog balrog = new Balrog("발록", 3000, 50);

    public void run() {
        try {
            while (true) {
                slime.setAttackpower(10);
                golem.setAttackpower(30);
                balrog.setAttackpower(50);
                for (int i = 2; i >= 1; i--) {
                    System.out.println("\n");
                    System.out.println("※ 밤까지 " + i + "분 남았습니다");
                    Thread.sleep(20000);
                    if (i == 1) {
                        day = false;
                    }
                }
                System.out.println("\n");
                System.out.println("※  밤이 되어 몬스터 공격력이 20% 상승하였습니다");
                slime.setAttackpower(15);
                golem.setAttackpower(36);
                balrog.setAttackpower(60);
                for (int i = 2; i >= 1; i--) {
                    System.out.println("\n");
                    System.out.println("※  낮까지 " + i + "분 남았습니다");
                    Thread.sleep(60000);
                    if (i == 1) {
                        day = true;
                        System.out.println("\n");
                        System.out.println("※  낮이 되어 몬스터 공격력이 원래대로 돌아왔습니다");
                    }
                }
            }
        } catch (InterruptedException e) {
        }
    }
}

