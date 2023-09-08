import java.util.Comparator;

public class EmployerNameSalaryComporator implements Comparator<Employer> {
    @Override
    public int compare(Employer o1, Employer o2) {
        int res = Double.compare(o1.getSalary(), o2.getSalary());
        if(res == 0){
            return o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}
