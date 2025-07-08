public class Student extends Person {
    private final String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void sayHello() {
        System.out.println(
                "Привет! Я студент " + university + ". Меня зовут "
                        + getName() + ", мне " + getAge() + " лет."
        );
    }

    @Override
    public String toString(){
        return getName() + " (" + getAge() +" " + university + ") ";
    }
}
