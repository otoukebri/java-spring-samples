package tn.zelda.projects.java8.samples.lambda;

import tn.zelda.projects.java8.samples.Converter;

/**
 * Created by zelda on 15/01/17.
 */
public class LambdaScope {
    public static void main(String[] args) {
        //final is not mandatory
        int num = 1;
            Converter<Integer, String> stringConverter = (from) -> {
            return String.valueOf(from+ num) ;
        };
        stringConverter.convert(2);     // 3
        System.out.println("response >> " + stringConverter.convert(2));

        Converter<Integer, String> stringConverter2 =
                (from) -> String.valueOf(from + num);
        //num = 3;
    }
}
