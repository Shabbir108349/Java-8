package LambdaExpression;

@FunctionalInterface
public interface Engineer {
    void setName(String name);
    default String getName(){
        return "Shabbir Hassain";
    }

    static void info(){
        System.out.println("this class is for a Engineer");
    }

}
