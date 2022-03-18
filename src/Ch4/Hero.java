package Ch4;

import java.util.Scanner;

public class Hero extends Character {
    Scanner scan = new Scanner(System.in);

    int input = 0;
    public int tempHp;
    public int tempExp;
    public int tempGold;
    public int tempSpirit;
    public int SetGold;
    public int MaxSpirit = 10;
    public int MaxExp=100;
    public int Gold = 500;

    Church church = new Church();
    Monster monster = new Monster();
    Slime slime = new Slime();
    Orc orc = new Orc();
    Skull skull = new Skull();
    Golem golem = new Golem();
    Balrog balrog = new Balrog();

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

    ///////////////////////////////////////////////////////////////////////////////////////Hero attack
    //슬라임 공격
    public void slimeattack() {
        slime.Hp -= Attackpower;
        if (slime.Hp <= 0) {
            slime.Hp = 0;
        }
        Hp -= slime.Attackpower;
        System.out.println("슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void slimeattack2() {
        slime.Hp -= Attackpower * 2;
        if (slime.Hp <= 0) {
            slime.Hp = 0;
        }
        Hp -= slime.Attackpower;
        System.out.println("슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void slimeattack3() {
        slime.Hp -= Attackpower * 3;
        if (slime.Hp <= 0) {
            slime.Hp = 0;
        }
        Hp -= slime.Attackpower;
        System.out.println("슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    //오크 공격
    public void orcattack() {
        orc.Hp -= Attackpower;
        if (orc.Hp <= 0) {
            orc.Hp = 0;
        }
        Hp -= orc.Attackpower;
        System.out.println("오크 HP: " + orc.Hp + "/" + orc.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void orcattack2() {
        orc.Hp -= Attackpower * 2;
        if (orc.Hp <= 0) {
            orc.Hp = 0;
        }
        Hp -= orc.Attackpower;
        System.out.println("오크 HP: " + orc.Hp + "/" + orc.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void orcattack3() {
        orc.Hp -= Attackpower * 3;
        if (orc.Hp <= 0) {
            orc.Hp = 0;
        }
        Hp -= orc.Attackpower;
        System.out.println("오크 HP: " + orc.Hp + "/" + orc.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    //해골 공격
    public void skullattack() {
        skull.Hp -= Attackpower;
        if (skull.Hp <= 0) {
            skull.Hp = 0;
        }
        Hp -= skull.Attackpower;
        System.out.println("해골병사 HP: " + skull.Hp + "/" + skull.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void skullattack2() {
        skull.Hp -= Attackpower * 2;
        if (skull.Hp <= 0) {
            skull.Hp = 0;
        }
        Hp -= skull.Attackpower;
        System.out.println("해골병사 HP: " + skull.Hp + "/" + skull.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void skullattack3() {
        skull.Hp -= Attackpower * 3;
        if (skull.Hp <= 0) {
            skull.Hp = 0;
        }
        Hp -= skull.Attackpower;
        System.out.println("해골병사 HP: " + skull.Hp + "/" + skull.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    //골렘 공격
    public void golemattack() {
        golem.Hp -= Attackpower;
        if (golem.Hp <= 0) {
            golem.Hp = 0;
        }
        Hp -= golem.Attackpower;
        System.out.println("골렘 HP: " + golem.Hp + "/" + golem.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void golemattack2() {
        golem.Hp -= Attackpower * 2;
        if (golem.Hp <= 0) {
            golem.Hp = 0;
        }
        Hp -= golem.Attackpower;
        System.out.println("골렘 HP: " + golem.Hp + "/" + golem.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void golemattack3() {
        golem.Hp -= Attackpower * 3;
        if (golem.Hp <= 0) {
            golem.Hp = 0;
        }
        Hp -= golem.Attackpower;
        System.out.println("골렘 HP: " + golem.Hp + "/" + golem.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    //발록 공격
    public void balrogattack() {
        balrog.Hp -= Attackpower;
        if (balrog.Hp <= 0) {
            balrog.Hp = 0;
        }
        Hp -= balrog.Attackpower;
        System.out.println("발록 HP: " + balrog.Hp + "/" + balrog.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void balrogattack2() {
        balrog.Hp -= Attackpower * 2;
        if (balrog.Hp <= 0) {
            balrog.Hp = 0;
        }
        Hp -= balrog.Attackpower;
        System.out.println("발록 HP: " + balrog.Hp + "/" + balrog.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    public void balrogattack3() {
        balrog.Hp -= Attackpower * 3;
        if (balrog.Hp <= 0) {
            balrog.Hp = 0;
        }
        Hp -= balrog.Attackpower;
        System.out.println("발록 HP: " + balrog.Hp + "/" + balrog.MaxHp);
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }
    /////////////////////////////////////////////////////////////////////////초식!! 진정한 필살기
    public void Ult() {

        if (Spirit + tempSpirit >= MaxSpirit) {

            slime.Hp -= Attackpower * 5;
            if (slime.Hp <= 0) {
                slime.Hp = 0;
                System.out.println("\n");
                System.out.println("빛의 정령들이 주변으로 모여들고");
                System.out.println("검이 빛나기 시작합니다..");
                System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
                System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
                System.out.println("\n");
                System.out.println("빛의 초식 발동!!" + "\n(공격력 x 5배)");
                System.out.println("\n");
                System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
                System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
                System.out.println("\n");
                System.out.println("슬라임 HP: " + slime.Hp + "/" + slime.MaxHp);
                System.out.println("나의 HP: " + Hp + "/" + MaxHp);
            }
        }
    }

    //정령획득 + 궁극기!!
    public void SetSpirit(int tempSpirit) {
        Spirit += tempSpirit ;
        if(Spirit > 10){
            Spirit = 0;
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
    ///////////////////////////////////////////////////////////////////////////////////////
    //Hero HP 실시간 데이터(전투)
    public void SetHp(int tempHp){
            Hp = tempHp;
    }

    //Hero 빨간물약 사용
    public void UsepotionHp1(int tempHp){
        Hp = getHp() + 100;
            if(Hp  > MaxHp){
                Hp = MaxHp;
            }
            System.out.println("HP +100 회복되었습니다");
            System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }

    //Hero 순록우유 사용
    public void UsepotionHp2(int tempHp){
        Hp = getHp() + 300;
        if(Hp  > MaxHp){
            Hp = MaxHp;
        }
        System.out.println("HP +300 회복되었습니다");
        System.out.println("나의 HP: " + Hp + "/" + MaxHp);
    }

    //메소 획득
    public void SetGold(int tempGold) {
        if(Gold + tempGold < 0)
            Gold = 0;
        else
            Gold += tempGold;
    }

    //경험치 획득
    public void SetExp(int tempExp) {
        Exp += tempExp;
        if(Exp + tempExp >= MaxExp){
            LevelUp();
        }
    }

    //Hero levelup 시 HP+100, AP+3, levelup시 HP 풀 충전, MaxExp+200
    public void LevelUp() {
            Level++;
            MaxHp += 200;
            Attackpower += 5;
            MaxExp += 200;
            Exp = 0;
            Hp = MaxHp;
            System.out.println("★★★★★★★★★★★★★★★★★");
            System.out.println("★★★★★★★★★★★★★★★★★");
            System.out.println("★★★★★★★★★★★★★★★★★");
            System.out.println("                        LEVEL UP!!                     ");
            System.out.println("  HP +100, 공격력 +3 증가되었습니다  ");
            System.out.println("★★★★★★★★★★★★★★★★★");
            System.out.println("★★★★★★★★★★★★★★★★★");
            System.out.println("★★★★★★★★★★★★★★★★★");
    }

    //Hero 사망 시 부활!
    public void death() {
        church.revival();
        if(Hp < 0)
            Hp = 10;
    }

    /////////////////////////////////////////////////////////////////////////////////////// 조회 및 계산
    //Hero의 스텟(능력치) 조회(Level, HP,  AP, Exp)
    public void stat() {
        System.out.println("-----------------------------[상 태]-------------------------------");
        System.out.println("레벨: " + getLevel());
        System.out.println("HP: " + getHp() + "/" + MaxHp);
        System.out.println("공격력: " + getAttackpower());
        System.out.println("경험치: " + getExp() + "/" + MaxExp);
        System.out.println("빛의 정령: " + getSpirit() + "/" + MaxSpirit);
        System.out.println("---------------------------------------------------------------------");
    }
}