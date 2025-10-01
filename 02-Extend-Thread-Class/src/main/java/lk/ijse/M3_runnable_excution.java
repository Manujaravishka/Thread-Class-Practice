package lk.ijse;

public class M3_runnable_excution {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();

    }
}

class C implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("C is Running");
        }
    }
}
