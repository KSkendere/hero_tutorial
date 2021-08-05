import java.util.Scanner;

public class SuperHeroGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade;
        System.out.println("Please input grade A,B,C,D,E,F,G and press enter.");
        grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so brave!");
                break;
            case 'C':
                System.out.println("Good! But you can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should choose your bad or good side!");
            case 'F':
                System.out.println("Bad, you are true villian.");
            default:
                System.out.println("There is no such grade, please choose from the list!");

        }
    }
}
