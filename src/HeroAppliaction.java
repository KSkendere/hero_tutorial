import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeroAppliaction {


    // Function to add x in arr
    public static String[] addX(String superHeroList[], String newHeroName) {

        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(superHeroList));

        // Add the new element
        arrlist.add(newHeroName);

        // Convert the Arraylist to array
        superHeroList = arrlist.toArray(superHeroList);

        // return the array
        return superHeroList;
    }

    // Function to remove a hero from an array
    public static String[] removeX(String superHeroList[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(superHeroList));

        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);

        // Convert the Arraylist to array
        superHeroList = arrlist.toArray(superHeroList);
        superHeroList = Arrays.copyOf(superHeroList, superHeroList.length - 1);

        // return the array
        return superHeroList;
    }

    public static void main(String[] args) {


        Hero hero1 = new Hero("Kristīne ", "Šķendere", "ProblemSolver", 1, HeroType.Hero, 55);
        Hero hero2 = new Hero("Jhon", "Smith", "ff", 2, HeroType.Villain, 11);
        Hero hero3 = new Hero();
        hero3.setName("Lauris");
        hero3.setSurname("Šķenders");
        hero3.setNickmane("drEvil");
        hero3.setHeroID(3);
        hero3.setHeroType(HeroType.Villain);
        hero3.setDeedTime(22);
        Hero hero4 = new Hero();

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Please enter Superhero name and press enter");
//        hero4.setName(scanner.next());


        Hero[] metrapole = new Hero[3];
        metrapole[0] = hero1;
        metrapole[1] = hero2;
        metrapole[2] = hero3;
        int counter = 0;
        int counter2 =0;
        for (Hero hero : metrapole) {
            if (hero.calculatedLevel() == 1) {
                counter++;
            }else if (hero.calculatedLevel()>1){
                counter2++;
            }
        }
        System.out.println("There are " + counter + " heroes with the level 1 in the Metropole");
        System.out.println("There are " + counter2 + " heroes with the level which is larger than 1 in the Metropole");

        for (Hero eachVariable : metrapole
        ) {
            if (eachVariable.getName().equals("Jhon")) {
                System.out.println(" One of the heroes  name is Jhon");

            }

        }


        //   Variable initialization
        String heroName;
        String heroCity;
        String heroPower1, heroPower2, heroPower3;
        boolean isEvil;
        double heroSalary;
        String realName;
        String universe;

//        VARIABLES
        String[] superHeroList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowflake", "MuffinGirl", "STAR"};
        double[] heroSalaryArray = {1000.00, 100.00, 10000.00, 1000.99, 1000.00, 10000.99, 10.00, 159.00, 154.00, 200.00, 30.00};
        String[] heroCityArray = {"Daugavpils", "Jekabpils", "Aluksne", "Riga", "Smiltene", "Kuldiga", "Talsi", "Tukums", "Ventspils", "Valmiera", "Aizkraukle"};

//        MENU

        int menuEntry;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("                             ");
            System.out.println("*****************************");
            System.out.println("Welcome!");
            System.out.println("Please select what to do:");
            System.out.println("1 - Show a list of superheroes ");
            System.out.println("2 - Add new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero from the list");
            System.out.println("0 - Exit");

            menuEntry = scanner.nextInt();

            switch (menuEntry) {
                case 1:
                    System.out.println("********************************");
                    System.out.println("*** THE LIST OF SUPERHEROS ****");
                    System.out.println("********************************");
                    for (String eachHero : superHeroList
                    ) {
                        System.out.println(eachHero);
                    }
                    break;
                case 2:
                    System.out.println("Ener heros name to be added:");
                    String newHeroName = scanner.next();
                    superHeroList = addX(superHeroList, newHeroName);
                    System.out.println("The new Superhero list is:");
                    for (int i = 0; i < superHeroList.length; i++) {
                        System.out.println(superHeroList[i]);
                    }


                    break;
                case 3:
                    System.out.println("Please enter superhero name you want to find information about");
                    String superHeroInfo = scanner.next();
                    for (int i = 0; i < superHeroList.length; i++) {
                        if (superHeroInfo.equals(superHeroList[i])) {
                            System.out.println("The superhero " + superHeroList[i] + " salary is " + heroSalaryArray[i] + " EUR and city is " + heroCityArray[i]);
                        }

                    }
                    break;
                case 4:

                    System.out.println("Please enter superhero name you want to delete");
                    String deletedHero = scanner.next();
                    for (int i = 0; i < superHeroList.length; i++) {
                        if (deletedHero.equals(superHeroList[i])) {
                            superHeroList = removeX(superHeroList, i);
                        }
                    }
                    System.out.println("The new superhero list is:");
                    for (String eachhero : superHeroList
                    ) {
                        System.out.println(eachhero);

                    }
                    break;

                default:
                    System.out.println("Not such menu entry");

            }

        }
        while (menuEntry != 0);


//  Variable assignment

        heroName = "ProblemSolver";
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
        System.out.println("This hero lives in " + heroCity);
        System.out.println("-----------------------");
        System.out.println("Hero Superpowers: ");
        System.out.println("---" + heroPower1);
        System.out.println("---" + heroPower2);
        System.out.println("---" + heroPower3);
        System.out.println("This Superhero is evil? " + isEvil);
        System.out.println("This Superhero earns: " + heroSalary + " EUR");
        System.out.println(realName + " hides his identity");
        System.out.println("This hero lives in " + universe + " Universe");
        System.out.println("**********************");

//        How many cookies can Superhero purchase for his salary
//        1 cookie costs = 1.29 EUR
//        System.out.println("*****************************************");
//        System.out.println("************** FINANCIALS ****************");
//        int numOfCookies = (int) Math.floor(heroSalary / 1.29);
//        System.out.println("Hero can purchase " + numOfCookies + " cookies");
//        double averageDailySalary = Math.round((heroSalary / 30 * 100)) / 100;
//        System.out.println("Hero average daily salary " + averageDailySalary);


        if (isEvil) {
            System.out.println("Hero is a villian. He is stealing cookies!!!");
        } else {
            System.out.println("Hero protects the city!");
        }

        heroCity = "Metropolis";

        switch (heroCity) {
            case "New York":
                heroSalary = 2000;
                break;
            case "Riga":
                heroSalary = 1200.91;
                break;
            case "Metropolis":
                heroSalary = 1000000;
                break;
            default:
                heroSalary = 100;
        }
        System.out.println("Heros new salary is " + heroSalary);

        System.out.println("*****************************************");
        System.out.println("************** FINANCIALS ****************");
        int numOfCookies = (int) Math.floor(heroSalary / 1.29);
        System.out.println("Hero can purchase " + numOfCookies + " cookies");
        double averageDailySalary = Math.round((heroSalary / 30 * 100)) / 100;
        System.out.println("Hero average daily salary " + averageDailySalary);


    }

}







