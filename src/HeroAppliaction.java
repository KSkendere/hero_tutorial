public class HeroAppliaction {

    public static void main(String[] args) {

//   Variable initialization
        String heroName;
        String heroCity;
        String heroPower1, heroPower2, heroPower3;
        boolean isEvil;
        double heroSalary;
        String realName;
        String universe;

//  Variable assignment

     heroName ="ProblemSolver";
     heroCity = "Gulbene";
     heroPower1 = "Solving problems";
     heroPower2 = "Very fast";
     heroPower3 = "Very smart";
     isEvil = false;
     heroSalary = 100000.99;
     realName = "Kristīne";
     universe = "The Parallel";
//     Print out Hero information card
        System.out.println("**********************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("**********************");
        System.out.println("Hero name: " + heroName);
        System.out.println("This hero lives in "  + heroCity);
        System.out.println("-----------------------");
        System.out.println("Hero Superpowers: ");
        System.out.println("---" +heroPower1);
        System.out.println("---" +heroPower2);
        System.out.println("---" +heroPower3);
        System.out.println("This Superhero is evil? " + isEvil);
        System.out.println("This Superhero earns: " + heroSalary + " EUR");
        System.out.println(realName + " hides his identity");
        System.out.println("This hero lives in " + universe + " Universe");
        System.out.println("**********************");

    }
}
