package tn.zelda.projects.java8.samples.string;

public class StringJoin {
 
    public static void main(String[] args) {
 
        String str1 = "Hello";
        String str2 = "World";
        
        //Using join() method added in JDK 8
 
        String joinedString = String.join(" ", str1, str2);
        System.out.println(joinedString);
    }
 
}
 