package lk.ijse;


public class Main {
    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Consumer(a);

    }
}
class A{
    int num;
    boolean flag = false;
    public void put(int num){
        System.out.println("PUT : "+num);
        this.num = num;
        flag = true;
        notify();
    }
    public void get(){
        while(!flag){}
        System.out.println("get : "+num);

    }
    public synchronized void get2(){
        while(!flag){}
        System.out.println("get2 : "+num);
    }
}
class Producer implements Runnable {
    A a;
    public Producer(A a) {
        this.a = a;
        Thread t1 = new Thread(this, "Producer");
        t1.start();

    }

    @Override
    public void run() {

        //put
        int i =0;
        while (true){
            a.put(i++);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    A a ;
    public Consumer(A a) {
    //get
        this.a = a;
        Thread t1 = new Thread(this , "Consumer");
        t1.start();

    }
    @Override
    public void run() {
        while (true){
            a.get();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}

