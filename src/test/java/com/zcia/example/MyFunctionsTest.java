package com.zcia.example;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zuma on 1/09/17.
 */
public class MyFunctionsTest extends TestCase {

    public void testReverseArray() {
        Integer[] input = {1,2,3};
        Integer[] expected = {3,2,1};
        Integer[] current = MyFunctions.reverseArray(input);
        assertEquals(Arrays.asList(expected),Arrays.asList(current));
    }

    public void testUpperCase() {
        String[] input = {"foo","baR", "tar"};
        String[] expected = {"FOO","BAR", "TAR"};
        String[] current = MyFunctions.upper(input);
        assertEquals(Arrays.asList(expected),Arrays.asList(current));
    }

    public void testWordCount() {
        String input = "When foo is foo";
        Map<String,Long> expected = new HashMap<>();
        expected.put("When",1L);
        expected.put("foo",2L);
        expected.put("is",1L);
        Map<String,Long> current = MyFunctions.wordCount(input);

        assertEquals(expected.size(),current.size());
        for(String word : expected.keySet()) {
            assertEquals(expected.get(word), current.get(word));
        }
    }
}
