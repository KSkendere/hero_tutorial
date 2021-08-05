import java.util.Scanner;

public class SuperHeroSalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please input Super Hero working hours in day and press enter");
        int workingHoursInDay = scanner.nextInt();
        int heroSalary;
        if ((workingHoursInDay <= 0) || (workingHoursInDay > 24)) {
            System.out.println("Working hours in day must be from 0 till 24");
        } else if ((workingHoursInDay > 0) && (workingHoursInDay <= 8)){
            heroSalary = workingHoursInDay * 10;
            System.out.println("Super hero salary in one day is: "+ heroSalary + " EUR");
        }
        else { heroSalary = 80 +((workingHoursInDay-8)*15);

            System.out.println("Super hero salary in one day is: " +heroSalary+ " EUR");
        }


    }
}
