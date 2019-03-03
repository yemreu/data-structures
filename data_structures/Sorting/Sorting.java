
package data_structures.Sorting;


public class Sorting {
    
    public static final byte ORDER_BY_ASC = 0;
    public static final byte ORDER_BY_DESC = 1;
    
    public static class BubbleSort{
        
        public static int[] sort(int[] arr, byte order){
            int t;
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i; j < arr.length; j++) {
                    if((order == ORDER_BY_ASC ? (arr[i]>arr[j]) : (arr[i]<arr[j]))){
                        t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
            return arr;
        }    
    }
}
