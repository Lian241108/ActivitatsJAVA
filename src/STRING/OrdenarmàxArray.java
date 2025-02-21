package STRING;

public class OrdenarmàxArray {
    public static void main(String[] args) {
        int[] nums = {6,9,4,3,8,2};
        sort(nums, nums.length-1);
        printArray(nums);
    }
    public static int postMàx(int[]array, int end){
        int valorMàx = array [0];
        int posicioMàx = 0;
        for(int i=0; i<=end; i++){
            if (array[i]>valorMàx){
                valorMàx = array[i];
                posicioMàx = i;
            }
        }
        return posicioMàx;
    }
    public static void printArray(int[] array){
        for ( int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i,array[i]);
        }
    }

    public static void sort (int [] array, int end){
        if(end>0){
            int pMàx = postMàx(array,end);
            int temp = array[end];
            array[end] = array[pMàx];
            array[pMàx] = temp;
            sort(array, end-1);
        }
    }
}
