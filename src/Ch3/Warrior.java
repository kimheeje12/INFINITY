package Ch3;

import Ch3.BGM.*;
import Ch3.Thread.*;
import Ch3.Main;
import Ch3.Inventory;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;

public class Warrior extends Hero {

    int count = 0;
    boolean bool = true;

    public Warrior() {
        super("Warrior", 500, 500,15);
        MaxHp = Hp;
    }

    public void Warriorinfo() {
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        System.out.println("⚔천하제일 체력왕 전사를 고르셨습니다⚔");
        System.out.println("전사는 HP 500, 공격력 15, 육중한 일격과 동귀어진 스킬 사용이 가능합니다");
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        System.out.println("▶ HP: " + Hp + "/" + MaxHp);
        System.out.println("▶ 공격력: " + Attackpower);
        System.out.println("▶ 보유스킬: 육중한 일격/동귀어진");
        System.out.println("▷ 육중한 일격(검을 강하게 쥐고 적에게 일격을 가합니다 - 공격력x2배)");
        System.out.println("▷ 동귀어진(만물의 기를 검에 모은 강한 파괴력으로 적을 내려칩니다 - 공격력x3배)");
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        System.out.println("\n");
        System.out.println("§왕국 기사단장§");
        System.out.println("곤도르 왕국 기사단에 지원해주신 것을 진심으로 감사드립니다");
        System.out.println("곤도르 왕국 기사단의 명예를 걸고 반드시 승리를 쟁취합시다!");
        System.out.println("\n");
        System.out.println("           §");
        System.out.println("         §§§");
        System.out.println("     §§§§§§§");
        System.out.println("         §§§");
        System.out.println("           §");
        System.out.println("\n");
        System.out.println("◈ 곤도르의 빛(공격력 10)을 얻었습니다!");
        System.out.println("(던전에서 몬스터와 전투 시 자동적용됩니다)");
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    }

    Monsterattack monsterattack = new Monsterattack();
    Monsterattack2 monsterattack2 = new Monsterattack2();
    Monsterattack3 monsterattack3 = new Monsterattack3();

    ///////////////////////////////////////////////////////////////////////////////////////몬스터 BATTLE
    //전투1
    public void fight() {
        slime.Recovery();
        slime.slimeinfo();
        battle1:
        while (true) {
            count++;
            if (slime.Hp <= 0) {
                break battle1;
            }
            if(pet.isAlive()){
                pet.interrupt();
            }
            Pet pet= new Pet();
            pet.start();
            if(monsterattack.isAlive()){
                monsterattack.interrupt();
            }
            Monsterattack monsterattack = new Monsterattack();
            monsterattack.start();
            ReadyUlt();
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            System.out.println("1. ⚔기본공격" + "\n2. ⚔스킬" + "\n3. ᛭인벤토리" + "\n4. §궁극기(빛의 초식)" + "\n0. ⚑도망");
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("⚔ 슬라임에게 " + Attackpower + " 데미지를 입혔습니다");
                    slimeattack();
                    if (slime.Hp <= 0) {
                        monsterattack.Stop2(true);
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        System.out.println("전투에 승리하셨습니다♪");
                        System.out.println("\n");
                        System.out.println("▶ 획득 경험치: " + slime.getExp(20));
                        System.out.println("▶ 획득 메소: " + slime.getGold(50));
                        System.out.println("▶ 빛의 정령: " + slime.getSpirit(2));
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        SetGold(slime.getGold(50));
                        SetExp(slime.getExp(20));
                        SetSpirit(slime.getSpirit(2));
                        SetHp(Hp);
                        SetExp(tempExp);
                        SetSpirit(tempSpirit);
                    } else if (this.Hp <= 0) {
                        pet.Stop2(true);
                        monsterattack.Stop2(true);
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..死");
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        death();
                        if (t2.isAlive()) {
                            t2.interrupt();
                        }
                        BGM2 t2 = new BGM2(".mp3", false);
                        t2.start();
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                t2.close();
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    monsterattack.Stop2(true);
                    pet.Stop2(true);
                    continue battle1;

                case 2:
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. 육중한 일격(검을 강하게 쥐고 적에게 일격을 가합니다 - 공격력x2배)" + "\n2. 동귀어진(만물의 기를 검에 모은 강한 파괴력으로 적을 내려칩니다 - 공격력x3배)");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    input = scan.nextInt();
                    if (input == 1 && count >= 3) {
                        count=0;
                        if (t6.isAlive()) {
                            t6.interrupt();
                        }
                        BGM6 t6 = new BGM6(".mp3", false);
                        t6.start();
                        s6.run();
                        s6.run2();
                        System.out.println("☞ 팔뚝에 모인 강한 힘을 칼날에 모아 적을 찍어누릅니다");
                        System.out.println("\n");
                        System.out.println("⚔ 슬라임에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        slimeattack2();
                        if (slime.Hp <= 0) {
                            monsterattack.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다♪");
                            System.out.println("\n");
                            System.out.println("▶ 획득 경험치: " + slime.getExp(20));
                            System.out.println("▶ 획득 메소: " + slime.getGold(50));
                            System.out.println("▶ 빛의 정령: " + slime.getSpirit(2));
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            SetGold(slime.getGold(50));
                            SetExp(slime.getExp(20));
                            SetSpirit(slime.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            pet.Stop2(true);
                            monsterattack.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..死");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            death();
                            if (t2.isAlive()) {
                                t2.interrupt();
                            }
                            BGM2 t2 = new BGM2(".mp3", false);
                            t2.start();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                    t2.close();
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        monsterattack.Stop2(true);
                        pet.Stop2(true);
                        continue battle1;
                    }else if (input == 2 && count >= 3) {
                        count = 0;
                        if (t4.isAlive()) {
                            t4.interrupt();
                        }
                        BGM4 t4 = new BGM4(".mp3", false);
                        t4.start();
                        s1.run();
                        s1.run2();
                        s1.run3();
                        System.out.println("☞ 검 끝에 모인 붉은 빛 에너지가 몬스터에게 날아갑니다");
                        System.out.println("\n");
                        System.out.println("⚔ 슬라임에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        slimeattack3();
                        if (slime.Hp <= 0) {
                            monsterattack.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다♪");
                            System.out.println("\n");
                            System.out.println("▶ 획득 경험치: " + slime.getExp(20));
                            System.out.println("▶ 획득 메소: " + slime.getGold(50));
                            System.out.println("▶ 빛의 정령: " + slime.getSpirit(2));
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            SetGold(slime.getGold(50));
                            SetExp(slime.getExp(20));
                            SetSpirit(slime.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            pet.Stop2(true);
                            monsterattack.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..死");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            death();
                            if (t2.isAlive()) {
                                t2.interrupt();
                            }
                            BGM2 t2 = new BGM2(".mp3", false);
                            t2.start();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                    t2.close();
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        monsterattack.Stop2(true);
                        pet.Stop2(true);
                        continue battle1;
                    } else {
                        System.out.println("\n");
                        System.out.println("⊙ 쿨타임으로 인해 스킬 사용이 제한됩니다(3부터 사용가능)");
                        System.out.println("⊙ Skill 게이지: " + count);
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    monsterattack.Stop2(true);
                    pet.Stop2(true);
                    System.out.println("사용하실 아이템을 선택해주세요");
                    inventory.itemshow();
                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {
                        inventory.setRedpotionCount(1);
                        inventory.itemshow();
                        UsepotionHp1(tempHp);
                    } else if (input == 2) {
                        inventory.setMilkCount(1);
                        inventory.itemshow();
                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;

                case 4:
                    monsterattack.Stop2(true);
                    pet.Stop2(true);
                    Ult();
                    continue battle1;

                case 0:
                    monsterattack.Stop2(true);
                    pet.Stop2(true);
                    System.out.println("                                 ■■■");
                    System.out.println("                              ■■■■■");
                    System.out.println("                                 ■■■");
                    System.out.println("                          ■■■■■■■■■■");
                    System.out.println("           ■■■■■    ■■■                  ■");
                    System.out.println("                                 ■■■                      ■");
                    System.out.println("                                 ■■■");
                    System.out.println("                             ■■■■■");
                    System.out.println("                         ■■        ■■");
                    System.out.println("                     ■■            ■■■■■■■");
                    System.out.println("                 ■■");
                    System.out.println("             ■■");
                    System.out.println("\n");
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    monsterattack.Stop2(true);
                    pet.Stop2(true);
                    break battle1;
            }
            monsterattack.Stop2(true);
            pet.Stop2(true);
        }
        monsterattack.Stop2(true);
        pet.Stop2(true);
    }

    //전투2
    public void fight2() {
        golem.Recovery();
        golem.goleminfo();
        battle1:
        while (true) {
            count++;
            if (golem.Hp <= 0) {
                break battle1;
            }
            if(pet2.isAlive()){
                pet2.interrupt();
            }
            Pet2 pet2= new Pet2();
            pet2.start();
            if(monsterattack2.isAlive()){
                monsterattack2.interrupt();
            }
            Monsterattack2 monsterattack2 = new Monsterattack2();
            monsterattack2.start();
            ReadyUlt();
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            System.out.println("1. ⚔기본공격" + "\n2. ⚔스킬" + "\n3. ᛭인벤토리" + "\n4. §궁극기(빛의 초식)" + "\n0. ⚑도망");
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("⚔ 골렘에게 " + Attackpower + " 데미지를 입혔습니다");
                    golemattack();
                    if (golem.Hp <= 0) {
                        monsterattack2.Stop2(true);
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        System.out.println("전투에 승리하셨습니다♪");
                        System.out.println("\n");
                        System.out.println("▶ 획득 경험치: " + golem.getExp(50));
                        System.out.println("▶ 획득 메소: " + golem.getGold(300));
                        System.out.println("▶ 빛의 정령: " + golem.getSpirit(2));
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        SetGold(golem.getGold(200));
                        SetExp(golem.getExp(40));
                        SetSpirit(golem.getSpirit(2));
                        SetHp(Hp);
                        SetExp(tempExp);
                        SetSpirit(tempSpirit);
                    } else if (this.Hp <= 0) {
                        monsterattack2.Stop2(true);
                        pet2.Stop2(true);
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..死");
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        death();
                        if (t2.isAlive()) {
                            t2.interrupt();
                        }
                        BGM2 t2 = new BGM2(".mp3", false);
                        t2.start();
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                t2.close();
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    monsterattack2.Stop2(true);
                    pet2.Stop2(true);
                    continue battle1;

                case 2:
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. 육중한 일격(검을 강하게 쥐고 적에게 일격을 가합니다 - 공격력x2배)" + "\n2. 동귀어진(만물의 기를 검에 모은 강한 파괴력으로 적을 내려칩니다 - 공격력x3배)");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    input = scan.nextInt();
                    if (input == 1 && count >= 3) {
                        count = 0;
                        if (t6.isAlive()) {
                            t6.interrupt();
                        }
                        BGM6 t6 = new BGM6(".mp3", false);
                        t6.start();
                        s6.run();
                        s6.run2();
                        System.out.println("☞ 팔뚝에 모인 강한 힘을 칼날에 모아 적을 찍어누릅니다");
                        System.out.println("\n");
                        System.out.println("⚔ 골렘에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        golemattack2();
                        if (golem.Hp <= 0) {
                            monsterattack2.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다♪");
                            System.out.println("\n");
                            System.out.println("▶ 획득 경험치: " + golem.getExp(50));
                            System.out.println("▶ 획득 메소: " + golem.getGold(300));
                            System.out.println("▶ 빛의 정령: " + golem.getSpirit(2));
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            SetGold(golem.getGold(200));
                            SetExp(golem.getExp(40));
                            SetSpirit(golem.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            monsterattack2.Stop2(true);
                            pet2.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..死");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            death();
                            if (t2.isAlive()) {
                                t2.interrupt();
                            }
                            BGM2 t2 = new BGM2(".mp3", false);
                            t2.start();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                    t2.close();
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        monsterattack2.Stop2(true);
                        pet2.Stop2(true);
                        continue battle1;
                    } else if (input == 2 && count >= 3) {
                        count = 0;
                        if (t4.isAlive()) {
                            t4.interrupt();
                        }
                        BGM4 t4 = new BGM4(".mp3", false);
                        t4.start();
                        s1.run();
                        s1.run2();
                        s1.run3();
                        System.out.println("☞ 검 끝에 모인 붉은 빛 에너지가 몬스터에게 날아갑니다");
                        System.out.println("\n");
                        System.out.println("⚔ 골렘에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        golemattack3();
                        if (golem.Hp <= 0) {
                            monsterattack2.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 승리하셨습니다♪");
                            System.out.println("\n");
                            System.out.println("▶ 획득 경험치: " + golem.getExp(50));
                            System.out.println("▶ 획득 메소: " + golem.getGold(300));
                            System.out.println("▶ 빛의 정령: " + golem.getSpirit(2));
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            SetGold(golem.getGold(200));
                            SetExp(golem.getExp(40));
                            SetSpirit(golem.getSpirit(2));
                            SetHp(Hp);
                            SetExp(tempExp);
                            SetSpirit(tempSpirit);
                        } else if (this.Hp <= 0) {
                            monsterattack2.Stop2(true);
                            pet2.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..死");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            death();
                            if (t2.isAlive()) {
                                t2.interrupt();
                            }
                            BGM2 t2 = new BGM2(".mp3", false);
                            t2.start();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                    t2.close();
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        monsterattack2.Stop2(true);
                        pet2.Stop2(true);
                        continue battle1;
                    } else {
                        System.out.println("\n");
                        System.out.println("⊙ 쿨타임으로 인해 스킬 사용이 제한됩니다(3부터 사용가능)");
                        System.out.println("⊙ Skill 게이지: " + count);
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    monsterattack2.Stop2(true);
                    pet2.Stop2(true);
                    System.out.println("사용하실 아이템을 선택해주세요");
                    inventory.itemshow();
                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {
                        inventory.setRedpotionCount(1);
                        inventory.itemshow();
                        UsepotionHp1(tempHp);
                    } else if (input == 2) {
                        inventory.setMilkCount(1);
                        inventory.itemshow();
                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;

                case 4:
                    monsterattack2.Stop2(true);
                    pet2.Stop2(true);
                    Ult2();
                    continue battle1;

                case 0:
                    monsterattack2.Stop2(true);
                    pet2.Stop2(true);
                    System.out.println("                                 ■■■");
                    System.out.println("                              ■■■■■");
                    System.out.println("                                 ■■■");
                    System.out.println("                          ■■■■■■■■■■");
                    System.out.println("           ■■■■■    ■■■                  ■");
                    System.out.println("                                 ■■■                      ■");
                    System.out.println("                                 ■■■");
                    System.out.println("                             ■■■■■");
                    System.out.println("                         ■■        ■■");
                    System.out.println("                     ■■            ■■■■■■■");
                    System.out.println("                 ■■");
                    System.out.println("             ■■");
                    System.out.println("\n");
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    monsterattack2.Stop2(true);
                    pet2.Stop2(true);
                    break battle1;
            }
            monsterattack2.Stop2(true);
            pet2.Stop2(true);
        }
        monsterattack2.Stop2(true);
        pet2.Stop2(true);
    }

    //전투3
    public void fight3() {
        if (t3.isAlive()) {
            t3.interrupt();
        }
        BGM3 t3 = new BGM3(".mp3", false);
        t3.start();
        balrog.balroginfo();
        battle1:
        while (true) {
            count++;
            if (balrog.Hp <= 0) {
                break battle1;
            }
            if(pet3.isAlive()){
                pet3.interrupt();
            }
            Pet3 pet3= new Pet3();
            pet3.start();
            if(monsterattack3.isAlive()){
                monsterattack3.interrupt();
            }
            Monsterattack3 monsterattack3 = new Monsterattack3();
            monsterattack3.start();
            ReadyUlt();
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            System.out.println("1. ⚔기본공격" + "\n2. ⚔스킬" + "\n3. ᛭인벤토리" + "\n4. §궁극기(빛의 초식)" + "\n0. ⚑도망");
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            input = scan.nextInt();
            if(input == 911){
                TheEnd();
                System.out.println("■■□□■■□■■■■■■□□□□□□□□■■■■■■□■■■■■■□■■■■■■□■■■■■■");
                System.out.println("■■□□■■□■■□□□■■□□□□□□□□□□□■■□■■□□■■□■■□□■■□■■□□■■");
                System.out.println("■■□□■■□■■□□□■■□□□■□□□□□□□■■□■■□□■■□■■□□■■□■■□□■■");
                System.out.println("■■■■■■□■■□□□■■□□□■□□□■■■■■■□■■□□■■□■■□□■■□■■□□■■");
                System.out.println("■■■■■■□■■■■■■□□■■■■■□■■■■■■□■■□□■■□■■□□■■□■■□□■■");
                System.out.println("■■□□■■□■■□□□□□□□□■□□□□□□□■■□■■□□■■□■■□□■■□■■□□■■");
                System.out.println("■■□□■■□■■□□□□□□□□■□□□□□□□■■□■■□□■■□■■□□■■□■■□□■■");
                System.out.println("■■□□■■□■■□□□□□□□□□□□□■■■■■■□■■■■■■□■■■■■■□■■■■■■");
                System.out.println("\n");
                System.out.println("□□□■■□□□□■■■■■■□□□□□□□□■■■■■■□■■■■■■□■■■■■■");
                System.out.println("□□■■■■□□□■■□□□■■□□□□□□□■■□□□□□■■□□■■□■■□□■■");
                System.out.println("□■■□□■■□□■■□□□■■□□□■□□□■■□□□□□■■□□■■□■■□□■■");
                System.out.println("■■□□□□■■□■■□□□■■□□□■□□□■■□□□□□■■□□■■□■■□□■■");
                System.out.println("■■■■■■■■□■■■■■■□□■■■■■□■■■■■■□■■□□■■□■■□□■■");
                System.out.println("■■□□□□■■□■■□□□□□□□□■□□□□□□□■■□■■□□■■□■■□□■■");
                System.out.println("■■□□□□■■□■■□□□□□□□□■□□□□□□□■■□■■□□■■□■■□□■■");
                System.out.println("■■□□□□■■□■■□□□□□□□□□□□□■■■■■■□■■■■■■□■■■■■■");
            }
            switch (input) {
                case 1:
                    System.out.println("⚔ 마계왕 발록에게 " + Attackpower + " 데미지를 입혔습니다");
                    balrogattack();
                    if (balrog.Hp <= 0) {
                        if (t7.isAlive()) {
                            t7.interrupt();
                        }
                        BGM7 t7 = new BGM7(".mp3", false);
                        t7.start();
                        monsterattack3.Stop2(true);
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("☠마계왕 발록☠");
                        System.out.println("애송이들..어설픈 실력으로 나를 다시 봉인하려 하다니...");
                        System.out.println("\n");
                        System.out.println("크...윽 생각보다 강하구나! 나를 물리쳤다고 생각하지마라");
                        System.out.println("\n");
                        System.out.println("이것은 봉인된 힘..언젠가 진짜 힘이 돌아오면 다시 세상을 지배할 것이다");
                        System.out.println("\n");
                        System.out.println("☞ 마계왕 발록을 봉인하고 공주님을 구출하였습니다♬");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("■■■■■■■■■■■□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□□■■■□■■■■■■■■□□");
                        System.out.println("■■■■■■■■■■■□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■■□□□□■■■□■■■■■■■■■□");
                        System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■■■□□□■■■□■■■□□□□■■■");
                        System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■■■■□□■■■□■■■□□□□■■■");
                        System.out.println("□□□□■■■□□□□□■■■■■■■■■□■■■■■■■■■□■■■■■■■■■□■■■■■■■□■■■□■■■□□□□■■■");
                        System.out.println("□□□□■■■□□□□□■■■■■■■■■□■■■■■■■■■□■■■■■■■■■□■■■□■■■■■■■□■■■□□□□■■■");
                        System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■□□■■■■■■□■■■□□□□■■■");
                        System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■□□□■■■■■□■■■□□□□■■■");
                        System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□■■■■□■■■■■■■■■□");
                        System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□□■■■□■■■■■■■■□□");
                        System.out.println("\n");
                        System.out.println("이용해주셔서 감사합니다 :)");
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    } else if (this.Hp <= 0) {
                        monsterattack3.Stop2(true);
                        pet3.Stop2(true);
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        System.out.println("전투에 패배하여 사망하셨습니다..死");
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        t3.close();
                        death();
                        if (t2.isAlive()) {
                            t2.interrupt();
                        }
                        BGM2 t2 = new BGM2(".mp3", false);
                        t2.start();
                        revival:
                        while (true) {
                            input = scan.nextInt();
                            if (input == 1) {
                                System.out.println("\n");
                                System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                t2.close();
                                break battle1;
                            } else {
                                System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                continue revival;
                            }
                        }
                    }
                    monsterattack3.Stop2(true);
                    pet3.Stop2(true);
                    continue battle1;

                case 2:
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. 육중한 일격(검을 강하게 쥐고 적에게 일격을 가합니다 - 공격력x2배)" + "\n2. 동귀어진(만물의 기를 검에 모은 강한 파괴력으로 적을 내려칩니다 - 공격력x3배)");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    input = scan.nextInt();
                    if (input == 1&& count >= 3) {
                        count=0;
                        if (t6.isAlive()) {
                            t6.interrupt();
                        }
                        BGM6 t6 = new BGM6(".mp3", false);
                        t6.start();
                        s6.run();
                        s6.run2();
                        System.out.println("☞ 팔뚝에 모인 강한 힘을 칼날에 모아 적을 찍어누릅니다");
                        System.out.println("\n");
                        System.out.println("⚔ 마계왕 발록에게 " + Attackpower * 2 + " 데미지를 입혔습니다");
                        balrogattack2();
                        if (balrog.Hp <= 0) {
                            if (t7.isAlive()) {
                                t7.interrupt();
                            }
                            BGM7 t7 = new BGM7(".mp3", false);
                            t7.start();
                            monsterattack3.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("☠마계왕 발록☠");
                            System.out.println("애송이들..어설픈 실력으로 나를 다시 봉인하려 하다니...");
                            System.out.println("\n");
                            System.out.println("크...윽 생각보다 강하구나! 나를 물리쳤다고 생각하지마라");
                            System.out.println("\n");
                            System.out.println("이것은 봉인된 힘..언젠가 진짜 힘이 돌아오면 다시 세상을 지배할 것이다");
                            System.out.println("\n");
                            System.out.println("☞ 마계왕 발록을 봉인하고 공주님을 구출하였습니다♬");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("■■■■■■■■■■■□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□□■■■□■■■■■■■■□□");
                            System.out.println("■■■■■■■■■■■□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■■□□□□■■■□■■■■■■■■■□");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■■■□□□■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■■■■□□■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■■■■■■■□■■■■■■■■■□■■■■■■■■■□■■■■■■■□■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■■■■■■■□■■■■■■■■■□■■■■■■■■■□■■■□■■■■■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■□□■■■■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■□□□■■■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□■■■■□■■■■■■■■■□");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□□■■■□■■■■■■■■□□");
                            System.out.println("\n");
                            System.out.println("이용해주셔서 감사합니다 :)");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        } else if (this.Hp <= 0) {
                            monsterattack3.Stop2(true);
                            pet3.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..死");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            t3.close();
                            death();
                            if (t2.isAlive()) {
                                t2.interrupt();
                            }
                            BGM2 t2 = new BGM2(".mp3", false);
                            t2.start();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                    t2.close();
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        monsterattack3.Stop2(true);
                        pet3.Stop2(true);
                        continue battle1;
                    }else if (input == 2 && count >= 3) {
                        count = 0;
                        if (t4.isAlive()) {
                            t4.interrupt();
                        }
                        BGM4 t4 = new BGM4(".mp3", false);
                        t4.start();
                        s1.run();
                        s1.run2();
                        s1.run3();
                        System.out.println("☞ 검 끝에 모인 붉은 빛 에너지가 몬스터에게 날아갑니다");
                        System.out.println("\n");
                        System.out.println("⚔ 마계왕 발록에게 " + Attackpower * 3 + " 데미지를 입혔습니다");
                        balrogattack3();
                        if (balrog.Hp <= 0) {
                            if (t7.isAlive()) {
                                t7.interrupt();
                            }
                            BGM7 t7 = new BGM7(".mp3", false);
                            t7.start();
                            monsterattack3.Stop2(true);
                            pet3.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[WIN]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("☠마계왕 발록☠");
                            System.out.println("애송이들..어설픈 실력으로 나를 다시 봉인하려 하다니...");
                            System.out.println("\n");
                            System.out.println("크...윽 생각보다 강하구나! 나를 물리쳤다고 생각하지마라");
                            System.out.println("\n");
                            System.out.println("이것은 봉인된 힘..언젠가 진짜 힘이 돌아오면 다시 세상을 지배할 것이다");
                            System.out.println("\n");
                            System.out.println("☞ 마계왕 발록을 봉인하고 공주님을 구출하였습니다♬");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("■■■■■■■■■■■□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□□■■■□■■■■■■■■□□");
                            System.out.println("■■■■■■■■■■■□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■■□□□□■■■□■■■■■■■■■□");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■■■□□□■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■■■■□□■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■■■■■■■□■■■■■■■■■□■■■■■■■■■□■■■■■■■□■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■■■■■■■□■■■■■■■■■□■■■■■■■■■□■■■□■■■■■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■□□■■■■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■□□□□□□□■■■□□□□□□□■■■□□□■■■■■□■■■□□□□■■■");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□■■■■□■■■■■■■■■□");
                            System.out.println("□□□□■■■□□□□□■■■□□□■■■□■■■■■■■■■□■■■■■■■■■□■■■□□□□□■■■□■■■■■■■■□□");
                            System.out.println("\n");
                            System.out.println("이용해주셔서 감사합니다 :)");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        } else if (this.Hp <= 0) {
                            monsterattack3.Stop2(true);
                            pet3.Stop2(true);
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[LOSS]〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            System.out.println("전투에 패배하여 사망하셨습니다..死");
                            System.out.println("\n");
                            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                            System.out.println("\n");
                            t3.close();
                            death();
                            if (t2.isAlive()) {
                                t2.interrupt();
                            }
                            BGM2 t2 = new BGM2(".mp3", false);
                            t2.start();
                            revival:
                            while (true) {
                                input = scan.nextInt();
                                if (input == 1) {
                                    System.out.println("\n");
                                    System.out.println("† 부활과 동시에 HP가 10 회복되었습니다");
                                    t2.close();
                                    break battle1;
                                } else {
                                    System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                                    continue revival;
                                }
                            }
                        }
                        monsterattack3.Stop2(true);
                        pet3.Stop2(true);
                        continue battle1;
                    } else {
                        System.out.println("\n");
                        System.out.println("⊙ 쿨타임으로 인해 스킬 사용이 제한됩니다(3부터 사용가능)");
                        System.out.println("⊙ Skill 게이지: " + count);
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    monsterattack3.Stop2(true);
                    pet3.Stop2(true);
                    System.out.println("사용하실 아이템을 선택해주세요");
                    System.out.println("1. 빨간물약" + " 2. 순록우유");
                    System.out.println("\n");
                    input = scan.nextInt();
                    if (input == 1) {
                        inventory.setRedpotionCount(1);
                        inventory.itemshow();
                        UsepotionHp1(tempHp);
                    } else if (input == 2) {
                        inventory.setMilkCount(1);
                        inventory.itemshow();
                        UsepotionHp2(tempHp);
                    } else {
                        System.out.println("잘못 입력하셨습니다" + " 다시 입력해주세요");
                    }
                    break;

                case 4:
                    monsterattack3.Stop2(true);
                    pet3.Stop2(true);
                    Ult3();
                    continue battle1;

                case 0:
                    monsterattack3.Stop2(true);
                    pet3.Stop2(true);
                    System.out.println("                                 ■■■");
                    System.out.println("                              ■■■■■");
                    System.out.println("                                 ■■■");
                    System.out.println("                          ■■■■■■■■■■");
                    System.out.println("           ■■■■■    ■■■                  ■");
                    System.out.println("                                 ■■■                      ■");
                    System.out.println("                                 ■■■");
                    System.out.println("                             ■■■■■");
                    System.out.println("                         ■■        ■■");
                    System.out.println("                     ■■            ■■■■■■■");
                    System.out.println("                 ■■");
                    System.out.println("             ■■");
                    System.out.println("\n");
                    System.out.println("뒤도 돌아보지 않고 재빠르게 도망갑니다");
                    System.out.println("후다다닥...");
                    SetHp(Hp);
                    monsterattack3.Stop2(true);
                    pet3.Stop2(true);
                    break battle1;
            }
            monsterattack3.Stop2(true);
            pet3.Stop2(true);
        }
        monsterattack3.Stop2(true);
        pet3.Stop2(true);
        t3.close();
    }

    /////////////////////////////////////////////////////////////////////////////////////// PUB
    public void gamble() {
        if (t9.isAlive()) {
            t9.interrupt();
        }
        BGM9 t9 = new BGM9(".mp3", false);
        t9.start();
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[♣PUB♣]〓〓〓〓〓〓〓〓〓〓〓");
        System.out.println("♣PUB주인 곽씨: ");
        System.out.println("\n");
        System.out.println("자네 오랜만이네~ 어디 멀리 다녀왔는가?");
        System.out.println("편한 자리 앉고 항상 그래왔듯이 바로 게임을 진행하겠네");
        System.out.println("5개의 컵 중  돌이 들어있는 컵에 돈을 걸어 맞추면 걸은 금액의 2배만큼을 줄 것이고 틀리면 모두 잃을걸세 하하하");
        System.out.println("자... 그럼 시작하지");
        System.out.println("\n");
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        int gamble = (int) (Math.random() * 5) + 1; //난수 1~5까지.
        Thread mix = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(500);
                        System.out.print("∩");
                    }
                } catch (InterruptedException e) {
                }
            }
        });
        try {
            System.out.println("♣PUB주인 곽씨가 야바위를 섞는 중입니다");
            System.out.println("[야바위 컵] ");
            mix.start();
            mix.join();
            System.out.println();
            System.out.println("거실 금액을 입력하세요");
            System.out.println("메소: " + getGold());
            System.out.print("[배팅금액] ");
            int input = scan.nextInt();
            if (input <= getGold()) {
                System.out.println("♣PUB주인 곽씨: 자네..몇 번 컵에 걸겠는가?");
                int cup = scan.nextInt();
                if (cup == gamble) {
                    System.out.println("♣PUB주인 곽씨: ");
                    System.out.println("크.. 자네 직감은 여전히 날카로워~ 자 가져가게!");
                    System.out.println("뒤도 돌아보지 말고 나가게나~");
                    SetGold(input*2);
                    System.out.println(input*2 + "메소를 얻었습니다♪");
                    System.out.println("메소: " + getGold());
                    Thread.sleep(1000);
                } else if (cup != gamble) {
                    System.out.println("♣PUB주인 곽씨: ");
                    System.out.println("하하하 이 친구 어디서 놀다오더니 감을 다 잃었구먼 그래~ㅎㅎㅎ");
                    System.out.println("멀리 안나가겠네~♪ 자신있으면 또 방문하게나!");
                    System.out.println(input + "메소를 잃었습니다..");
                    SetGold(-input);
                    System.out.println("메소: " + getGold());
                    Thread.sleep(1000);
                }
            } else if (input > getGold()) {
                System.out.println("\n");
                System.out.println("♣PUB주인 곽씨: ");
                System.out.println("자네.. 보아하니 메소가 부족한 것 같은데 다음에 다시 찾아오게나!");
                System.out.println("365일 24시간 운영 중이니 나는 언제든지 환영이네~♪");
            }
        } catch (Exception e) {
        }
        t9.close();
    }

    /////////////////////////////////////////////////////////////////////////////////////// 몬스터 자동공격 쓰레드
    //슬라임
    public class Monsterattack extends Thread {
        volatile boolean stop;
        int count = 0;

        public Monsterattack(){
            this.stop = false;
        }

        public int attack(int attackpower){
            Hp -= attackpower;
            if (Hp <= 0) {
                Hp = 0;
            }
            return attackpower;
        }

        public void run() {
            while (!stop) {
                try {
                    int monsterattack = attack(10);
                    System.out.println("○ 슬라임으로부터 10 데미지를 받았습니다 "+ "☞ 나의 HP: "+Hp + "/" +MaxHp);
                    sleep(4000); //4초에 1번씩 공격
                    count++;
                    if(Hp == 0){
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

    //골렘
    public class Monsterattack2 extends Thread {
        volatile boolean stop;
        int count = 0;

        public Monsterattack2(){
            this.stop = false;
        }

        public int attack(int attackpower){
            Hp -= attackpower;
            if (Hp <= 0) {
                Hp = 0;
            }
            return attackpower;
        }

        public void run() {
            while (!stop) {
                try {
                    int monsterattack = attack(30);
                    System.out.println("▣ 골렘으로부터 30 데미지를 받았습니다 "+ "☞ 나의 HP: "+Hp + "/" +MaxHp);
                    sleep(4000); //4초에 1번씩 공격
                    count++;
                    if(Hp == 0){
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

    //발록
    public class Monsterattack3 extends Thread {
        volatile boolean stop;
        int count = 0;

        public Monsterattack3(){
            this.stop = false;
        }

        public int attack(int attackpower){
            Hp -= attackpower;
            if (Hp <= 0) {
                Hp = 0;
            }
            return attackpower;
        }

        public void run() {
            while (!stop) {
                try {
                    int monsterattack = attack(50);
                    System.out.println("☠ 발록으로부터 50 데미지를 받았습니다 "+ "☞ 나의 HP: "+Hp + "/" +MaxHp);
                    sleep(4000); //4초에 1번씩 공격
                    count++;
                    if(Hp == 0){
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
}



