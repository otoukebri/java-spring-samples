/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.zelda.projects.java8.samples;

/**
 *
 * @author o.TOUKEBRI
 */
public class LambdaScope {
    public static void main(String[] args) {
        final int num = 1;
Converter<Integer, String> stringConverter =
        (from) -> String.valueOf(from + num);

stringConverter.convert(2);
    }
}
