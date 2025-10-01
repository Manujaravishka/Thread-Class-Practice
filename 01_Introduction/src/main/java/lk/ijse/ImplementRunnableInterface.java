package lk.ijse;

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
//        myRunable.start();
        Thread thread = new Thread(myRunable);
        thread.start();

    }
}


class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunable is Runing");
    }
}