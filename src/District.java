import java.util.ArrayList;


public class District {
    private String title;
    private String city;
    private int districtID;
    ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();




    public District() {
    }

    public District(String title, String city, int districtID) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;

    }

    public boolean addNewHero(Hero hero) {
        return heroesInTheDistrict.add(hero);

    }

    public Hero removeHero(int index) {
        return heroesInTheDistrict.remove(index);
    }

//       calculateAvgLevelInDistrict(): float

    public float calculateAvgLevelInDistrict() {
        int sumOfCalculatedLevel = 0;
        float result;
        for (Hero eachHero : heroesInTheDistrict ) {
            sumOfCalculatedLevel += eachHero.calculatedLevel();

        }
        result = (float) sumOfCalculatedLevel / heroesInTheDistrict.size();

        return result;
    }

//    float result;
//        int sumOfCalculatedLevel =0;
//        int delete = district2.heroesInTheDistrict.size();
//            for (Hero eachHero: district2.heroesInTheDistrict)
//            {sumOfCalculatedLevel+=eachHero.calculatedLevel();
//                System.out.println(eachHero.calculatedLevel());
//
//            }result = sumOfCalculatedLevel/ delete;
//        System.out.println(result);

    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;

    }


}
