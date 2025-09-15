package POO.PracticaP2;
public class Runner {

    private String name;
    private String team;
    private String[] raceIDs = new String[5];
    private float[] times = new float[5];
    private int numRaces;
    private boolean professional;

    public Runner(String name) {
        this.name = name;
        this.team = "Sense Equip";
        this.professional = false;
        this.numRaces = 0;
    }

    public Runner(String name, String team, boolean professional) {
        this.name = name;
        this.team = team;
        this.professional = professional;
        this.numRaces = 0;
    }

    // Getters i Setters
    public String getName() { return name; }
    public String getTeam() { return team; }
    public boolean getProfessional() { return professional; }
    public int getNumRaces() { return numRaces; }
    public String[] getRaceIDs(){ return this.raceIDs; }

    public void setName(String name) { this.team = name; }
    public void setProfessional(boolean professional) { this.professional = professional; }
    public void setTeam(String team) { this.team = team; }
    public void setNumRaces (int numRaces) {this.numRaces= numRaces;}


    public void addRace(String raceID) {
        if (numRaces < raceIDs.length) { //Nombre de carreres és més petit que s'array
            raceIDs[numRaces] = raceID;  //Valor (i) de receIDs serà = numRaces amb el nom de raceID
            numRaces++;
        }
    }

    public void addTime(float time) {
        for (int i = 0; i < times.length; i++) { //anar de 0 a 4 a s'array
            if (times[i] == 0) {
                times[i] = time;
                break; //Per sortir del bucle una vegada canvia el temps a l'array
            }
        }
    }

    public float bestTime() {
        float best = Float.MAX_VALUE; //Cercat a chat GPT, per no haver de posar 1000, alomillor fet a classe però no m'en recordava
        for (int i = 0; i < numRaces; i++) {
            if (times[i] != 0.0f && times[i] < best) {
                best = times[i];
            }
        }
        return best;
    }

    public float averageTimes() {
        float sum = 0.0f;
        int count = 0;
        for (int i = 0; i < numRaces; i++) {
            if (times[i] != 0.0f) {
                sum += times[i];
                count++;
            }
        }
        if(count == 0){
            return count= 0;
        } else{
            return sum/count;
        }
    }

    public String bestRace() {
        float best = Float.MAX_VALUE;
        String bestRace = raceIDs[0];
        for (int i = 0; i < numRaces; i++) {
            if (times[i] != 0.0f && times[i] < best) {
                best = times[i];
                bestRace = raceIDs[i];
            }
        }
        return bestRace;
    }
}
