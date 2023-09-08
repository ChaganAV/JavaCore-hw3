import java.util.Comparator;
import java.util.Random;

public abstract class Employer implements Comparable<Employer> {
    // region Fields
    private String name;
    private int age;
    protected static String[] names = {"Куравлев", "Петров", "Сидоров", "Смоктуновский","Иванов"};
    protected static Random random = new Random();
    // endregion
    public Employer(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract double getSalary();

    @Override
    public abstract String toString();

    // region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // endregion
}
