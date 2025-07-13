package LambdaExpression;
public class first {
    public static void main(String[] args) {
        Engineer e = new EngineerImpl();  // general Way vai an implementation class
        e.setName("Shabbir");

        Engineer e1 = System.out::println; // Lambda expression
        e1.setName("Shabbir");

        System.out.println(e.getName());
        System.out.println(e1.getName());
        Engineer.info();
    }
}
