package dynamicProgramming;


import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.stream;
import static org.junit.Assert.*;

/**
 * Created by braj on 28/07/19.
 */

public class PermutationTest {
    @org.junit.Test
    public void printPermutation() throws Exception {
        Permutation p = new Permutation();

        p.printPermutation("ABCdef",0,"ABCdef".length()-1);

        Map<Character,Integer> map = new HashMap<Character, Integer>();

        for (Character c:"BALLOON".toCharArray()
             ) {
            map.put(c,0);
        }

        for (Character c:"BALXXOON".toCharArray()
                ) {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
        }
        map.put('L',map.get('L')/2);
        map.put('O',map.get('O')/2);

int min=Integer.MAX_VALUE;
        for (Integer i: map.values()
             ) {
            if(i<min)
                min =i;
        }

        System.out.println(min);
    }

}
