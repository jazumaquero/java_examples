package com.zcia.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by zuma on 1/09/17.
 */
public final class MyFunctions {
    public static <T> T[] reverseArray(T[] input) {
        T[] x = input.clone();
        Collections.reverse(Arrays.asList(x));
        return x;
    }

    public static String[] upper(String[] input) {
        return Arrays.asList(input)
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }

    public static Map<String,Long> wordCount(String input) {
        return Arrays.asList(input.split("\\s+"))
                .stream()
                .collect(
                        groupingBy(Function.identity(), counting())
                );
    }

    public Double compose(Double input, Function<Double,Double> f1, Function<Double,Double> f2 ) {
        return f1.compose(f2).apply(input);
    }

    public static void printFile(Path path) {
        try {
            Files.lines(path).forEach(w -> System.out.print(w));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class HandleFunction implements Function<String, Double>{
        private final Double DEFAULT = 0.0;

        @Override
        public Double apply(String s) {
            try {
                return Double.valueOf(s);
            } catch (Exception e) {
                return DEFAULT;
            }
        }
    }
}
