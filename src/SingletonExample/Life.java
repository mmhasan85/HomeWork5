package SingletonExample;

import java.util.ArrayList;
import java.util.List;

public class Life {
    private  Life (){}

    private static Life house1 = new Life();
    private static Life house2 = new Life();
    private static List<Life> houseList = new ArrayList<Life>();
    public static  List<Life> getSingleton(){
        houseList.add(house1);
        houseList.add(house2);
        return houseList;
    }
    public void displayHouseDim(){
        System.out.println("100 by 100");
    }
}


