import java.util.function.Function;

public class FunctionOperations {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = x-> x*x;
        Function<Integer,Integer> f2 = x-> x*2;
        Integer apply = f1.andThen(f2).apply(3);
        System.out.println(apply);
        System.out.println(f1.compose(f2).apply(3));

        Function<String,String> f3 = Function.identity();
        System.out.println(f3.apply("Shabbir"));

    }
}
