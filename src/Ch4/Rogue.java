package Ch4;

public class Rogue extends Hero {


    public Rogue() {
        Hp = 250;
        MaxHp = Hp;
        Attackpower = 25;
    }

    public void Rogueinfo () {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("왕서방파 내에서 가장 민첩하고 손재주가 좋은 도적을 고르셨습니다");
        System.out.println("도적은 HP 250, 공격력 25, 럭키세븐과 다크플레어 스킬 사용이 가능합니다");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("HP: " + Hp +  "/"  + MaxHp);
        System.out.println("공격력: " + Attackpower);
        System.out.println("보유스킬: 럭키세븐/다크플레어");
        System.out.println("- 럭키세븐(적에게 행운을 담은 3개의 표창을 연속으로 던져 적에게 데미지를 입힙니다 - 공격력x2배)");
        System.out.println("- 다크플레어(어둠의 에너지를 품은 풍차수리검을 소환하여 적에게 강한 데미지를 입힙니다 - 공격력x3배)");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("왕국 기사단장:");
        System.out.println("곤도르 왕국 기사단에 지원해주신 것을 진심으로 감사드립니다");
        System.out.println("곤도르 왕국 기사단의 명예를 걸고 반드시 승리를 쟁취합시다!");
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------");
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //전투1
    public void fight() {
        slime.Recovery();
        slime.slimeinfo();
        battle1:
        while (true) {
            if (slime.Hp <= 0) {
                break battle1;
            }
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. 기본공격" + "\n2. 스킬" + "\n3. 인벤토리" + "\n4. 도망");
            System.out.println("--------------------------------------------------------------------------------");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("슬라임에게 " + Attackpower + " 데미지를 입혔습니다");
                    System.out.println("슬라임으로부터 " + slime.Attackpower + " 데미지를 받았습니다");
                    slimeattack();
                    Ult();
                    if (slime.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("-------------------------------------WIN-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 승리하셨습니다!");
                        System.out.println("\n");
                        System.out.println("획득 경험치: " + slime.getExp(20));
                        System.out.println("획득 메소: "+ slime.getGold(50));
                        System.out.println("빛의 정령: " + slime.getSpirit(2));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("\n");
                        SetGold(slime.getGold(50));
                        SetExp(slime.getExp(20));
                        SetSpirit(slime.getSpirit(2));
                        SetHp(Hp);
                        SetExp(tempExp);
                        SetSpirit(tempSpirit);
                    } else if (this.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("------------------------------------LOSS-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..");
                        System.out.println("\n");
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("\n");
                        death();
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    continue battle1;

                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 럭키세븐(적에게 행운을 담은 3개의 표창을 연속으로 던져 적에게 데미지를 입힙니다 - 공격력x2배)" + "\n2. 다크플레어(어둠의 에너지를 품은 풍차수리검을 소환하여 적에게 강한 데미지를 입힙니다 - 공격력x3배)");
                    System.out.println("--------------------------------------------------------------------------------");
                    input = scan.nextInt();
                    if (input == 1) {
                        System.out.println("슬라임에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        System.out.println("슬라임으로부터 " + slime.Attackpower + " 데미지를 받았습니다");
                        slimeattack2();
                        Ult();
                        if (slime.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + slime.getExp(20));
                            System.out.println("획득 메소: "+ slime.getGold(50));
                            System.out.println("빛의 정령: " + slime.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(slime.getGold(50));
                            SetExp(slime.getExp(20));
                            SetSpirit(slime.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    }
                     else if (input == 2) {
                        System.out.println("슬라임에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        System.out.println("슬라임으로부터 " + slime.Attackpower + " 데미지를 받았습니다");
                        slimeattack3();
                        Ult();
                        if (slime.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + slime.getExp(20));
                            System.out.println("획득 메소: "+ slime.getGold(50));
                            System.out.println("빛의 정령: " + slime.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(slime.getGold(50));
                            SetExp(slime.getExp(20));
                            SetSpirit(slime.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;

                case 3:
                    System.out.println("사용하실 아이템을 선택해주세요");


                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {


                        UsepotionHp1(tempHp);
                    } else if (input == 2) {


                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;

                case 4:
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    break battle1;
            }
        }
    }

    //전투2
    public void fight2() {
        orc.Recovery();
        orc.orcinfo();
        battle1:
        while (true) {
            if (orc.Hp <= 0) {
                break battle1;
            }
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. 기본공격" + "\n2. 스킬" + "\n3. 인벤토리" + "\n4. 도망");
            System.out.println("--------------------------------------------------------------------------------");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("오크에게 " + Attackpower + " 데미지를 입혔습니다");
                    System.out.println("오크로부터 " + orc.Attackpower + " 데미지를 받았습니다");
                    orcattack();
                    Ult();
                    if (orc.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("-------------------------------------WIN-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 승리하셨습니다!");
                        System.out.println("\n");
                        System.out.println("획득 경험치: " + orc.getExp(30));
                        System.out.println("획득 메소: "+ orc.getGold(100));
                        System.out.println("빛의 정령: " + orc.getSpirit(2));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("\n");
                        SetGold(orc.getGold(100));
                        SetExp(orc.getExp(30));
                        SetSpirit(orc.getSpirit(2));
                        SetHp(Hp);
                        SetExp(tempExp);
                        SetSpirit(tempSpirit);
                    } else if (this.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("------------------------------------LOSS-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..");
                        System.out.println("\n");
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("\n");
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    continue battle1;

                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 럭키세븐(적에게 행운을 담은 3개의 표창을 연속으로 던져 적에게 데미지를 입힙니다 - 공격력x2배)" + "\n2. 다크플레어(어둠의 에너지를 품은 풍차수리검을 소환하여 적에게 강한 데미지를 입힙니다 - 공격력x3배)");
                    System.out.println("--------------------------------------------------------------------------------");
                    input = scan.nextInt();
                    if (input == 1) {
                        System.out.println("오크에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        System.out.println("오크로부터 " + orc.Attackpower + " 데미지를 받았습니다");
                        orcattack2();
                        Ult();
                        if (orc.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + orc.getExp(30));
                            System.out.println("획득 메소: "+ orc.getGold(100));
                            System.out.println("빛의 정령: " + orc.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(orc.getGold(100));
                            SetExp(orc.getExp(30));
                            SetSpirit(orc.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    } else if (input == 2) {
                        System.out.println("오크에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        System.out.println("오크로부터 " + orc.Attackpower + " 데미지를 받았습니다");
                        orcattack3();
                        Ult();
                        if (orc.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + orc.getExp(30));
                            System.out.println("획득 메소: "+ orc.getGold(100));
                            System.out.println("빛의 정령: " + orc.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(orc.getGold(100));
                            SetExp(orc.getExp(30));
                            SetSpirit(orc.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;

                case 3:
                    System.out.println("사용하실 아이템을 선택해주세요");


                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {


                        UsepotionHp1(tempHp);
                    } else if (input == 2) {


                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;
                case 4:
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    break battle1;
            }
        }
    }

    //전투3
    public void fight3() {
        skull.Recovery();
        skull.skullinfo();
        System.out.println("해골병사를 만났습니다");
        battle1:
        while (true) {
            if (skull.Hp <= 0) {
                break battle1;
            }
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. 기본공격" + "\n2. 스킬" + "\n3. 인벤토리" + "\n4. 도망");
            System.out.println("--------------------------------------------------------------------------------");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("해골병사에게 " + Attackpower + " 데미지를 입혔습니다");
                    System.out.println("해골병사로부터 " + skull.Attackpower + " 데미지를 받았습니다");
                    skullattack();
                    Ult();
                    if (skull.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("-------------------------------------WIN-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 승리하셨습니다!");
                        System.out.println("\n");
                        System.out.println("획득 경험치: " + skull.getExp(40));
                        System.out.println("획득 메소: "+ skull.getGold(200));
                        System.out.println("빛의 정령: " + skull.getSpirit(2));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("\n");
                        SetGold(skull.getGold(200));
                        SetExp(skull.getExp(40));
                        SetSpirit(skull.getSpirit(2));
                        SetHp(Hp);
                        SetExp(tempExp);
                        SetSpirit(tempSpirit);
                    } else if (this.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("------------------------------------LOSS-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..");
                        System.out.println("\n");
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("\n");
                        death();
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    continue battle1;

                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 럭키세븐(적에게 행운을 담은 3개의 표창을 연속으로 던져 적에게 데미지를 입힙니다 - 공격력x2배)" + "\n2. 다크플레어(어둠의 에너지를 품은 풍차수리검을 소환하여 적에게 강한 데미지를 입힙니다 - 공격력x3배)");
                    System.out.println("--------------------------------------------------------------------------------");
                    input = scan.nextInt();
                    if (input == 1) {
                        System.out.println("해골병사에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        System.out.println("해골병사로부터 " + skull.Attackpower + " 데미지를 받았습니다");
                        skullattack2();
                        Ult();
                        if (skull.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + skull.getExp(40));
                            System.out.println("획득 메소: "+ skull.getGold(200));
                            System.out.println("빛의 정령: " + skull.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(skull.getGold(200));
                            SetExp(skull.getExp(40));
                            SetSpirit(skull.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    } else if (input == 2) {
                        System.out.println("해골병사에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        System.out.println("해골병사로부터 " + skull.Attackpower + " 데미지를 받았습니다");
                        skullattack3();
                        Ult();
                        if (skull.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + skull.getExp(40));
                            System.out.println("획득 메소: "+ skull.getGold(200));
                            System.out.println("빛의 정령: " + skull.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(skull.getGold(200));
                            SetExp(skull.getExp(40));
                            SetSpirit(skull.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;

                case 3:
                    System.out.println("사용하실 아이템을 선택해주세요");


                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {


                        UsepotionHp1(tempHp);
                    } else if (input == 2) {


                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;
                case 4:
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    break battle1;
            }
        }
    }

    //전투4
    public void fight4() {
        golem.Recovery();
        golem.goleminfo();
        System.out.println("골렘을 만났습니다");
        battle1:
        while (true) {
            if (golem.Hp <= 0) {
                break battle1;
            }
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. 기본공격" + "\n2. 스킬" + "\n3. 인벤토리" + "\n4. 도망");
            System.out.println("--------------------------------------------------------------------------------");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("골렘에게 " + Attackpower + " 데미지를 입혔습니다");
                    System.out.println("골렘으로부터 " + golem.Attackpower + " 데미지를 받았습니다");
                    golemattack();
                    Ult();
                    if (golem.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("-------------------------------------WIN-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 승리하셨습니다!");
                        System.out.println("\n");
                        System.out.println("획득 경험치: " + golem.getExp(50));
                        System.out.println("획득 메소: "+ golem.getGold(300));
                        System.out.println("빛의 정령: " + golem.getSpirit(2));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("\n");
                        SetGold(golem.getGold(200));
                        SetExp(golem.getExp(40));
                        SetSpirit(golem.getSpirit(2));
                        SetHp(Hp);
                        SetExp(tempExp);
                        SetSpirit(tempSpirit);
                    } else if (this.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("------------------------------------LOSS-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..");
                        System.out.println("\n");
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("\n");
                        death();
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    continue battle1;

                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 럭키세븐(적에게 행운을 담은 3개의 표창을 연속으로 던져 적에게 데미지를 입힙니다 - 공격력x2배)" + "\n2. 다크플레어(어둠의 에너지를 품은 풍차수리검을 소환하여 적에게 강한 데미지를 입힙니다 - 공격력x3배)");
                    System.out.println("--------------------------------------------------------------------------------");
                    input = scan.nextInt();
                    if (input == 1) {
                        System.out.println("골렘에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        System.out.println("골렘으로부터 " + golem.Attackpower + " 데미지를 받았습니다");
                        golemattack2();
                        Ult();
                        if (golem.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + golem.getExp(50));
                            System.out.println("획득 메소: "+ golem.getGold(300));
                            System.out.println("빛의 정령: " + golem.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(golem.getGold(200));
                            SetExp(golem.getExp(40));
                            SetSpirit(golem.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;

                    } else if (input == 2) {
                        System.out.println("골렘에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        System.out.println("골렘으로부터 " + golem.Attackpower + " 데미지를 받았습니다");
                        golemattack3();
                        Ult();
                        if (golem.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("-------------------------------------WIN-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다!");
                            System.out.println("\n");
                            System.out.println("획득 경험치: " + golem.getExp(50));
                            System.out.println("획득 메소: "+ golem.getGold(300));
                            System.out.println("빛의 정령: " + golem.getSpirit(2));
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            SetGold(golem.getGold(200));
                            SetExp(golem.getExp(40));
                            SetSpirit(golem.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;

                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;
                case 3:
                    System.out.println("사용하실 아이템을 선택해주세요");


                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {


                        UsepotionHp1(tempHp);
                    } else if (input == 2) {


                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;
                case 4:
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    break battle1;
            }
        }
    }

    //전투5
    public void fight5() {
        balrog.balroginfo();
        battle1:
        while (true) {
            if (balrog.Hp <= 0) {
                break battle1;
            }
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. 기본공격" + "\n2. 스킬" + "\n3. 인벤토리" + "\n4. 도망");
            System.out.println("--------------------------------------------------------------------------------");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("발록에게 " + Attackpower + " 데미지를 입혔습니다");
                    System.out.println("발록으로부터 " + balrog.Attackpower + " 데미지를 받았습니다");
                    balrogattack();
                    Ult();
                    if (balrog.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("마계왕 발록을 무찌르고 공주님을 구출하였습니다");
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("\n");
                        System.out.println("THE END");
                        System.out.println("이용해주셔서 감사합니다 :)");
                        System.out.println("\n");
                        System.out.println("--------------------------------------------------------------------------------");
                    } else if (this.Hp <= 0) {
                        System.out.println("\n");
                        System.out.println("------------------------------------LOSS-------------------------------------");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..");
                        System.out.println("\n");
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("\n");
                        death();
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    continue battle1;

                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1. 럭키세븐(적에게 행운을 담은 3개의 표창을 연속으로 던져 적에게 데미지를 입힙니다 - 공격력x2배)" + "\n2. 다크플레어(어둠의 에너지를 품은 풍차수리검을 소환하여 적에게 강한 데미지를 입힙니다 - 공격력x3배)");
                    System.out.println("--------------------------------------------------------------------------------");
                    input = scan.nextInt();
                    if (input == 1) {
                        System.out.println("발록에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        System.out.println("발록으로부터 " + balrog.Attackpower + " 데미지를 받았습니다");
                        balrogattack2();
                        Ult();
                        if (balrog.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("마계왕 발록을 무찌르고 공주님을 구출하였습니다");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            System.out.println("THE END");
                            System.out.println("이용해주셔서 감사합니다 :)");
                            System.out.println("\n");
                            System.out.println("--------------------------------------------------------------------------------");
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    } else if (input == 2) {
                        System.out.println("발록에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        System.out.println("발록으로부터 " + balrog.Attackpower + " 데미지를 받았습니다");
                        balrogattack3();
                        Ult();
                        if (balrog.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("마계왕 발록을 무찌르고 공주님을 구출하였습니다");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("\n");
                            System.out.println("THE END");
                            System.out.println("이용해주셔서 감사합니다 :)");
                            System.out.println("\n");
                            System.out.println("--------------------------------------------------------------------------------");
                        } else if (this.Hp <= 0) {
                            System.out.println("\n");
                            System.out.println("------------------------------------LOSS-------------------------------------");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..");
                            System.out.println("\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("\n");
                            death();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("부활과 동시에 HP가 10 회복되었습니다");
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        continue battle1;
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;
                case 3:
                    System.out.println("사용하실 아이템을 선택해주세요");


                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {


                        UsepotionHp1(tempHp);
                    } else if (input == 2) {


                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;
                case 4:
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    break battle1;
            }
        }
    }
}