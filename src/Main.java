import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter basic salary");
        Scanner sc = new Scanner(System.in);
        double basicsalary = sc.nextInt();
        double hra = 0;
        double da = 0;
        if (basicsalary >= 5000) {
            hra = 0.1 * basicsalary;
            da = 0.2 * basicsalary;
        } else {
            hra = 0.2 * basicsalary;
            da = 0.3 * basicsalary;
        }
      System.out.println(hra+" "+da);
        System.out.println(basicsalary+hra+da);
    }
}