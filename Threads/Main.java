/*  2 kinds of Thread we have(Daemon thread and non-daemon thread(user thread))
Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
JVM terminates itself when all user threads (non-daemon threads) finish their execution */


class MyThread extends Thread {

    public void run() {
        if (this.isDaemon()) {
            System.out.println("This is not a deamon thread");
        } else {
            System.out.println("This is not a deamon thread");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread thread2 = new MyThread();

        System.out.println(thread2.isAlive());  // returns false should start
        System.out.println("------------------------------");

        thread2.start();
        System.out.println(thread2.isAlive());

        System.out.println(thread2.getName()); // Thread-0

        thread2.setName("My own Thread"); // change the name of thread
        System.out.println(thread2.getName()); // My own Thread


        System.out.println(thread2.getPriority()); // 5 as default


        System.out.println(thread2.isDaemon()); // false it is not a deamon thread

    }
}


