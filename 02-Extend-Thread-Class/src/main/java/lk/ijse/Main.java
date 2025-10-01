package lk.ijse;
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();

        try {
            Thread.sleep(1000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
class A extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("A is Running");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
        }
        }
}
class B extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("B is Running");

        }
    }
}