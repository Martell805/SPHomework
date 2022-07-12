package secondCourse.task2_2;

public class RavenclawStudent extends HogwartsStudent{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgress, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magic, transgress);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int getScore(){
        return getIntelligence() + getWisdom() + getWit() + getCreativity();
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                super.toString() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public void compareTo(RavenclawStudent other){
        if(this.getScore() > other.getScore()){
            System.out.printf("%s лучший Когтевранец, чем %s\n", this.getName(), other.getName());
        } else if (this.getScore() == other.getScore()){
            System.out.printf("%s и %s равные Когтевранцы\n", this.getName(), other.getName());
        } else {
            System.out.printf("%s лучший Когтевранец, чем %s\n", this.getName(), other.getName());
        }
    }
}
