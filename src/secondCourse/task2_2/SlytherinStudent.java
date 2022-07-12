package secondCourse.task2_2;

public class SlytherinStudent extends HogwartsStudent{
    private int tricky;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public SlytherinStudent(String name, int magic, int transgress, int tricky, int determination, int ambition, int resourcefulness, int powerLust) {
        super(name, magic, transgress);
        this.tricky = tricky;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(int tricky) {
        this.tricky = tricky;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    private int getScore(){
        return getTricky() + getDetermination() + getAmbition() + getResourcefulness() + getPowerLust();
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                super.toString() +
                ", tricky=" + tricky +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", powerLust=" + powerLust +
                '}';
    }

    public void compareTo(SlytherinStudent other){
        if(this.getScore() > other.getScore()){
            System.out.printf("%s лучший Слизеринец, чем %s\n", this.getName(), other.getName());
        } else if (this.getScore() == other.getScore()){
            System.out.printf("%s и %s равные Слизеринцы\n", this.getName(), other.getName());
        } else {
            System.out.printf("%s лучший Слизеринец, чем %s\n", this.getName(), other.getName());
        }
    }
}
