import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreams {

    public static void main(String[] args) throws IOException {
        //Not closing Streams that hold resources like Files lead to resource leakage
        Stream<String> lines= Files.lines(Paths.get("file.txt"));
        lines.forEach(System.out::println);

        // correct way


        try(Stream<String> lines1= Files.lines(Paths.get("file.txt"))) {
            lines1.forEach(System.out::println);
        }catch (IOException e){

        }
    }


}
