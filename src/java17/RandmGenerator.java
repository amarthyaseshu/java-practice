package java17;


import java.util.random.RandomGenerator;

public class RandmGenerator {

    public static void main(String[] args) {
        RandomGenerator rmg=RandomGenerator.of("L128X256MixRandom");
        System.out.println(rmg.nextInt(100));
    }
}
