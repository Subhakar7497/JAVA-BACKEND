public class ImplementsExample implements Runnable {
    public static void main(String[] args) {
        ImplementsExample obj = new ImplementsExample();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of  the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
