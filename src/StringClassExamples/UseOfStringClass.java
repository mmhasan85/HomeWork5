package StringClassExamples;

public class UseOfStringClass {

    public static void main(String[] args) {
        String st = "I love Bangladesh";
        String st1 = "I hate Bangladesh";

        System.out.println(st.indexOf(1));
        System.out.println(st.charAt(4));
        System.out.println(st1.toLowerCase());
        System.out.println(st1.toLowerCase());
        System.out.println(st.isEmpty());
        System.out.println(st.chars());
        System.out.println(st.codePointAt(2));
        System.out.println(st1.indexOf("love"));
        System.out.println(st.codePointBefore(6));
        System.out.println(st.indexOf(0));
        System.out.println(st.concat("people"));
        System.out.println(st.hashCode());
        System.out.println(st.codePointAt(1));
        System.out.println(st.compareTo("st, st1"));
        System.out.println(st.contains("l"));
        System.out.println(st.intern());
        System.out.println(st.getBytes());
        System.out.println(st.endsWith("h"));
        System.out.println(st.equals("st,st1"));
        System.out.println(st.matches("st"));
        System.out.println(st.startsWith("I"));
        System.out.println(st.toCharArray());
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.compareToIgnoreCase("o"));
        System.out.println(st.split("love"));
        System.out.println(st1.split("hate"));
        System.out.println(st.toCharArray());
        System.out.println(st1.startsWith("I"));

    }

}
