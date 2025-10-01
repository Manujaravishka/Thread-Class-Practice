package lk.ijse;


public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for(int i=0;i<10;i++){
                System.out.println("Thread 1 is Running");
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i=0;i<10;i++){
                System.out.println("Thread 2 is Running");
            }
        });
        t1.start();
        t2.start();


    }
}