import java.util.*;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        List<Employer> employers = new ArrayList<>();
        int count = random.nextInt(8);
        for (int i = 0; i < count; i++) {
            Freelancer freelancer = (Freelancer) Freelancer.getInstance();
            freelancer.setHour(random.nextInt(500));
            employers.add(freelancer);
        }
        count = random.nextInt(10);
        for (int i = 0; i < count; i++) {
            Worker worker = (Worker) Worker.getInstance();
            worker.setRate(random.nextInt(5000,35000));
            employers.add(worker);
        }
        for (Employer emp: employers) {
            System.out.println(emp);
        }
        System.out.println("------ С сортировкой по имени --------");
        Collections.sort(employers);
        for (Employer emp: employers) {
            System.out.println(emp);
        }
        System.out.println("----- С сортировкой по зарплате и имени ---------");
        Collections.sort(employers,new EmployerNameSalaryComporator());
        for (Employer emp: employers) {
            System.out.println(emp);
        }
    }
}
