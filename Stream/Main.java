import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // How to create Stream;
        // we can create Stream on several way such that "Collections to stream" "Arrays to stream" and "iteration" and "Stream generation"

        //collections to stream;
        List<String> l = List.of("Shabbir","Abdullah","Suraiya","Aina");
        Stream<String> MyStream = l.stream();

        //Arrays to stream;
        String [] name = {"Shabbir","Abdullah","Suraiya","Aina","Annie"};
        Stream<String> MyName = Arrays.stream(name);

        //Stream iteration
        Stream<Integer> num = Stream.iterate(0,x->x+1).limit(101);

        //Stream generation
        Stream<Integer> limit = Stream.generate(()-> (int)  (Math.random() * 100)).limit(10);
    }
}
