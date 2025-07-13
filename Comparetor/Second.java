import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        student s1 = new student(1,"Shabbir");
        student s2 = new student(1,"Annie");
        student s3 = new student(3,"Abdullah");
        List<student> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.sort((a,b)->b.id-a.id);

        System.out.println(l);

    }
}

class student{
    int id;
    String name;
    public student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
