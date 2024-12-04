package Training;


//class MyThread extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + ". Co cai L ! from thread number : " + this.getName() + " with thread Id = " + this.threadId());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//class MyThread implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + ". Ok " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
class RunnableTask implements Runnable {
    private int taskId;

    public RunnableTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
    }
}

public class SecondMain {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            pool.submit(new RunnableTask(i));
        }
        pool.shutdown();
    }
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            MyThread myThread = new MyThread();
//            Thread thread = new Thread(myThread);
//            thread.start();
//            try {
//                thread.join(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
