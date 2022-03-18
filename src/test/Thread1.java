package test;

public class Thread1 {

    public static void main(String args[]) {
            bank t1 = new bank("ATM");
            bank t2 = new bank("은행");

            t1.start();
            t2.start();
    }
}
