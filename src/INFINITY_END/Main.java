package INFINITY_END;

import java.util.Scanner;

import INFINITY_END.BGM.*;
import INFINITY_END.Thread.Timer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();

        BGM t1 = new BGM(".mp3", false);
        t1.start();

        int input = 0;

        Shop shop = new Shop();
        Warrior warrior = new Warrior();
        Archer archer = new Archer();
        Rogue rogue = new Rogue();

        String myname;
        Scanner scan = new Scanner(System.in);

        Slime slime = new Slime("슬라임", 100, 10);
        Golem golem = new Golem("골렘", 1000, 30);
        Balrog balrog = new Balrog("발록", 3000,50);

        String m1 = "아주 오래된 옛날, 평화롭던 곤도르에 통제할 수 없는 어두운 기운과 함께 마계왕 발록이 출현합니다\n";
        String m2 = "곤도르의 왕 데네소르는 백성을 모두 살리기 위한 대가로 사랑하는 공주를 마계왕 발록에게 내어주게 되고..\n";
        String m3 = "이후 데네소르 왕은 재정비를 마치고 발록을 무찌르고 딸을 구하기 위해 왕국 기사단 모집벽보를 전국 각지에 붙이게 되는데...\n";
        String m4 = "\n사용하실 이름을 입력해주세요\n";

        char[] s1 = m1.toCharArray();
        char[] s2 = m2.toCharArray();
        char[] s3 = m3.toCharArray();
        char[] s4 = m4.toCharArray();

        //Hero의 시작 - INFINITY
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        System.out.println("■■■■■■□■■■□□□■■■□■■■■■■■□■■■■■■□■■■□□□■■■□■■■■■■□■■■■■■□■■■□□□□■■■");
        System.out.println("■■■■■■□■■■■□□■■■□■■■■■■■□■■■■■■□■■■■□□■■■□■■■■■■□■■■■■■□□■■■□□■■■□");
        System.out.println("□□■■□□□■■■■■□■■■□■■■□□□□□□□■■□□□■■■■■□■■■□□□■■□□□□□■■□□□□□■■■■■■□□");
        System.out.println("□□■■□□□■■■■■■■■■□■■■■■■■□□□■■□□□■■■■■■■■■□□□■■□□□□□■■□□□□□□■■■■□□□");
        System.out.println("□□■■□□□■■■□■■■■■□■■■■■■■□□□■■□□□■■■□■■■■■□□□■■□□□□□■■□□□□□□□■■□□□□");
        System.out.println("□□■■□□□■■■□□■■■■□■■■□□□□□□□■■□□□■■■□□■■■■□□□■■□□□□□■■□□□□□□□■■□□□□");
        System.out.println("■■■■■■□■■■□□□■■■□■■■□□□□□■■■■■■□■■■□□□■■■□■■■■■■□□□■■□□□□□□□■■□□□□");
        System.out.println("■■■■■■□■■■□□□■■■□■■■□□□□□■■■■■■□■■■□□□■■■□■■■■■■□□□■■□□□□□□□■■□□□□");
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        for(int i = 0;i<s1.length;i++){
            System.out.print(s1[i]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0;i<s2.length;i++) {
            System.out.print(s2[i]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0;i<s3.length;i++) {
            System.out.print(s3[i]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0;i<s4.length;i++) {
            System.out.print(s4[i]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        myname =scan.next();
        System.out.println("\n");
        System.out.println("만나서 반갑습니다! " + myname +"님"+" 곤도르 왕국 기사단에 지원하실 직업을 고르세요");
        System.out.println("〓〓〓〓〓〓〓〓〓〓[♔직업선택♔]〓〓〓〓〓〓〓〓〓〓〓");
        System.out.println("1. ⚔전사(HP 500, 공격력 15)"+"\n2. ➳궁수(HP 350, 공격력 20)"+"\n3. ✷도적(HP 250, 공격력 25)");
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");

        timer.start();
////////////////////////////////////////////////////////////////////////////////////////// 전사
        Start:
        while (true) {
            input = scan.nextInt();
            t1.close();
            if (input == 1) {
                System.out.println("안녕하세요! " + myname + "님");
                warrior.Warriorinfo();
                loop:
                while (true) {
                    System.out.println("\n");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⎈이 동⎈]〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. ☠던전" + "\n2. ⚑마을" + "\n3. ᛭인벤토리" + "\n4. ♠카드" + "\n5. §스텟");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("\n");
                    while (true) {
                        input = scan.nextInt();
                        if (input == 1) {
                            dungeon:
                            while (true) {
                                System.out.println("\n");
                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[☠던 전☠]〓〓〓〓〓〓〓〓〓〓〓");
                                System.out.println(myname + "님" + " 전투하실 몬스터를 골라주세요");
                                System.out.println("1. ○슬라임(HP 100 / 공격력 10)" + "\n2. ▣골렘(HP 1000 / 공격력 30)" + "\n3. ☠발록(HP 3000 / 공격력 50)" + "\n0. 처음으로 돌아가기");
                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                System.out.println("\n");
                                while (true) {
                                    input = scan.nextInt();
                                    if (input == 1) {
                                        warrior.fight();
                                        continue loop;
                                    } else if (input == 2) {
                                        if (true) {
                                            warrior.fight2();
                                            continue loop;
                                        }
                                    } else if (input == 3) {
                                        if (true) {
                                            warrior.fight3();
                                            if(balrog.Hp <=0){
                                                break loop;
                                            }else{
                                                continue loop;
                                            }
                                        }
                                    } else if (input ==0) {
                                        continue loop;
                                    } else {
                                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    }
                                }
                            }
                        } else if (input == 2) {
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⚑마 을⚑]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println(myname + "님" + " 입장하실 장소를 골라주세요");
                            System.out.println("1. ❀상점" + "\n2. †교회" + "\n3. ♣PUB" + "\n0. 처음으로 돌아가기");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            input = scan.nextInt();
                            loop3:
                            while (true) {
                                if (input == 1) {
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓[❀상 점❀]〓〓〓〓〓〓〓〓〓〓〓〓");
                                    System.out.println("❀상점주인 김씨:" + "\n자네 무엇이 필요한가? 뭐든 있으니 아무거나 골라보게나♪");
                                    System.out.println("\n");
                                    System.out.println(myname + "님" + " 구매하실 아이템을 골라주세요");
                                    System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n0. 처음으로 돌아가기");
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                    input = scan.nextInt();
                                    loop4:
                                    while (true) {
                                        if (input == 1) {
                                            Shop.showinfo("빨간물약", "김박사가 개발한 피로회복제", 100, 50);
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            System.out.println("1. 구매" + "\n2. 돌아가기");
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("빨간물약을 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                                                warrior.SetGold2(50);
                                                warrior.inventory.setRedpotionCount2(1);
                                                warrior.Redpotionstop(1);
                                                warrior.inventory.itemshow();
                                                warrior.Goldshow();
                                                continue loop3;
                                            } else if (input == 2) {
                                                continue loop3;
                                            } else {
                                                while (true) {
                                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                                    input = scan.nextInt();
                                                    if (input == 1 || input == 0) {
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                continue loop;
                                            }
                                        }
                                        if (input == 2) {
                                            Shop.showinfo("순록우유", "엘론드 숲에 사는 순록의 우유", 300, 150);
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            System.out.println("1. 구매" + "\n0. 돌아가기");
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("순록우유를 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                                                System.out.println();
                                                warrior.SetGold2(150);
                                                warrior.inventory.setMilkCount2(1);
                                                warrior.Milkstop(1);
                                                warrior.inventory.itemshow();
                                                warrior.Goldshow();
                                                continue loop3;
                                            } else if (input == 0) {
                                                continue loop3;
                                            } else {
                                                while (true) {
                                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                                    input = scan.nextInt();
                                                    if (input == 1 || input == 0) {
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                continue loop;
                                            }
                                        } else if (input == 0) {
                                            continue loop;
                                        } else {
                                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                        }
                                    return;
                                    }
                                } else if (input == 2) {
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[†교 회†]〓〓〓〓〓〓〓〓〓〓〓");
                                    System.out.println("\n");
                                    System.out.println("†목사님: " + "\n돌아가시오! 여기는 자네가 올 곳이 아니네");
                                    System.out.println("때가 되면 하느님이 그대를 부를 것이오");
                                    System.out.println("\n");
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                    continue loop;
                                } else if (input == 3) {
                                    warrior.gamble();
                                    continue loop;
                                }else if (input == 0) {
                                    continue loop;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                }
                            }
                        } else if (input == 3) {
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                            warrior.inventory.itemshow();
                            warrior.Goldshow();
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("사용하실 아이템을 선택해주세요");
                            System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n0. 처음으로 돌아가기");
                            input = scan.nextInt();
                            if (input == 1) {
                                warrior.UsepotionHp1(warrior.tempHp);
                                warrior.inventory.setRedpotionCount(1);
                                System.out.println("되돌아가시려면 0번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 2) {
                                warrior.UsepotionHp2(warrior.tempHp);
                                warrior.inventory.setMilkCount(1);
                                System.out.println("되돌아가시려면 0번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 0) {
                                continue loop;
                            } else {
                                while(true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if(input == 1 || input == 2 || input == 0){
                                        break;
                                    }else{
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 4) {
                            warrior.cardReinforce();
                        } else if(input == 5) {
                            System.out.println("스텟을 확인합니다");
                            warrior.stat();
                            System.out.println("되돌아가시려면 0번을 눌러주세요");
                            input = scan.nextInt();
                            if (input == 0) {
                                continue loop;
                            }else {
                                while (true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if (input == 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else {
                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                        }
                    }
                }
////////////////////////////////////////////////////////////////////////////////////////// 궁수
            } else if (input == 2) {
                System.out.println("안녕하세요! " + myname + "님");
                archer.Archerinfo();
                loop:
                while (true) {
                    System.out.println("\n");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⎈이 동⎈]〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. ☠던전" + "\n2. ⚑마을" + "\n3. ᛭인벤토리" + "\n4. ♠카드" + "\n5. §스텟");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    while (true) {
                        input = scan.nextInt();
                        if (input == 1) {
                            dungeon:
                            while (true) {
                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[☠던 전☠]〓〓〓〓〓〓〓〓〓〓〓");
                                System.out.println(myname + "님" + " 전투하실 몬스터를 골라주세요");
                                System.out.println("1. ○슬라임(HP 100 / 공격력 10)" + "\n2. ▣골렘(HP 1000 / 공격력 30)" + "\n3. ☠발록(HP 3000 / 공격력 50)" + "\n0. 처음으로 돌아가기");
                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                System.out.println("\n");
                                while (true) {
                                    input = scan.nextInt();
                                    if (input == 1) {
                                        archer.fight();
                                        continue loop;
                                    } else if (input == 2) {
                                        if (true) {
                                            archer.fight2();
                                            continue loop;
                                        }
                                    } else if (input == 3) {
                                        if (true) {
                                            archer.fight3();
                                            if(balrog.Hp <=0){
                                                break loop;
                                            }else{
                                                continue loop;
                                            }
                                        }
                                    } else if (input == 0) {
                                        continue loop;
                                    } else {
                                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    }
                                }
                            }
                        } else if (input == 2) {
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⚑마 을⚑]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println(myname + "님" + " 입장하실 장소를 골라주세요");
                            System.out.println("1. ❀상점" + "\n2. †교회" + "\n3. ♣PUB" + "\n0. 처음으로 돌아가기");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            input = scan.nextInt();
                            loop3:
                            while (true) {
                                if (input == 1) {
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓[❀상 점❀]〓〓〓〓〓〓〓〓〓〓〓〓");
                                    System.out.println("❀상점주인 김씨:" + "\n자네 무엇이 필요한가? 뭐든 있으니 아무거나 골라보게나♪");
                                    System.out.println("\n");
                                    System.out.println(myname + "님" + " 구매하실 아이템을 골라주세요");
                                    System.out.println("1. 빨간물약(HP +100회복, 50메소)" + "\n2. 순록우유(HP +300회복, 150메소)" + "\n0. 처음으로 돌아가기");
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                    input = scan.nextInt();
                                    while (true) {
                                        if (input == 1) {
                                            Shop.showinfo("빨간물약", "김박사가 개발한 피로회복제", 100, 50);
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            System.out.println("1. 구매" + "\n0. 돌아가기");
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("빨간물약을 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                                                archer.SetGold2(50);
                                                archer.inventory.setRedpotionCount2(1);
                                                archer.Redpotionstop(1);
                                                archer.inventory.itemshow();
                                                archer.Goldshow();
                                                continue loop3;
                                            } else if (input == 0) {
                                                continue loop3;
                                            } else {
                                                while (true) {
                                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                                    input = scan.nextInt();
                                                    if (input == 1 || input == 0) {
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                continue loop;
                                            }
                                        }
                                        if (input == 2) {
                                            Shop.showinfo("순록우유", "엘론드 숲에 사는 순록의 우유", 300, 150);
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            System.out.println("1. 구매" + "\n0. 돌아가기");
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("순록우유를 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                                                archer.SetGold2(150);
                                                archer.inventory.setMilkCount2(1);
                                                archer.Milkstop(1);
                                                archer.inventory.itemshow();
                                                archer.Goldshow();
                                                continue loop3;
                                            } else if (input == 0) {
                                                continue loop3;
                                            } else {
                                                while (true) {
                                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                                    input = scan.nextInt();
                                                    if (input == 1 || input == 0) {
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                continue loop;
                                            }
                                        } else if (input == 0) {
                                            continue loop;
                                        } else {
                                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                        }
                                    }
                                } else if (input == 2) {
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[†교 회†]〓〓〓〓〓〓〓〓〓〓〓");
                                    System.out.println("\n");
                                    System.out.println("†목사님: " + "\n돌아가시오! 여기는 자네가 올 곳이 아니네");
                                    System.out.println("때가 되면 하느님이 그대를 부를 것이오");
                                    System.out.println("\n");
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                    continue loop;
                                } else if (input == 3) {
                                    archer.gamble();
                                    continue loop;
                                }else if (input == 0) {
                                    continue loop;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                }
                            }
                        } else if (input == 3) {
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                            archer.inventory.itemshow();
                            archer.Goldshow();
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("사용하실 아이템을 선택해주세요");
                            System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n0. 처음으로 돌아가기");
                            input = scan.nextInt();
                            if (input == 1) {
                                archer.UsepotionHp1(archer.tempHp);
                                archer.inventory.setRedpotionCount(1);
                                System.out.println("되돌아가시려면 0번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 2) {
                                archer.UsepotionHp2(archer.tempHp);
                                archer.inventory.setMilkCount(1);
                                System.out.println("되돌아가시려면 0번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 0) {
                                continue loop;
                            } else {
                                while(true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if(input == 1 || input == 2 || input == 0){
                                        break;
                                    }else{
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 4) {
                           archer.cardReinforce();
                        } else if(input == 5){
                            System.out.println("스텟을 확인합니다");
                            archer.stat();
                            System.out.println("되돌아가시려면 0번을 눌러주세요");
                            input = scan.nextInt();
                            if (input == 0) {
                                continue loop;
                            }else {
                                while (true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if (input == 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else {
                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                        }
                    }
                }
            }
////////////////////////////////////////////////////////////////////////////////////////// 도적
            else if (input == 3) {
                System.out.println("안녕하세요! " + myname + "님");
                rogue.Rogueinfo();
                loop:
                while (true) {
                    System.out.println("\n");
                    System.out.println("");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⎈이 동⎈]〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. ☠던전" + "\n2. ⚑마을" + "\n3. ᛭인벤토리" + "\n4. ♠카드" + "\n5. §스텟");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    while (true) {
                        input = scan.nextInt();
                        if (input == 1) {
                            dungeon:
                            while (true) {
                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[☠던 전☠]〓〓〓〓〓〓〓〓〓〓〓");
                                System.out.println(myname + "님" + " 전투하실 몬스터를 골라주세요");
                                System.out.println("1. ○슬라임(HP 100 / 공격력 10)" + "\n2. ▣골렘(HP 1000 / 공격력 30)" + "\n3. ☠발록(HP 3000 / 공격력 50)" + "\n0. 처음으로 돌아가기");
                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                System.out.println("\n");
                                while (true) {
                                    input = scan.nextInt();
                                    if (input == 1) {
                                        rogue.fight();
                                        continue loop;
                                    } else if (input == 2) {
                                        if (true) {
                                            rogue.fight2();
                                            continue loop;
                                        }
                                    } else if (input == 3) {
                                        if (true) {
                                            rogue.fight3();
                                            if(balrog.Hp <=0){
                                                break loop;
                                            }else{
                                                continue loop;
                                            }
                                        }
                                    } else if (input == 0) {
                                        continue loop;
                                    } else {
                                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    }
                                }
                            }
                        } else if (input == 2) {
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⚑마 을⚑]〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println(myname + "님" + " 입장하실 장소를 골라주세요");
                            System.out.println("1. ❀상점" + "\n2. †교회" + "\n3. ♣PUB" + "\n0. 처음으로 돌아가기");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            input = scan.nextInt();
                            loop3:
                            while (true) {
                                if (input == 1) {
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓[❀상 점❀]〓〓〓〓〓〓〓〓〓〓〓〓");
                                    System.out.println("❀상점주인 김씨:" + "\n자네 무엇이 필요한가? 뭐든 있으니 아무거나 골라보게나♪");
                                    System.out.println("\n");
                                    System.out.println(myname + "님" + " 구매하실 아이템을 골라주세요");
                                    System.out.println("1. 빨간물약(HP +100회복, 50메소)" + "\n2. 순록우유(HP +300회복, 150메소)" + "\n0. 처음으로 돌아가기");
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                    input = scan.nextInt();
                                    while (true) {
                                        if (input == 1) {
                                            Shop.showinfo("빨간물약", "김박사가 개발한 피로회복제", 100, 50);
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            System.out.println("1. 구매" + "\n0. 돌아가기");
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("빨간물약을 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                                                rogue.SetGold2(50);
                                                rogue.inventory.setRedpotionCount2(1);
                                                rogue.Redpotionstop(1);
                                                rogue.inventory.itemshow();
                                                rogue.Goldshow();
                                                continue loop3;
                                            } else if (input == 0) {
                                                continue loop3;
                                            } else {
                                                while (true) {
                                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                                    input = scan.nextInt();
                                                    if (input == 1 || input == 0) {
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                continue loop;
                                            }
                                        }
                                        if (input == 2) {
                                            Shop.showinfo("순록우유", "엘론드 숲에 사는 순록의 우유", 300, 150);
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            System.out.println("1. 구매" + "\n0. 돌아가기");
                                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("순록우유를 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                                                rogue.SetGold2(150);
                                                rogue.inventory.setMilkCount2(1);
                                                rogue.Milkstop(1);
                                                rogue.inventory.itemshow();
                                                rogue.Goldshow();
                                                continue loop3;
                                            } else if (input == 0) {
                                                continue loop3;
                                            } else {
                                                while (true) {
                                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                                    input = scan.nextInt();
                                                    if (input == 1 || input == 0) {
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                continue loop;
                                            }
                                        } else if (input == 0) {
                                            continue loop;
                                        } else {
                                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                        }
                                    }
                                } else if (input == 2) {
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[†교 회†]〓〓〓〓〓〓〓〓〓〓〓");
                                    System.out.println("\n");
                                    System.out.println("†목사님: " + "\n돌아가시오! 여기는 자네가 올 곳이 아니네");
                                    System.out.println("때가 되면 하느님이 그대를 부를 것이오");
                                    System.out.println("\n");
                                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                                    continue loop;
                                } else if (input == 3) {
                                    rogue.gamble();
                                    continue loop;
                                } else if (input == 0) {
                                    continue loop;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                }
                            }
                        } else if (input == 3) {
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓[᛭인벤토리᛭]〓〓〓〓〓〓〓〓〓〓〓");
                            rogue.inventory.itemshow();
                            rogue.Goldshow();
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("사용하실 아이템을 선택해주세요");
                            System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n0. 처음으로 돌아가기");
                            input = scan.nextInt();
                            if (input == 1) {
                                rogue.UsepotionHp1(rogue.tempHp);
                                rogue.inventory.setRedpotionCount(1);
                                System.out.println("되돌아가시려면 0번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 2) {
                                rogue.UsepotionHp2(rogue.tempHp);
                                rogue.inventory.setMilkCount(1);
                                System.out.println("되돌아가시려면 0번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 0) {
                                continue loop;
                            } else {
                                while(true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if(input == 1 || input == 2 || input == 0){
                                        break;
                                    }else{
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 4) {
                            rogue.cardReinforce();
                        }else if (input == 5) {
                            System.out.println("스텟을 확인합니다");
                            rogue.stat();
                            System.out.println("되돌아가시려면 0번을 눌러주세요");
                            input = scan.nextInt();
                            if (input == 0) {
                                continue loop;
                            }else {
                                while (true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if (input == 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        }
                        else {
                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                        }
                    }
                }
            } else {
                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                continue Start;
            }
        }
    }
}