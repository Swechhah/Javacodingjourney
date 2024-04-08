package day7;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The program below uses nested loops to sort the elements of an array into ascending order
 *  */
public class SortingAlgorithm {
    /**
     *The main method is used to initialize the bubblesort and define the array necessary.
     * @param args
     */
    public static void main(String []args) {
        //an object is created for the class to access the method
        SortingAlgorithm sort = new SortingAlgorithm();
        //array is defined in the main method
        int[] A = {9,7,1,4,3,6};
        sort.bubbleSort(A);

    }

    /**
     *The method uses a combination of nested loops and conditions to sort through the array
     * Bubble sort works by sorting through the elements until the end of list is reached when the process begins again until there are no elements remaining out of order.
     * @param array
     */
    void bubbleSort(int[] array){// has array as the input
        //defining teh length of the array
        int lengthOfArray  = array.length;
        for (int i = 1; i < lengthOfArray; i++) {//the loop is executed and covers the entire array
            for (int j = 0; j<lengthOfArray-1; j++){//the inner loop is executed to sort through the array
                if( array[j]>array[j+1]){//if the element ahead is greater the positions are swapped
                    int tempint = array[j];//storing element int o temporary variable
                    array[j] = array[j+1];//swapping the greater and smaller elements
                    array[j+1] = tempint;// assigning th greater element to the back of the lopp

                }
            }
        }
        //the swapped array is then printed
        System.out.println(Arrays.toString(array));
    }
}
