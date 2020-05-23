package algorithm;

import java.util.Arrays;

public class BubbleSort {

    int[] input = {9, 1, 3, 0, 5, 2, 7};
    int[] expected = {0, 1, 2, 3, 5, 7, 9};

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.run();
    }

    public void run(){
        for (int i = 0; i < input.length; i++) {
            boolean isAlreadySorted = true;
            for (int j = 0; j < input.length -1 -i; j++) {

                if (input[j]> input[j+1]){
                    int temp = input[j];
                    input[j] = input[j +1];
                    input[j +1] = temp;
                    isAlreadySorted = false;
                }
            }

            if (isAlreadySorted){
                break;
            }
            
        }

        System.out.println(Arrays.equals(input, expected));
    }

}
