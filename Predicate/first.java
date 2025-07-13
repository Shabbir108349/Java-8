import java.util.List;
import java.util.function.Predicate;

public class first {
    public static void main(String[] args) {
        Predicate<Integer> p = x->x>10;
        System.out.println(p.test(515));

        List<Integer> l = List.of(1,3,4,5);
        List<Integer> ll = l.stream().filter(x -> x % 2 != 0).toList();
        System.out.println(ll);
    }
}
