package STRING;

public class Ordenararray {
    public static void main(String[] args) {
        int[] nums = {1,4,5,6,3,4,5,3,2};
        sort(nums, 0);
        printArray(nums);
    }
    public static int postMin(int[]array, int start){
        int valorMinim = array [start];
        int posicioMinim = start;
        for(int i=start+1; i<array.length; i++){
            if (array[i]<valorMinim){
                valorMinim = array[i];
                posicioMinim = i;
            }
        }
        return posicioMinim;
    }
    public static void printArray(int[] array){
        for ( int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i,array[i]);
        }
    }
    public static void sort (int [] array, int start){
        if(start<array.length-1){
          int pMin = postMin(array, start);
          int temp = array[start];
          array[start] = array[pMin];
          array[pMin] = temp;
          sort(array, start+1);
        }
    }
}
