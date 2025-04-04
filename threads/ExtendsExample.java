public class ExtendsExample extends Thread {
    public static void main(String[] args) {
        ExtendsExample thread = new ExtendsExample();
        thread.start();
        System.out.println(" this code is outside of the thread");

    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}