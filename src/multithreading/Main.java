package multithreading;

public class Main {

    public static void main(String[] args) {
        // print 2 & 3 table parallelly

        Runnable runnable1=()->{
            printTable(2);
        };

        Runnable runnable2=()->{
            printTable(3);
        };

        Thread t1= new Thread(runnable1);
        t1.start();

        Thread t2= new Thread(runnable2);
        t2.start();






    }

    private static void printTable(int n) {

        for (int i = 1; i < 11; i++) {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
