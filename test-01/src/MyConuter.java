import java.util.concurrent.atomic.AtomicInteger;

public class MyConuter extends Thread{
    static AtomicInteger conuter = new AtomicInteger();
    @Override
    public void run() {
        super.run();
        calculateConuter();
    }
    public static  void   calculateConuter(){

        for (int i = 0; i < 100; i++) {
            conuter.getAndIncrement();

        }
        System.out.println("conuter :"+conuter);
    }
}
