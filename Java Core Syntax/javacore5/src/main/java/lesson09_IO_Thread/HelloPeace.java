package lesson09_IO_Thread;

public class HelloPeace {
    public static void main(String[] args) {
        Thread hello = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<5; i++){
                    System.out.println("Hello world");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread peace = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<5; i++){
                    System.out.println("Peace in the peace");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        hello.start();
        peace.start();
        try {
            hello.join();
            peace.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is ...");
    }
}
