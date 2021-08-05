import java.util.ArrayList;

public class HerosAndDistrictRun {
    public static void main(String[] args) {
//        Create seven heroes as the objects

        Hero hero1 = new Hero("Artis", "Stabinš", "JavaMan", 1, HeroType.Hero, 10);
        Hero hero2 = new Hero("Lauris", "Saulītis", "JungleMan", 2, HeroType.Hero, 12);
        Hero hero3 = new Hero("Ilze", "Liepa", "TreeWoman", 3, HeroType.Hero, 10);
        Hero hero4 = new Hero("Liene", "Lapa", "MegaMind", 4, HeroType.Villain, 10);
        Hero hero5 = new Hero("Kristīne", "Šķendere", "ProblemSolver", 5, HeroType.Hero, 10);
        Hero hero6 = new Hero("Oskars", "Šikula", "LizardMan", 6, HeroType.Villain, 13);
        Hero hero7 = new Hero("Trīne", "Saulīte", "PoisonGirl", 7, HeroType.Villain, 10);
//        Create two Districts as the objects. Add three heroes in the first District and others in the second District.

        District district1 = new District();
        district1.setTitle("EvilEnd");
        district1.setCity("Los Angeles");
        district1.setDistrictID(1);
        district1.addNewHero(hero1);
        district1.addNewHero(hero2);
        district1.addNewHero(hero3);
        District district2 = new District("HappySide", "Liepāja", 2);
        district2.addNewHero(hero4);
        district2.addNewHero(hero5);
        district2.addNewHero(hero6);
        district2.addNewHero(hero7);

//         Print out all information about each District.

        System.out.println(district1.toString());
        System.out.println(district2.toString());
//        Print first hero from distinct one

        System.out.println(district1.heroesInTheDistrict.get(0));
//        Remove one hero from the second District.

        district1.removeHero(0);
        district2.removeHero(3);
        System.out.println("Heroes in district 1: " + district1.heroesInTheDistrict);
        System.out.println("Heroes in district 2: " + district2.heroesInTheDistrict);


//float result;
//        int sumOfCalculatedLevel =0;
//        int delete = district2.heroesInTheDistrict.size();
//            for (Hero eachHero: district2.heroesInTheDistrict)
//            {sumOfCalculatedLevel+=eachHero.calculatedLevel();
//                System.out.println(eachHero.calculatedLevel());
//
//            }result = sumOfCalculatedLevel/ delete;
//        System.out.println(result);

//Calculate average level of each District.

        System.out.println("The average level of the first district is: " + district1.calculateAvgLevelInDistrict());
        System.out.println("The average level of the second district is: " + district2.calculateAvgLevelInDistrict());

//        Create an arraylist of the Districts and put both District objects in the arraylist.

        ArrayList<District> objectsOfTheDistrict = new ArrayList<District>();
        objectsOfTheDistrict.add(district1);
        objectsOfTheDistrict.add(district2);
//        Calculate how many heroes are in both Districts.
//        Calculating how many heroes are in each Districts separately.

        int counter = 0;
        for (int i = 0; i < district1.heroesInTheDistrict.size(); i++) {
            if (district1.heroesInTheDistrict.get(i).getHeroType().equals(HeroType.Hero)) {
                counter++;
            }

        }
        System.out.println(counter);

        int counter1 = 0;
        for (int i = 0; i < district2.heroesInTheDistrict.size(); i++) {
            if (district2.heroesInTheDistrict.get(i).getHeroType().equals(HeroType.Hero)) {
                counter1++;
            }

        }
        System.out.println(counter1);
        System.out.println("There are " + (counter + counter1) + " heroes in both districts ");

 //        Calculating how many heroes are in both Districts together.

        int counter4 =0;
        for (int i = 0; i < objectsOfTheDistrict.size(); i++) {
            for (int j = 0; j < objectsOfTheDistrict.get(i).heroesInTheDistrict.size(); j++) {
                if (objectsOfTheDistrict.get(i).heroesInTheDistrict.get(j).getHeroType().equals(HeroType.Hero)){
                    counter4++;
                }
            }

        }
        System.out.println("There are: " + counter4 + " heroes in both districts");

//   Calculate the average level of both Districts.

        int counter3 = 0;
        int sumOfCalculatedLevelInBothDistrict = 0;
        float averageLevelInBothDistricts;
            for (int i = 0; i < objectsOfTheDistrict.size(); i++) {
            for (int j = 0; j < objectsOfTheDistrict.get(i).heroesInTheDistrict.size(); j++) {
//                System.out.println(objectsOfTheDistrict.get(i).heroesInTheDistrict.get(j).calculatedLevel());
                sumOfCalculatedLevelInBothDistrict += objectsOfTheDistrict.get(i).heroesInTheDistrict.get(j).calculatedLevel();
                counter3++;
            }
        }
//        System.out.println(sumOfCalculatedLevelInBothDistrict);
//        System.out.println(counter3);
        averageLevelInBothDistricts = (float) sumOfCalculatedLevelInBothDistrict / counter3;
        System.out.println("Average level of both Districts is: " + averageLevelInBothDistricts +".");

//        System.out.println(objectsOfTheDistrict.get(0).heroesInTheDistrict.get(1).calculatedLevel());
//        System.out.println(hero2.calculatedLevel());
//         Find out which District is the best based on the average level of heroes.

        if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println("Average level of heroes is better in district 1.");
        } else if (district1.calculateAvgLevelInDistrict() < district2.calculateAvgLevelInDistrict()) {
            System.out.println("Average level of heroes is better in district 2.");

        } else {
            System.out.println("Average level of heroes in district 1 and district 2 is the same.");

//             Delete the first District. What’s happening with heroes in there?

            objectsOfTheDistrict.remove(0);
            System.out.println("The array list with both districts after deleting first district is: " +objectsOfTheDistrict.toString());
            System.out.println("The element with index 0  deleting first district is: " +objectsOfTheDistrict.get(0));
//            System.out.println(hero1.toString());
//            System.out.println(hero2.toString());
//            System.out.println(hero3.toString());

//            Create 2 villains

            Villain villain1 = new Villain();
            villain1.setName("Zigfrīds");
            villain1.setSurname("Bērziņš");
            villain1.setNickname("ZigzagMan");
            villain1.setVillainID(1);
            villain1.setCrimeTime(155);

            Villain villain2 = new Villain("Jānis","Kalniņš", "drEvil", 2,125);

            System.out.println(villain1.toString());
            System.out.println(villain2.toString());

        }
    }
}

