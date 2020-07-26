package tn.zelda.projects.java8.samples.optional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zelda on 17/07/17.
 */
public class Test {
    public static int findBiggestSum(List<Integer> list) {
        int maxSum = 0;
        for( int i = 0; i < list.size() ; i++) {
            for( int j = i+1; j < list.size() ; j++) {
                int sum = list.get(i) + list.get(j);
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 5, 9, 7, 11);
        System.out.println(findBiggestSum(list));
    }
}
