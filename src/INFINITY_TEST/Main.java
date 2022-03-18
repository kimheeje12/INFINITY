package INFINITY_TEST;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int input = 0;

        Shop shop = new Shop();
        Hero hero = new Hero();
        Warrior warrior = new Warrior();
        Archer archer = new Archer();
        Rogue rogue = new Rogue();
        Monster slime = new Monster();
        Monster orc = new Monster();
        Monster skeleton = new Monster();
        Monster golem = new Monster();
        Monster balrog = new Monster();

        String myname;
        Scanner scan = new Scanner(System.in);

        Inventory inventory = new Inventory(3);

        //Hero의 시작 - GONDOR
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("GONDOR");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("아주 오래된 옛날, 평화롭던 곤도르에 통제할 수 없는 어두운 기운과 함께 마계왕 발록이 출현합니다");
        System.out.println("곤도르의 왕 데네소르는 백성을 모두 살리기 위한 대가로 사랑하는 공주를 마계왕 발록에게 내어주게 되고..");
        System.out.println("이후 데네소르 왕은 재정비를 마치고 발록을 무찌르고 딸을 구하기 위해 왕국 기사단 모집벽보를 전국 각지에 붙이게 되는데... ");
        System.out.println("\n사용하실 이름을 입력해주세요");
        myname = scan.next();
        System.out.println("\n");
        System.out.println(myname + "님" + " 곤도르 왕국 기사단에 지원하실 직업을 고르세요");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("1. 전사(HP 500, 공격력 15)" + "\n2. 궁수(HP 350, 공격력 20)" + "\n3. 도적(HP 250, 공격력 25)");
        System.out.println("--------------------------------------------------------------------------------");

//////////////////////////////////////////////////////////////////////////////////////////전사
        Start:
        while (true) {
            input = scan.nextInt();
            if (input == 1) {
                System.out.println("안녕하세요! " + myname + "님");
                warrior.Warriorinfo();
                loop:
                while (true) {
                    System.out.println("\n");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 던전으로 이동" + "\n2. 마을로 이동" + "\n3. 인벤토리" + "\n4. 스텟확인" + "\n5. 게임종료");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("\n");
                    while (true) {
                        input = scan.nextInt();
                        if (input == 1) {
                            dungeon:
                            while (true) {
                                System.out.println("\n");
                                System.out.println("------------------------------------[던 전]-------------------------------------");
                                System.out.println(myname + "님" + " 전투하실 몬스터를 골라주세요");
                                System.out.println("1. 슬라임(lv.1이상)" + "\n2. 오크(lv.5이상)" + "\n3. 해골병사(lv.10이상)" + "\n4. 골렘(lv.15이상)" + "\n5. 발록(lv.20이상)" + "\n6. 처음으로 돌아가기");
                                System.out.println("----------------------------------------------------------------------------------");
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
                                            continue loop;
                                        }
                                    } else if (input == 4) {
                                        if (true) {
                                            warrior.fight4();
                                            continue loop;
                                        }
                                    } else if (input == 5) {
                                        if (true) {
                                            warrior.fight5();
                                            continue loop;
                                        }
                                    } else if (input == 6) {
                                        continue loop;
                                    } else {
                                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    }
                                }
                            }
                        } else if (input == 2) {
                            System.out.println("------------------------------------[마 을]-------------------------------------");
                            System.out.println(myname + "님" + " 입장하실 장소를 골라주세요");
                            System.out.println("1. 상점" + "\n2. 교회" + "\n3. 처음으로 돌아가기");
                            System.out.println("----------------------------------------------------------------------------------");
                            input = scan.nextInt();
                            loop3:
                            while (true) {
                                if (input == 1) {
                                    System.out.println("------------------------------------[상 점]-------------------------------------");
                                    System.out.println(myname + "님" + " 구매하실 아이템을 골라주세요");
                                    System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n3. 처음으로 돌아가기");
                                    System.out.println("----------------------------------------------------------------------------------");
                                    input = scan.nextInt();
                                    while (true) {
                                        if (input == 1) {
                                            Shop.showinfo("빨간물약", "김박사가 개발한 피로회복제", 100, 50);
                                            System.out.println("--------------------------------------------------------------------------------");
                                            System.out.println("1. 구매" + "\n2. 돌아가기");
                                            System.out.println("--------------------------------------------------------------------------------");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("빨간물약을 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                                                continue loop3;
                                            } else if (input == 2) {
                                                continue loop3;
                                            } else {
                                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                            }
                                        }
                                        if (input == 2) {
                                            Shop.showinfo("순록우유", "엘론드 숲에 사는 순록의 우유", 300, 150);
                                            System.out.println("--------------------------------------------------------------------------------");
                                            System.out.println("1. 구매" + "\n2. 돌아가기");
                                            System.out.println("--------------------------------------------------------------------------------");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("순록우유를 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                                                continue loop3;
                                            } else if (input == 2) {
                                                continue loop3;
                                            } else {
                                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                            }
                                        } else if (input == 3) {
                                            continue loop;
                                        } else {
                                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                        }
                                    return;
                                    }
                                } else if (input == 2) {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("\n");
                                    System.out.println("목사님: " + "\n돌아가시오! 여기는 자네가 올 곳이 아니네");
                                    System.out.println("때가 되면 하느님이 그대를 부를 것이오");
                                    System.out.println("\n");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    continue loop;
                                } else if (input == 3) {
                                    continue loop;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                }
                            }
                        } else if (input == 3) {
                            System.out.println("-----------------------------------[인벤토리]-----------------------------------");

                           inventory.itemshow11();



                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("사용하실 아이템을 선택해주세요");
                            System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n3. 처음으로 돌아가기");
                            input = scan.nextInt();
                            if (input == 1) {

                                warrior.UsepotionHp1(warrior.tempHp);
                                System.out.println("되돌아가시려면 1번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 2) {

                                warrior.UsepotionHp2(warrior.tempHp);
                                System.out.println("되돌아가시려면 1번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 3) {
                                continue loop;
                            } else {
                                while(true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if(input == 1 || input == 2 || input == 3){
                                        break;
                                    }else{
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 4) {
                            System.out.println("스텟을 확인합니다");
                            warrior.stat();
                            System.out.println("되돌아가시려면 1번을 눌러주세요");
                            input = scan.nextInt();
                            if (input == 1) {
                                continue loop;
                            }else {
                                while (true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if (input == 1) {
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 5) {
                            System.out.println("게임을 종료합니다");
                            System.out.println("이용해주셔서 감사합니다 :)");
                            System.exit(0);
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
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 던전으로 이동" + "\n2. 마을로 이동" + "\n3. 인벤토리" + "\n4. 스텟확인" + "\n5. 게임종료");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (true) {
                        input = scan.nextInt();
                        if (input == 1) {
                            dungeon:
                            while (true) {
                                System.out.println("------------------------------------[던 전]-------------------------------------");
                                System.out.println(myname + "님" + " 전투하실 몬스터를 골라주세요");
                                System.out.println("1. 슬라임(lv.1이상)" + "\n2. 오크(lv.5이상)" + "\n3. 해골병사(lv.10이상)" + "\n4. 골렘(lv.15이상)" + "\n5. 발록(lv.20이상)" + "\n6. 처음으로 돌아가기");
                                System.out.println("----------------------------------------------------------------------------------");
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
                                            continue loop;
                                        }
                                    } else if (input == 4) {
                                        if (true) {
                                            archer.fight4();
                                            continue loop;
                                        }
                                    } else if (input == 5) {
                                        if (true) {
                                            archer.fight5();
                                            continue loop;
                                        }
                                    } else if (input == 6) {
                                        continue loop;
                                    } else {
                                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    }
                                }
                            }
                        } else if (input == 2) {
                            System.out.println("------------------------------------[마 을]-------------------------------------");
                            System.out.println(myname + "님" + " 입장하실 장소를 골라주세요");
                            System.out.println("1. 상점" + "\n2. 교회" + "\n3. 처음으로 돌아가기");
                            System.out.println("----------------------------------------------------------------------------------");
                            input = scan.nextInt();
                            loop3:
                            while (true) {
                                if (input == 1) {
                                    System.out.println("------------------------------------[상 점]-------------------------------------");
                                    System.out.println(myname + "님" + " 구매하실 아이템을 골라주세요");
                                    System.out.println("1. 빨간물약(HP +100회복, 50메소)" + "\n2. 순록우유(HP +300회복, 150메소)" + "\n3. 처음으로 돌아가기");
                                    System.out.println("----------------------------------------------------------------------------------");
                                    input = scan.nextInt();
                                    while (true) {
                                        if (input == 1) {
                                            Shop.showinfo("빨간물약", "김박사가 개발한 피로회복제", 100, 50);
                                            System.out.println("--------------------------------------------------------------------------------");
                                            System.out.println("1. 구매" + "\n2. 돌아가기");
                                            System.out.println("--------------------------------------------------------------------------------");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("빨간물약을 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                                                continue loop3;
                                            } else if (input == 2) {
                                                continue loop3;
                                            } else {
                                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                            }
                                        }
                                        if (input == 2) {
                                            Shop.showinfo("순록우유", "엘론드 숲에 사는 순록의 우유", 300, 150);
                                            System.out.println("--------------------------------------------------------------------------------");
                                            System.out.println("1. 구매" + "\n2. 돌아가기");
                                            System.out.println("--------------------------------------------------------------------------------");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("순록우유를 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                                                continue loop3;
                                            } else if (input == 2) {
                                                continue loop3;
                                            } else {
                                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                            }
                                        } else if (input == 3) {
                                            continue loop;
                                        } else {
                                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                        }
                                    }
                                } else if (input == 2) {
                                    System.out.println("\n");
                                    System.out.println("목사님: " + "\n돌아가시오! 여기는 자네가 올 곳이 아니네");
                                    System.out.println("때가 되면 하느님이 그대를 부를 것이오");
                                    System.out.println("\n");
                                    continue loop;
                                } else if (input == 3) {
                                    continue loop;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                }
                            }
                        } else if (input == 3) {
                            System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("사용하실 아이템을 선택해주세요");
                            System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n3. 처음으로 돌아가기");
                            input = scan.nextInt();
                            if (input == 1) {
                                archer.UsepotionHp1(archer.tempHp);

                                System.out.println("되돌아가시려면 1번을 눌러주세요");
                            } else if (input == 2) {
                                archer.UsepotionHp2(archer.tempHp);

                                System.out.println("되돌아가시려면 1번을 눌러주세요");
                            } else if (input == 3) {
                                continue loop;
                            } else {
                                while(true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if(input == 1 || input == 2 || input == 3){
                                        break;
                                    }else{
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 4) {
                            System.out.println("스텟을 확인합니다");
                            archer.stat();
                            System.out.println("되돌아가시려면 1번을 눌러주세요");
                            input = scan.nextInt();
                            if (input == 1) {
                                continue loop;
                            }else {
                                while (true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if (input == 1) {
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 5) {
                            System.out.println("게임을 종료합니다");
                            System.out.println("이용해주셔서 감사합니다 :)");
                            System.exit(0);
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
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 던전으로 이동" + "\n2. 마을로 이동" + "\n3. 인벤토리" + "\n4. 스텟확인" + "\n5. 게임종료");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (true) {
                        input = scan.nextInt();
                        if (input == 1) {
                            dungeon:
                            while (true) {
                                System.out.println("------------------------------------[던 전]-------------------------------------");
                                System.out.println(myname + "님" + " 전투하실 몬스터를 골라주세요");
                                System.out.println("1. 슬라임(lv.1이상)" + "\n2. 오크(lv.5이상)" + "\n3. 해골병사(lv.10이상)" + "\n4. 골렘(lv.15이상)" + "\n5. 발록(lv.20이상)" + "\n6. 처음으로 돌아가기");
                                System.out.println("----------------------------------------------------------------------------------");
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
                                            continue loop;
                                        }
                                    } else if (input == 4) {
                                        if (true) {
                                            rogue.fight4();
                                            continue loop;
                                        }
                                    } else if (input == 5) {
                                        if (true) {
                                            rogue.fight5();
                                            continue loop;
                                        }
                                    } else if (input == 6) {
                                        continue loop;
                                    } else {
                                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    }
                                }
                            }
                        } else if (input == 2) {
                            System.out.println("------------------------------------[마 을]-------------------------------------");
                            System.out.println(myname + "님" + " 입장하실 장소를 골라주세요");
                            System.out.println("1. 상점" + "\n2. 교회" + "\n3. 처음으로 돌아가기");
                            System.out.println("----------------------------------------------------------------------------------");
                            input = scan.nextInt();
                            loop3:
                            while (true) {
                                if (input == 1) {
                                    System.out.println("------------------------------------[상 점]-------------------------------------");
                                    System.out.println(myname + "님" + " 구매하실 아이템을 골라주세요");
                                    System.out.println("1. 빨간물약(HP +100회복, 50메소)" + "\n2. 순록우유(HP +300회복, 150메소)" + "\n3. 처음으로 돌아가기");
                                    System.out.println("----------------------------------------------------------------------------------");
                                    input = scan.nextInt();
                                    while (true) {
                                        if (input == 1) {
                                            Shop.showinfo("빨간물약", "김박사가 개발한 피로회복제", 100, 50);
                                            System.out.println("--------------------------------------------------------------------------------");
                                            System.out.println("1. 구매" + "\n2. 돌아가기");
                                            System.out.println("--------------------------------------------------------------------------------");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("빨간물약을 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                                                continue loop3;
                                            } else if (input == 2) {
                                                continue loop3;
                                            } else {
                                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                            }
                                        }
                                        if (input == 2) {
                                            Shop.showinfo("순록우유", "엘론드 숲에 사는 순록의 우유", 300, 150);
                                            System.out.println("--------------------------------------------------------------------------------");
                                            System.out.println("1. 구매" + "\n2. 돌아가기");
                                            System.out.println("--------------------------------------------------------------------------------");
                                            input = scan.nextInt();
                                            if (input == 1) {
                                                System.out.println("순록우유를 구매하였습니다");
                                                System.out.println("\n");
                                                System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                                                continue loop3;
                                            } else if (input == 2) {
                                                continue loop3;
                                            } else {
                                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                            }
                                        } else if (input == 3) {
                                            continue loop;
                                        } else {
                                            System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                        }
                                    }
                                } else if (input == 2) {
                                    System.out.println("\n");
                                    System.out.println("목사님: " + "\n돌아가시오! 여기는 자네가 올 곳이 아니네");
                                    System.out.println("때가 되면 하느님이 그대를 부를 것이오");
                                    System.out.println("\n");
                                    continue loop;
                                } else if (input == 3) {
                                    continue loop;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                }
                            }
                        } else if (input == 3) {
                            System.out.println("-----------------------------------[인벤토리]-----------------------------------");


                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("사용하실 아이템을 선택해주세요");
                            System.out.println("1. 빨간물약" + "\n2. 순록우유" + "\n3. 처음으로 돌아가기");
                            input = scan.nextInt();
                            if (input == 1) {
                                rogue.UsepotionHp1(rogue.tempHp);

                                System.out.println("되돌아가시려면 1번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 2) {
                                rogue.UsepotionHp2(rogue.tempHp);

                                System.out.println("되돌아가시려면 1번을 눌러주세요");
                                input = scan.nextInt();
                                continue loop;
                            } else if (input == 3) {
                                continue loop;
                            } else {
                                while(true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if(input == 1 || input == 2 || input == 3){
                                        break;
                                    }else{
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 4) {
                            System.out.println("스텟을 확인합니다");
                            rogue.stat();
                            System.out.println("되돌아가시려면 1번을 눌러주세요");
                            input = scan.nextInt();
                            if (input == 1) {
                                continue loop;
                            }else {
                                while (true) {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    input = scan.nextInt();
                                    if (input == 1) {
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue loop;
                            }
                        } else if (input == 5) {
                            System.out.println("게임을 종료합니다");
                            System.out.println("이용해주셔서 감사합니다 :)");
                            System.exit(0);
                        } else {
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