package ExamplesOfArrayOthers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseOfHashMap {
    public static void main(String[] args) {
        List<String> cityOfBD = new ArrayList<>();
        cityOfBD.add("Dhaka");
        cityOfBD.add("Barisal");
        cityOfBD.add("Jessore");
        cityOfBD.add("Khulna");

        Map<String,List<String>> listOfCountryNCity = new LinkedHashMap<String, List<String>>();
        listOfCountryNCity.put("BD", cityOfBD);

        for (Map.Entry<String,List<String>> state:listOfCountryNCity.entrySet()){
            System.out.println(state.getKey() +"-->" +state.getValue());
        }


    }

}
