package ExamplesOfThisAndFinal;

public class oldCar extends Car {
    public String namePrice;



    public oldCar() {
        super();
    }
    public oldCar(String Name, int price, String namePrice) {
        super(Name, price);
        this.namePrice = namePrice;
        System.out.println(namePrice);
    }

    public void carInfo() {

        System.out.println("old car info");
    }

}
