public class Hero {
    private String name;
    private String surname;
    private String nickname;
    private int heroID;
    private HeroType heroType;
    private int deedTime;

    public Hero() {

    }

    public Hero(String name, String surname, String nickname, int heroID, HeroType heroType, int deedTime) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.heroID = heroID;
        this.heroType = heroType;
        this.deedTime = deedTime;
    }

//    private int calculatedLevel(){}


    public int calculatedLevel() {
        if (deedTime < 20) {
            return 1;
        } else if ((deedTime >= 20) && (deedTime < 40)) {
            return 2;
        } if (deedTime >= 40) {
            return 3;

        }
        return 0;
    }




    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", heroType=" + heroType +
                ", deedTime=" + deedTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickmane() {
        return nickname;
    }

    public void setNickmane(String nickmane) {
        this.nickname = nickmane;
    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }
}

    enum HeroType {
        Hero,
        Villain
    }

