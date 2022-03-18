package INFINITY_END;

import INFINITY_END.BGM.*;
import INFINITY_END.Thread.*;
import INFINITY_END.skill.*;

import java.util.Random;
import java.util.Scanner;

public class Hero extends Character {
    Scanner scan = new Scanner(System.in);

    BGM2 t2 = new BGM2(".mp3", false);
    BGM3 t3 = new BGM3(".mp3", false);
    BGM4 t4 = new BGM4(".mp3", false);
    BGM5 t5 = new BGM5(".mp3", false);
    BGM6 t6 = new BGM6(".mp3", false);
    BGM7 t7 = new BGM7(".mp3", false);
    BGM8 t8 = new BGM8(".mp3", false);
    BGM9 t9 = new BGM9(".mp3", false);

    skill1 s1 = new skill1();
    skill2 s2 = new skill2();
    skill3 s3 = new skill3();
    skill4 s4 = new skill4();
    skill5 s5 = new skill5();
    skill6 s6 = new skill6();
    Ult ult = new Ult();

    int input = 0;
    public int Hp;
    public int MaxHp;
    public int tempHp;
    public int tempExp;
    public int tempSpirit;
    public int MaxSpirit = 10;
    public int MaxExp=100;
    public int Gold = 500;
    int cardlevel = 1;

    Inventory inventory = new Inventory();

    Pet pet = new Pet();
    Pet2 pet2 = new Pet2();
    Pet3 pet3 = new Pet3();
    Church church = new Church();
    Slime slime = new Slime("슬라임", 100, 10);
    Golem golem = new Golem("골렘",1000,30);
    Balrog balrog = new Balrog("발록",3000,50);

    public Hero(String name, int hp, int maxHp, int attackpower){
        Name = name;
        Hp = hp;
        MaxHp = maxHp;
        Attackpower = attackpower;
    }

    public int getHp(){
        return Hp;
    }

    public int getLevel(){
        return Level;
    }

    public int MaxHp(){
        return MaxHp;
    }

    public int MaxExp(){
        return MaxExp;
    }

    public int MaxSpirit() {
        return MaxSpirit;
    }

    public int getAttackpower(){
        return Attackpower;
    }

    public int getExp(){
        return Exp;
    }

    public int getSpirit(){
        return Spirit;
    }

    public int getGold(){
        return Gold;
    }

    public void takeDamage(int damage){
        Hp -= damage;
        if(Hp < 0){
            Hp = 0;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////Hero attack
    //슬라임 공격
    public void slimeattack() {
        slime.Hp -= Attackpower;
        if (slime.Hp <= 0) {
            slime.Hp = 0;
        }
        System.out.println("▶ 슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
    }
    public void slimeattack2() {
        slime.Hp -= Attackpower * 2;
        if (slime.Hp <= 0) {
            slime.Hp = 0;
        }
        System.out.println("▶ 슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
    }
    public void slimeattack3() {
        slime.Hp -= Attackpower * 3;
        if (slime.Hp <= 0) {
            slime.Hp = 0;
        }
        System.out.println("▶ 슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
    }

    //골렘 공격
    public void golemattack() {
        Stone();
        golem.Hp -= Attackpower;
        if (golem.Hp <= 0) {
            golem.Hp = 0;
        }
        System.out.println("▶ 골렘 HP: " + golem.Hp + "/" + golem.MaxHp);
    }
    public void golemattack2() {
            Stone();
            golem.Hp -= Attackpower * 2;
            if (golem.Hp <= 0) {
                golem.Hp = 0;
            }
        System.out.println("▶ 골렘 HP: " + golem.Hp + "/" + golem.MaxHp);
    }
    public void golemattack3() {
        Stone();
        golem.Hp -= Attackpower * 3;
        if (golem.Hp <= 0) {
            golem.Hp = 0;
        }
        System.out.println("▶ 골렘 HP: " + golem.Hp + "/" + golem.MaxHp);
    }

    //발록 공격
    public void balrogattack() {
        Light();
        balrog.Hp -= Attackpower;
        if (balrog.Hp <= 0) {
            balrog.Hp = 0;
        }
        System.out.println("▶ 마계왕 발록 HP: " + balrog.Hp + "/" + balrog.MaxHp);
    }
    public void balrogattack2() {
        Light();
        balrog.Hp -= Attackpower * 2;
        if (balrog.Hp <= 0) {
            balrog.Hp = 0;
        }
        System.out.println("▶ 마계왕 발록 HP: " + balrog.Hp + "/" + balrog.MaxHp);
    }
    public void balrogattack3() {
        Light();
        balrog.Hp -= Attackpower * 3;
        if (balrog.Hp <= 0) {
            balrog.Hp = 0;
        }
        System.out.println("▶ 마계왕 발록 HP: " + balrog.Hp + "/" + balrog.MaxHp);
    }

    //발록 낙뢰
    public void Light(){
        Random ran = new Random();
        int percentage = ran.nextInt(10)+1;
        if(percentage<4) {
            System.out.println("\n");
            System.out.println("☞ 마계왕 발록이 손가락을 까딱하더니 낙뢰를 떨어뜨립니다");
            System.out.println("▼        ▼       ▼        ▼       ▼");
            System.out.println("  ▽        ▽       ▽       ▽        ▽");
            System.out.println("▼        ▼       ▼        ▼       ▼");
            System.out.println("  ▽        ▽       ▽       ▽        ▽");
            System.out.println("▼        ▼       ▼        ▼       ▼");
            System.out.println("  ▽        ▽       ▽       ▽        ▽");
            System.out.println("▼        ▼       ▼        ▼       ▼");
            System.out.println("  ▽        ▽       ▽       ▽        ▽");
            System.out.println("▼        ▼       ▼        ▼       ▼");
            System.out.println("  ▽        ▽       ▽       ▽        ▽");
            System.out.println("\n");
            Hp -= balrog.Attackpower/3;
        }
    }

    //골렘 스톤
    public void Stone(){
        Random ran = new Random();
        int percentage = ran.nextInt(10)+1;
        if(percentage<4) {
            System.out.println("\n");
            System.out.println("☞ 골렘이 던진 큰 바위들이 날아옵니다");
            System.out.println("    ■■                    ■■");
            System.out.println("■■■■             ■■■■");
            System.out.println("    ■■                    ■■");
            System.out.println("                  ■■                       ■■");
            System.out.println("              ■■■■                ■■■■");
            System.out.println("                  ■■                       ■■");
            System.out.println("\n");
            Hp -= balrog.Attackpower / 3;
        }
    }

    /////////////////////////////////////////////////////////////////////////초식!! 진정한 필살기
    public void Ult() {
        if (Spirit + tempSpirit >= MaxSpirit) {
            slime.Hp -= Attackpower * 5;
            if (slime.Hp <= 0) {
                slime.Hp = 0;
            }
            t8.start();
            ult.run();
            ult.run2();
            ult.run3();
            System.out.println("\n");
            System.out.println("☞ 빛의 정령들이 검의 형상을 띈 채 슬라임에게 날아갑니다");
            System.out.println("\n");
            System.out.println("▶ 슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
            System.out.println("▶ 나의 HP: " + Hp + "/" + MaxHp);
            if (Spirit == 10) {
                Spirit = 0;
            }
        }else{
            System.out.println("\n");
            System.out.println("※ 빛의 정령이 부족하여 빛의 초식을 사용하실 수 없습니다!");
            System.out.println("\n");
        }
    }

    public void Ult2() {
        if (Spirit + tempSpirit >= MaxSpirit) {
            golem.Hp -= Attackpower * 5;
            if (golem.Hp <= 0) {
                golem.Hp = 0;
            }
                t8.start();
                ult.run();
                ult.run2();
                ult.run3();
                System.out.println("\n");
                System.out.println("☞ 빛의 정령들이 검의 형상을 띈 채 골렘에게 날아갑니다");
                System.out.println("\n");
                System.out.println("▶ 골렘 HP: " + golem.Hp + "/" + golem.MaxHp);
                System.out.println("▶ 나의 HP: " + Hp + "/" + MaxHp);
            if (Spirit == 10) {
                Spirit = 0;
            }
        }else{
            System.out.println("\n");
            System.out.println("※ 빛의 정령이 부족하여 빛의 초식을 사용하실 수 없습니다!");
            System.out.println("\n");
        }
    }

    public void Ult3() {
        if (Spirit + tempSpirit >= MaxSpirit) {
            balrog.Hp -= Attackpower * 5;
            if (balrog.Hp <= 0) {
                balrog.Hp = 0;
            }
                t8.start();
                ult.run();
                ult.run2();
                ult.run3();
                System.out.println("\n");
                System.out.println("☞ 빛의 정령들이 검의 형상을 띈 채 마계왕 발록에게 날아갑니다");
                System.out.println("\n");
                System.out.println("▶ 마계왕 발록 HP: " + balrog.Hp + "/" + balrog.MaxHp);
                System.out.println("▶ 나의 HP: " + Hp + "/" + MaxHp);
            if (Spirit == 10) {
                Spirit = 0;
            }
        }else{
            System.out.println("\n");
            System.out.println("※ 빛의 정령이 부족하여 빛의 초식을 사용하실 수 없습니다!");
            System.out.println("\n");
        }
    }

    //궁극기 사용준비 신호
    public void ReadyUlt() {
        if(Spirit == 10) {
            System.out.println("\n");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("♨ 빛의 정령들이 점점 모여들고..");
            System.out.println("♨ 주변이 환하게 빛나기 시작합니다..");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("\n");
        }else if (Spirit > 10) {
            Spirit = 0;
        }
    }

    //정령획득
    public void SetSpirit(int tempSpirit) {
        Spirit += tempSpirit ;
        if(Spirit > 10){
            Spirit = 0;
        }
    }

    //치트키
    public void TheEnd(){
        Hp = Hp + 3000;
        MaxHp = MaxHp + 3000;
        Attackpower = Attackpower+500;
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //Hero HP 실시간 데이터(전투)
    public void SetHp(int tempHp){
            Hp = tempHp;
    }

    //Hero 빨간물약 사용
    public void UsepotionHp1(int tempHp){
        if (inventory.items[0].count > 0) {
            Hp = getHp() + 100;
            if (Hp > MaxHp) {
                Hp = MaxHp;
            }
            System.out.println("▶ HP +100 회복되었습니다");
            System.out.println("▶ 나의 HP: " + Hp + "/" + MaxHp);
        }else{
            System.out.println("\n");
            System.out.println("※ 빨간물약이 부족합니다. 구매해주세요!");
            System.out.println("\n");
        }
    }

    //Hero 순록우유 사용
    public void UsepotionHp2(int tempHp) {
        if (inventory.items[1].count > 0) {
            Hp = getHp() + 300;
            if (Hp > MaxHp) {
                Hp = MaxHp;
            }
            System.out.println("▶ HP +300 회복되었습니다");
            System.out.println("▶ 나의 HP: " + Hp + "/" + MaxHp);
        }else{
            System.out.println("\n");
            System.out.println("※ 순록우유가 부족합니다. 구매해주세요!");
            System.out.println("\n");
        }
    }

    //빨간물약 상점 카운팅
    public void Redpotionstop(int potioncount){
        if(Gold<50){
            inventory.items[0].count -= potioncount;
            bankruptcy();
        }
    }

    //순록우유 상점 카운팅
    public void Milkstop(int potioncount){
        if(Gold<150){
         inventory.items[1].count -= potioncount;
         bankruptcy();
        }
    }

    // 돈 부족
    public void bankruptcy() {
        if (Gold <= 0) {
            System.out.println("\n");
            System.out.println("❀상점주인 김씨:" + "\n메소가 부족하니 물건을 내어줄 수 없네");
            System.out.println("나도 먹고 살아야 하지 않겠는가?");
            System.out.println("미안하지만 다음에 다시 찾아오게나!");
            System.out.println("\n");
        }
    }

    //메소 획득
    public void SetGold(int tempGold) {
        if(Gold + tempGold <= 0)
            Gold = 0;
        else
            Gold += tempGold;
    }

    //메소 감소
    public void SetGold2(int tempGold) {
        if(Gold + tempGold <= 0)
            Gold = 0;
        else
            Gold -= tempGold;
    }

    //메소 보여주기
    public void Goldshow(){
        if(Gold <= 0) {
            Gold = 0;
            System.out.println("메소 " + getGold());
        }else
        System.out.println("메소 " + getGold());
    }

    //경험치 획득
    public void SetExp(int tempExp) {
        Exp += tempExp;
        if(Exp + tempExp >= MaxExp){
            LevelUp();
        }
    }

    //Hero levelup 시 HP+200, AP+10, levelup시 HP 풀 충전, MaxExp+200
    public void LevelUp() {
            Level++;
            Attackpower += 10;
            MaxHp += 200;
            MaxExp += 200;
            Exp = 0;
            Hp = MaxHp;
            System.out.println("■■■□□□□□■■■■■■■□■□□□□□□□□□□■□■■■■■■□■■■□□□□□■■■□□□■■■□■■■■■■■□");
            System.out.println("■■■□□□□□■■■■■■■□■■□□□□□□□□■■□■■■■■■□■■■□□□□□■■■□□□■■■□■■■□□□■■");
            System.out.println("■■■□□□□□■■□□□□□□■■■□□□□□□■■■□■■□□□□□■■■□□□□□■■■□□□■■■□■■■□□□■■");
            System.out.println("■■■□□□□□■■■■■■■□□■■■□□□□■■■□□■■■■■■□■■■□□□□□■■■□□□■■■□■■■□□□■■");
            System.out.println("■■■□□□□□■■■■■■■□□□■■■□□■■■□□□■■■■■■□■■■□□□□□■■■□□□■■■□■■■□□□■■");
            System.out.println("■■■□□□□□■■□□□□□□□□□■■■■■■□□□□■■□□□□□■■■□□□□□■■■□□□■■■□■■■■■■■□");
            System.out.println("■■■■■■■□■■■■■■■□□□□□■■■■□□□□□■■■■■■□■■■■■■■□■■■■■■■■■□■■■□□□□□");
            System.out.println("■■■■■■■□■■■■■■■□□□□□□■■□□□□□□■■■■■■□■■■■■■■□□■■■■■■■□□■■■□□□□□");
            System.out.println("\n");
            System.out.println("☞ HP +200, 공격력 +10 증가되었습니다  ");
    }

    //Hero 사망 시 부활!
    public void death() {
        church.revival();
        if(Hp <= 0)
            Hp = 10;
    }

    /////////////////////////////////////////////////////////////////////////////////////// 조회 및 계산
    //Hero의 스텟(능력치) 조회(Level, HP,  AP, Exp)
    public void stat() {
        System.out.println("〓〓〓〓〓〓〓〓〓〓[§상 태§]〓〓〓〓〓〓〓〓〓");
        System.out.println("▶ 레벨: " + getLevel());
        System.out.println("▶ HP: " + getHp() + "/" + MaxHp);
        System.out.println("▶ 공격력: " + getAttackpower());
        System.out.println("▶ 경험치: " + getExp() + "/" + MaxExp);
        System.out.println("▶ 빛의 정령: " + getSpirit() + "/" + MaxSpirit);
        System.out.println("▶ 카드레벨: " + cardlevel + "/" + 5);
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    }

    //CARD 강화!!
    //카드 강화 시 성공확률 30%, 실패 시 정령소모, 성공 시 cardlevel-up
    public void cardReinforce() {
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓[♠카드강화♠]〓〓〓〓〓〓〓〓〓〓〓〓");
            System.out.println("☞ 카드강화: 빛의 정령 2개 소모, 성공확률: 30% (카드레벨 MAX: 5)");
            System.out.println("☞ 카드강화 '성공' 시: HP +100, 공격력 +5 패시브가 자동으로 발동됩니다");
            System.out.println("☞ 카드강화 '실패' 시: 빛의 정령 2개가 소모되며 카드레벨은 유지됩니다");
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        loop:
        while (true) {
            System.out.println("강화를 시도하시려면 1번을 눌러주세요");
            input = scan.nextInt();
            if(Spirit< 2) {
                System.out.println("\n");
                System.out.println("♠NPC:");
                System.out.println("빛의 정령이 부족하여 카드강화가 제한됩니다");
                System.out.println("다음에 다시 시도해주세요!");
                System.out.println("\n");
                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⎈이 동⎈]〓〓〓〓〓〓〓〓〓〓〓");
                System.out.println("1. ☠던전으로 이동" + "\n2. ⚑마을로 이동" + "\n3. ᛭인벤토리" + "\n4. ♠카드" + "\n5. §스텟확인");
                System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                System.out.println("\n");
                break loop;
            }
            try{
            if (input == 1) {
                Random ran = new Random();
                int percentage = ran.nextInt(10) + 1;
                if (percentage < 4) {
                    useSpirit(getSpirit());
                    if(cardlevel>=5){
                        cardlevel = 5;
                        System.out.println("♠NPC:");
                        System.out.println("카드 레벨이 MAX에 도달하여 더 이상 강화할 수 없습니다");
                        System.out.println("\n");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⎈이 동⎈]〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("1. ☠던전으로 이동" + "\n2. ⚑마을로 이동" + "\n3. ᛭인벤토리" + "\n4. ♠카드" + "\n5. §스텟확인");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("\n");
                        break loop;
                    }
                    System.out.println("♠NPC:");
                    System.out.println("카드 강화에 성공하였습니다");
                    System.out.println("HP +200, 공격력 +10가 향상되었습니다");
                    System.out.println("\n");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⎈이 동⎈]〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. ☠던전으로 이동" + "\n2. ⚑마을로 이동" + "\n3. ᛭인벤토리" + "\n4. ♠카드" + "\n5. §스텟확인");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("\n");
                    cardLevelup();
                    break loop;
                } else {
                    useSpirit(getSpirit());
                    System.out.println("♠NPC:");
                    System.out.println("카드 강화에 실패하였습니다..");
                    System.out.println("다음에 다시 시도해주세요!");
                    System.out.println("\n");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓[⎈이 동⎈]〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("1. ☠던전으로 이동" + "\n2. ⚑마을로 이동" + "\n3. ᛭인벤토리" + "\n4. ♠카드" + "\n5. §스텟확인");
                    System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                    System.out.println("\n");
                    break loop;
                }
            }
            }
            catch(Exception e){
                System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
            }
        }
    }

    //정령소모
    public void useSpirit(int tempSpirit){
        Spirit = tempSpirit;
        Spirit -= 2;
        if(Spirit < 0){
            Spirit = 0;
        }
    }

    //카드 레벨업 시 Hero HP+200, 공격력+10 향상
    public void cardLevelup(){
        while(true) {
            if (cardlevel < 5) {
                cardlevel += 1;
                MaxHp += 200;
                Attackpower += 10;
                return;
            } else if(cardlevel >= 5){
                cardlevel = 5;
                System.out.println("♠NPC:");
                System.out.println("카드 레벨이 MAX에 도달하여 더 이상 강화할 수 없습니다");
                return;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //level에 따른 몬스터 선택제한
    public void limit(int Level){
        if(Level < 5 || Level < 10 || Level < 15 || Level < 21){
            System.out.println("\n");
            System.out.println("LEVEL이 부족하여 전투가 제한됩니다");
            System.out.println("전투하실 몬스터를 다시 선택해주세요!");
            System.out.println("\n");
        }
    }
}