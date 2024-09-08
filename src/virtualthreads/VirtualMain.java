package virtualthreads;

public class VirtualMain {

    public static void main(String[] args) {
        Thread virtualThread=Thread.ofVirtual().start(()->{
            System.out.println("virtual thread");
        });
    }
}
