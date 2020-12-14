package be.zelda.samples.pattern_matching_instanceof;

public class OMIOF {

    public static void main(String[] args) {
        Object o  =  "";

        // before
        /*
        if (o instanceof String) {
            String s = (String)o;
            System.out.println(s.toUpperCase());
        }
        */

        // java 15
        if (o instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
