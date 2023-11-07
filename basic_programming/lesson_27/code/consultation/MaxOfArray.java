package consultation;

public class MaxOfArray {

    public int maxOfArray(int[] arr){
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
