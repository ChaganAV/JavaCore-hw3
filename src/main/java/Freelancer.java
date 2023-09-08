import java.util.Random;

public class Freelancer extends Employer{
    private double rate = 20.8 * 8;
    private int hour;

    public Freelancer(String name, int age) {
        super(name, age);
    }

    public static Employer getInstance(){
        return new Freelancer(names[random.nextInt(names.length)],
                random.nextInt(20,55));
    }

    @Override
    public int compareTo( Employer o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public double getSalary() {
        return getRate()*getHour();
    }

    @Override
    public String toString() {
        return  getName() +
                ", Freelancer " +
                ", возраст = " + getAge() +
                ", ставка = " + rate +
                ", отработано часов = " + hour +
                ", зарплата = " + getSalary();
    }


    // region Getters and Setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    // endregion
}
