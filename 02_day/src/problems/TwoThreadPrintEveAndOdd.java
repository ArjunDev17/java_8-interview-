package problems;

public class TwoThreadPrintEveAndOdd extends Thread {



    static void main() throws InterruptedException {
//        TwoThreadPrintEveAndOdd A=new TwoThreadPrintEveAndOdd();
//        TwoThreadPrintEveAndOdd B=new TwoThreadPrintEveAndOdd();

        ThreaA data=new ThreaA();
        Thread writer = new Thread(() -> {
            try {
                // Sleep for 1 second
                Thread.sleep(5);

                // Call your method
                write();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() -> read());
        writer.start();
        reader.start();

//        Thread reader=new Thread(->obj.letsRead());

    }
    public static void read(){
        System.out.println("coming here fo r read");
        while (!isActive){
            System.out.println("reading ");
        }




    }
    static  Boolean   isActive=false;
   static void write() {
        System.out.println("writng");
        isActive=true;
    }
}
