package lambdas;

public class LambdaRunnableEx {
    public static void tradionalApproch() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable traditional approach");
            }
        };
        new Thread(runnable).start();
    }

    public static void java8Approach() {
        Runnable runnable=()-> System.out.println("java 8 approach");
        new Thread(runnable).start();
    }
}
