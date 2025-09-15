package POO.PracticaP2;

public class Race {
    private String raceID;
    private Runner[] runners = new Runner[8];
    private float[] times = new float[8];
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    public Race(String raceID) {
        this.raceID = raceID;
        this.isFinals = false;
        this.classificationTime = 0.0f;
        this.numRunners = 0;
    }

    public Race(String raceID, boolean finals, float classificationTime) {
        this.raceID = raceID;
        this.isFinals = finals;
        this.classificationTime = classificationTime;
        this.numRunners = 0;
    }

    // Getters i Setters
    public String getRaceID() {
        return raceID;
    }

    public boolean getIsFinals() {
        return isFinals;
    }

    public float getClassificationTime() {
        return classificationTime;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public void setIsFinals(boolean finals) {
        this.isFinals = finals;
    }

    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = 0;
    }

    public void addRunner(Runner r) {
        if (numRunners < runners.length) {
            runners[numRunners] = r;
            numRunners++;
        }
    }

    public void addTimeToRunner(Runner r, float time) {
        for (int i = 0; i < runners.length; i++) {
            if (runners[i] == r) {
                times[i] = time;
                break;
            }
        }
    }

    public float bestTime() {
        float best = Float.MAX_VALUE;
        for (int i = 0; i < numRunners; i++) {
            if (times[i] != 0.0f && times[i] < best) {
                best = times[i];
            }
        }
        if (best != 0) {
            return best;
        } else {
            return 0;
        }
    }

    public Runner bestRunner() {
        float best = Float.MAX_VALUE;
        Runner bestRunner = null;
        for (int i = 0; i < numRunners; i++) {
            if (times[i] != 0.0f && times[i] < best) {
                best = times[i];
                bestRunner = runners[i];
            }
        }
        return bestRunner;
    }

    public float averageTimes() {
        float sum = 0.0f;
        int count = 0;
        for (int i = 0; i < numRunners; i++) {
            if (times[i] != 0.0f) {
                sum += times[i];
                count++;
            }
        }
        if (count == 0) {
            return count = 0;
        } else {
            return sum / count;
        }
    }

    public float differenceBestFromWorst() {
        float best = Float.MAX_VALUE;
        float worst = Float.MIN_VALUE;
        for (int i = 0; i < numRunners; i++) {
            if (times[i] != 0.0f) {
                if (times[i] < best) best = times[i];
                if (times[i] > worst) worst = times[i];
            }
        }
        return (best == Float.MAX_VALUE || worst == Float.MIN_VALUE) ? 0.0f : worst - best;

    }

}
