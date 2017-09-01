package com.zcia.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
    public static boolean hasConsecutive(List<Long> input) {
        if(input.size() >1) {
            Long previous = input.get(0);
            for(int i =1 ; i<input.size(); i++) {
                Long current = input.get(i);
                if(current.equals(previous)) return true;
                previous = current;
            }
        }
        return false;
    }
    public static void main( String[] args )    {
        List<Long> input =Arrays.asList(args)
                .stream()
                .map(s -> Long.valueOf(s))
                .collect(Collectors.toList());
        if(hasConsecutive(input)) {
            System.out.println( "'Snap'" );
        }
    }
}
