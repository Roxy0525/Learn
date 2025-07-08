public class Person implements Greetable {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public String getName() { return name; }
    public int    getAge()  { return age; }

    @Override
    public void sayHello() {
        System.out.println("Привет! Меня зовут " + name + ", мне " + age + " лет.");
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
