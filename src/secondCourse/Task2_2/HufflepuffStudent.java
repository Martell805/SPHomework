package secondCourse.Task2_2;

public class HufflepuffStudent extends HogwartsStudent{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int getScore(){
        return getIndustriousness() + getLoyalty() + getHonesty();
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                super.toString() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void compareTo(HufflepuffStudent other){
        if(this.getScore() > other.getScore()){
            System.out.printf("%s лучший Пуффендуец, чем %s\n", this.getName(), other.getName());
        } else if (this.getScore() == other.getScore()){
            System.out.printf("%s и %s равные Пуффендуйцы\n", this.getName(), other.getName());
        } else {
            System.out.printf("%s лучший Пуффендуец, чем %s\n", this.getName(), other.getName());
        }
    }
}
