package secondCourse.Task2_2;

public class GryffindorStudent extends HogwartsStudent{
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgress, int nobility, int honor, int bravery) {
        super(name, magic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getScore(){
        return getNobility() + getHonor() + getBravery();
    }

    @Override
    public String toString() {
        return "GryffindorStudent{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
