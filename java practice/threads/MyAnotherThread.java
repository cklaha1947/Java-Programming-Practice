//Creating thread using Thread class
class MyAnotherThread extends Thread {
    public void run() {
        // task for thread
        for (int i = 10; i >= 1; i--) {
            System.out.println("another thread = " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
    }

}