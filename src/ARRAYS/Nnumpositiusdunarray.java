package ARRAYS;

public class Nnumpositiusdunarray {
    public static void main(String[] args) {
        //Definició i creació
        int[] a = {3,8,2,10,25};

        System.out.printf ("Els quantitat de núm positius de l'array són %d \n", numpositius(a));
    }

    public static int numpositius(int[] array) {
        int numpositius = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                numpositius = numpositius + 1;
            }
        }
        return numpositius;


    }
}
