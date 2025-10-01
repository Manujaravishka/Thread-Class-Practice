package lk.ijse;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation calculation = new Calculation();
        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                calculation.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                calculation.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(calculation.num);
    }
}

class Calculation {
    int num;
    public synchronized void increment() {
        num++;
    }
    //race condition - unpredicatable resalt
    //data inconsistency -wrong result
    //deadlock - infinite loop(ex - T1 is waiting for T2 and T2 is waiting for T1)
}