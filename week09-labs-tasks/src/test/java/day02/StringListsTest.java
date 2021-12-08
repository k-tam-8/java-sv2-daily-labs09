package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {
    @Test
    void testFindShortestWordMethod() {
        List<String> words = Arrays.asList("aaaa","bbbbb","cccccccc","aaaa");
        StringLists sl = new StringLists();
        assertEquals(4, sl.findShortestWord(words));
    }

    @Test
    void testFindShortestWords() {
        List<String> words = Arrays.asList("aaaa","bbbbb","cccccccc","aaaa", "bbbb");
        StringLists sl = new StringLists();
        assertEquals(3,sl.shortestWords(words).size());
    }
}