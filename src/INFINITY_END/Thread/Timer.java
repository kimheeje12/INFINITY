package INFINITY_END.Thread;

public class Timer extends  Thread{

    public void run() {
        try {
            for(int i=1; i<=20 ;i++) {
                Thread.sleep(60000); //1시간(3600초 * 1000), 1분 = 60000
                System.out.println("\n");
                System.out.println("※ 게임시작 후 " + i + "분이 경과하였습니다");
                if(i == 10){
                    System.out.println("\n");
                    System.out.println("☞ 제한시간이 10분 남았습니다");
                }
                if(i == 15){
                    System.out.println("\n");
                    System.out.println("☞ 제한시간이 5분 남았습니다");
                }
                if(i == 17){
                    System.out.println("\n");
                    System.out.println("☞ 제한시간이 3분 남았습니다");
                }
                if(i == 20) {
                    System.out.println("\n");
                    System.out.println("♨ 제한시간이 초과되어 미션실패로 간주하고 게임을 종료하겠습니다");
                    System.out.println("♨ 다음에 재도전해주세요.. 감사합니다 :)");
                    System.exit(0);
                }
            }
        } catch (InterruptedException e) {
        }
    }
}