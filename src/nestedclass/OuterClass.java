package nestedclass;

public class OuterClass {
    InnerClassA innerA = new InnerClassA();

    public void outermethodA() {
        System.out.println("OuterClassA MethodA");
        innerA.innerAMethodA();
    }

    public void outerMethodB() {
        System.out.println("outerClassA MethodB");

        InnerClassB.innerBMethodA();
    }

    public class InnerClassA{
        public void innerAMethodA () {
            System.out.println("InnerA MethodA");
        }

        private void innerAMethodB () {
            System.out.println("InnerA MethodB");
        }
    }

    public static class InnerClassB {


        public static void innerBMethodA() {
            System.out.println("InnerB MethodA");
        }
    }

}
