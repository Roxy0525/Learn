import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main (String[] args) {

        List<Greetable> people = new ArrayList<>();
        people.add(new Person("Ivan", 35));
        people.add(new Person("Anna", 30));
        people.add(new Student("Kate", 19, "МГУ"));
        people.add(new Student("Ivan", 18, "RUT"));
        people.add(new Student("Pavel", 20, "РГСУ"));

        for (Greetable g : people) {
            g.sayHello();
        }

        List<Student> students = new ArrayList<>();
        for (Greetable g: people){
            if (g instanceof Student){
                Student s = (Student) g;
                students.add(s);
            }
        }

        students.sort(Comparator.comparingInt(Student::getAge));
        students.sort(Comparator.comparing(Student::getName));



        for (Student s: students){
            System.out.println(s.toString());
        }

    }

}
