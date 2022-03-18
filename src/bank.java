class bank extends Thread{
    static Account obj = new Account();
    public bank(){}
    public bank(String name) {super(name);}
    public void run(){
        //무한반복
        while(true){
            //찾는 금액은 랜덤
            int money = (int)(Math.random() * 3 + 1) * 100;
            //원금이 찾는 금액보다 클 때
            if(obj.balance >= money)
            {
                System.out.println(getName() + " : 원본의 balance: " + obj.balance);
                System.out.println(getName() + " : 찾는 금액: " + money);
                obj.withdraw(money);
                System.out.println(getName() + " : 수정된 balance: " + obj.balance);
            }
            else{
                System.out.println("잔액부족");
                break;
            }
        }
    }
}
