package tn.zelda.projects.java8.samples.lambda;

import tn.zelda.projects.java8.samples.Converter;

class AccessFields {
    static int outerStaticNum;
    int outerNum =1;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        stringConverter1.convert(2);
        System.out.println("outerNum >> " + outerNum);
        System.out.println("outerStaticNum >> " + outerStaticNum);

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        stringConverter2.convert(14);
        System.out.println("outerNum v2 >> " + outerNum);
        System.out.println("outerStaticNum v2 >> " + outerStaticNum);

    }

    public static void main(String[] args) {
        new AccessFields().testScopes();
    }
}