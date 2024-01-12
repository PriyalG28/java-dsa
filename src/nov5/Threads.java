package nov5;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("class A");
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("class B");
        }
    }
}

public class Threads {

    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        System.out.println(t1.getPriority());
        t2.start();
        System.out.println(t2.getPriority());

    }
}
