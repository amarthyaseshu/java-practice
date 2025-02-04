public class Casting {

    public static void main(String[] args) {
         /*
    In java -128 to 127 is automatocally stored in cache & same obj is created
     */
        Integer i1=127;
        Integer i2=127;
        System.out.println(i1==i2);

        Integer i3=128;
        Integer i4=128;
        System.out.println(i3==i4);

        /*
        after 3.4 f is added because, by default decimals r double in java & by
        adding f we r explicitly casting to float
         */
        float f=3.4f;

    }
}
