package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words) {
        int shortestStraw = findShortestWord(words);
        List<String> filteredList = new ArrayList<>();
        for (String s :words) {
            if (s.length() == shortestStraw) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }

    public int findShortestWord(List<String> words){
        int shortestStraw = words.get(0).length();
        for (String s : words) {
            if (s.length() < shortestStraw) {
                shortestStraw = s.length();
            }
        }
        return shortestStraw;
    }
}
