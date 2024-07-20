//creating our thread using Runnable Interface
class MyThread implements Runnable {
    public void run() {
        // task for thread...
        for (int i = 1; i <= 10; i++) {

            System.out.println("value of i is " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        // create object of MyThread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        // object of AnotherThread
        MyAnotherThread t2 = new MyAnotherThread();
        thr.start();
        t2.start();
    }
}