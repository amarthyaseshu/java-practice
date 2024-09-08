package newfeatures;

import java.util.List;

public class UnnamedVariables {

    public static void main(String[] args) {
        String _="abc";
        try{

        } catch (RuntimeException _) {

        }

        List<String> data=List.of("a","b");
        data.stream().forEach(_->System.out.println("a"));
    }
}
