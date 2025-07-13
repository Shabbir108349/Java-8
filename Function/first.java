import java.util.List;
import java.util.function.Function;

public class first {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3,4,5,6);
        List<String> list = l.stream().map(Object::toString).toList();
        System.out.println(list);

        Function<String,Integer> f1 = x->x.length();
        System.out.println(f1.apply("Shabbir"));

    }
}
