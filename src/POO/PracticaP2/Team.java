package POO.PracticaP2;

public class Team {
    private String name;
    private Runner[] runners = new Runner[5];
    private int numRunners;
    private boolean international;

    public Team(String name, boolean international) {
        this.name = name;
        this.international = international;
        this.numRunners = 0;
    }

    // Getters i Setters
    public String getName() { return name; }
    public boolean getInternational() { return international; }
    public int getNumRunners() { return numRunners; }
    public void setInternational(boolean international) { this.international = international; }
    public void setName(String name){this.name=name;}
    public void setNumRunners(int numRunners){this.numRunners=0;}

    public void addRunner(Runner r) {
        if (numRunners < runners.length) {
            runners[numRunners] = r;
            numRunners++;
        }
    }

    public float averageTimes() {
        float sum = 0.0f;
        int count = 0;
        for (int i = 0; i < numRunners; i++) {
            float avg = runners[i].averageTimes();
            if (avg != 0.0f) {
                sum += avg;
                count++;
            }
        }
        if(count == 0){
            return count= 0;
        } else{
            return sum/count;
        }
    }

    public boolean areAllProfessionals() {
        for (int i = 0; i < numRunners; i++) {
            if (runners[i].getProfessional()) {
                return true;
            }
        }
        return false;
    }

    public int getNumProfessionals() {
        int count = 0;
        for (int i = 0; i < numRunners; i++) {
            if (runners[i].getProfessional()) {
                count++;
            }
        }
        return count;
    }

    public Runner[] getRunners() {
        return runners;
    }
}