package ExamplesOfArrayOthers;

import java.util.Random;

public class UseArray {
    public static void main(String[] args) {

        Random random = new Random();
        int [] array = new int[40];
        System.out.println("Plz enter numbers: ");
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(50);
        }
        for (int j=0; j<array.length; j++)

            System.out.println("Array index value : " + array[j]);

    }
}



