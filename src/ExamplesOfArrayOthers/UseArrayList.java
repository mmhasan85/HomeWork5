package ExamplesOfArrayOthers;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(29);
        list.add(35);
        list.add(0,40);
        list.add(1,50);
        list.add(2,60);

           System.out.println(list.get(0));
           System.out.println(list.get(1));
           System.out.println(list.get(2));

        for (Integer number:list){
            System.out.println(number);
        }

    }
}



