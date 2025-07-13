import java.util.function.Consumer;
import java.util.function.Supplier;

public class first {
    public static void main(String[] args) {
        Consumer<Integer> c = x-> System.out.println(x);
        c.accept(9);
        Supplier<String> s = ()-> "Shabbir";
        System.out.println(s.get());
    }
}
