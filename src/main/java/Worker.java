import java.util.Random;

public class Worker extends Employer{
    private double rate = 0;

    public Worker(String name, int age) {
        super(name, age);
    }
    public static Employer getInstance(){
        return new Worker(names[random.nextInt(names.length)],
                random.nextInt(20,55));
    }

    @Override
    public int compareTo(Employer o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public double getSalary() {
        return getRate();
    }

    @Override
    public String toString() {
        return getName() +
                ", Worker " +
                ", возраст = " + getAge() +
                ", зарплата = " + getSalary();
    }

    // region Getters and Setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    // endregion
}
