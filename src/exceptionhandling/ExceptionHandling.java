package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num = 10;
        try {
            int result = num / 0;
            System.out.println(result);

        } catch (Exception ex) {
            System.out.println("Not a valid Math");
        }
        System.out.println("I was abe to come to this point");
    }

}
