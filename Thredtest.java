/**
 * Thredtest
 */
public class Thredtest {

    public static void main(String[] args) {
        Solution so = new Solution();
        new Thread(so).start();
    }
}

class Solution implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
            System.out.println("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}