public class Villain {
    private String name;
    private String surname;
    private String nickname;
    private int villainID;
    private int crimeTime;

    public Villain() {
    }

    public Villain(String name, String surname, String nickname, int villainID, int crimeTime) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.villainID = villainID;
        this.crimeTime = crimeTime;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", villainID=" + villainID +
                ", crimeTime=" + crimeTime +
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getVillainID() {
        return villainID;
    }

    public void setVillainID(int villainID) {
        this.villainID = villainID;
    }

    public int getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(int crimeTime) {
        this.crimeTime = crimeTime;
    }
}
