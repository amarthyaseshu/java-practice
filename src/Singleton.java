public class Singleton {
    // static because below mtd is static
    // volatile because if this obj is stored in cache memory then below if condn null check wont give corect result
    public static volatile Singleton s=null;

    private Singleton(){

    }
    // static mtd because constructor is private & we cant call non static mtd without creating object
   // synchronized not necessary in mtd lvl because if obj already created then no need for threads to wait
    public static Singleton getSingleton(){
        if(s==null){
            synchronized (Singleton.class){//If both threads r here at a time, one thread enters but again multiple instance will be created so double check is required
                if(s==null){
                     s=new Singleton();
                }
            }
        }
        return s;
    }



}