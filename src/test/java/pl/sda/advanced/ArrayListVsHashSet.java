package pl.sda.advanced;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListVsHashSet {

    static List<Long> list = createList();
    static Set<Long> set = createSet();

    private static List<Long> createList() {
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            result.add((long) i);
        } return result;
    }
    private static Set<Long> createSet() {
        Set<Long> result = new HashSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            result.add((long) i);
        } return result;
    }

    @Disabled
    @RepeatedTest(1000)
    void arrayListContains(){
        list.contains(9_999_999L);
    }

    @Disabled
    @RepeatedTest(1000)
    void hashSetContains(){
        set.contains(9_999_999L);
    }

    @Test
    void removeAll(){
        long l = System.currentTimeMillis();
        List<Long> list = createList();
        Set<Long> set = createSet();
        list.removeAll(set);
        System.out.println(System.currentTimeMillis()-l);


    }

    @Test
    void removeAll2(){
        long l = System.currentTimeMillis();
        List<Long> list = createList();
        List<Long> list2 = createList();
        list.removeAll(list2);
        System.out.println(System.currentTimeMillis()-l);
    }
}

