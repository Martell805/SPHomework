package secondCourse.Task2_2;

abstract public class HogwartsStudent {
    private String name;
    private int magic;
    private int transgress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HogwartsStudent(String name, int magic, int transgress) {
        this.name = name;
        this.magic = magic;
        this.transgress = transgress;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int getScore(){
        return magic + transgress;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgress=" + transgress +
                '}';
    }

    public void print() {
        System.out.println(this);
    }

    public void compareTo(HogwartsStudent other){
        if(this.getScore() > other.getScore()){
            System.out.printf("%s обладает большей мощностью магии, чем %s\n", this.getName(), other.getName());
        } else if (this.getScore() == other.getScore()){
            System.out.printf("%s и %s обладает равной мощностью магии\n", this.getName(), other.getName());
        } else {
            System.out.printf("%s обладает меньшей мощностью магии, чем %s\n", this.getName(), other.getName());
        }
    }
}
