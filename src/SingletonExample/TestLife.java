package SingletonExample;

public class TestLife {
    public static void main(String[] args) {
        Life house1 = Life.getSingleton().get(0);
        house1.displayHouseDim();
        Life house2 = Life.getSingleton().get(1);
        house2.displayHouseDim();
        Life house3 = Life.getSingleton().get(2);

        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());


    }
}