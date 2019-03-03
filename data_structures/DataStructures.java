
package data_structures;

import data_structures.Collections.List.LinkedList.LinkedList;
import data_structures.Sorting.Sorting;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataStructures {

    public static void main(String[] args) {
        int[] test_arr = new int[]{5,8,3,15,52,53,22};
        System.out.println("Bubble Sort: " + Arrays.toString(Sorting.BubbleSort.sort(test_arr,Sorting.ORDER_BY_ASC)));
        


        ///
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(DataStructures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
