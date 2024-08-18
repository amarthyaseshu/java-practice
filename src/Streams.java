import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Streams {

    // counting numbers grater than a hundred



    public static void main(String[] args) {
        List<Integer> numberslIst=new ArrayList<>();
        // Using stream is inefficient because n r independent & parallel stream can be used
        long count = numberslIst.stream().filter(n -> n > 0).count();
        //efficient way
        long pcount = numberslIst.parallelStream().filter(n -> n > 0).count();
    }


}
