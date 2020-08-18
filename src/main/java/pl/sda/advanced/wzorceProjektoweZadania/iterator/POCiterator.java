package pl.sda.advanced.wzorceProjektoweZadania.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class POCiterator {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("kot");
        words.add("pies");
        words.add("dom");

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()){
            String word = iterator.next();
            System.out.println(word);
            if (word.equals("pies")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
