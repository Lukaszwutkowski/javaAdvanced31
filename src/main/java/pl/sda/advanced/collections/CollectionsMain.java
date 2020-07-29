package pl.sda.advanced.collections;

import pl.sda.advanced.oop2.Countries;
import pl.sda.advanced.oop2.Person;
import pl.sda.advanced.oop2.Student;
import pl.sda.advanced.oop2.Worker;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsMain {

    private static String text1 = "Napis 1";
    private static String text2 = "Napis 2";
    private static String text3 = "Napis 3";
    private static String text4 = "Napis 4";
    private static String text5 = "Napis 5";
    private static String text6 = "Napis 6";
    private static String text7 = "Napis 7";
    private static String text8 = "Napis 8";

    private static Student student = new Student("Jan", "Nowak", BigDecimal.valueOf(200), Countries.POLAND);
    private static Worker worker = new Worker("Pawel", "Kowalski", BigDecimal.valueOf(5000), Countries.POLAND);

    private static Plane first = new Plane("Boeing", 12, 123);
    private static Plane second = new Plane("Boeing", 12, 123);
    private static Plane third = new Plane("Airbus", 15, 124);


    public static void main(String[] args) {

        arrayList();
        peopleArrayList();
        hashSetBasic();
        planeHashSet();
        treSetBasic();
        planeTreeSet();
        planeHashMap();

        List<String> strings = Arrays.asList(text1, "text22", text2, text3, text4);
        List<String> collect = strings.stream()
                .filter(e -> e.contains("2"))
                .collect(Collectors.toList());
        System.out.println(collect);


    }

    private static void planeHashMap() {
        HashMap<Integer, Plane> planesHashMap = new HashMap<>();
        System.out.println(planesHashMap.put(first.getPlaneID(), first));
        System.out.println(planesHashMap.put(second.getPlaneID(), second));
        System.out.println(planesHashMap.put(third.getPlaneID(), third));
        System.out.println(planesHashMap.size());
    }

    private static void planeTreeSet() {
        Set<Plane> planes = new TreeSet<>();
        planes.add(first);
        planes.add(second);
        planes.add(third);
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    private static void treSetBasic() {
        Set<String> treeSet = new TreeSet<>(); // Sortuje dodawane elementy wedlug ustalonej klasy i metody compareTo w tej klasie
        treeSet.add(text3);
        treeSet.add(text1);
        treeSet.add(text5);
        treeSet.add(text4);
        treeSet.add(text3);
        System.out.println(treeSet.size());
        for (String element : treeSet) {
            System.out.println(element);
        }
    }

    private static void planeHashSet() {
        Set<Plane> planes = new HashSet<>();

        planes.add(first);
        planes.add(second);
        planes.add(third);
        System.out.println(planes.size());

        System.out.println(first.equals(third));
        System.out.println(first.equals(second));
    }

    private static void hashSetBasic() {
        Set<String> hashSet = new HashSet<>();
        System.out.println(hashSet.add(text1));
        System.out.println(hashSet.add(text1));
        System.out.println(hashSet.add(text3));
        System.out.println(hashSet.add(text2));
        System.out.println(hashSet.size());
    }

    private static void peopleArrayList() {
        List<Person> people = new ArrayList<>();
        people.add(student);
        people.add(worker);
        people.add(worker);

        for (Person person : people) {
            System.out.println(person.getLastName());
        }

        System.out.println(people.get(1));
    }

    private static void arrayList() {


        List<String> arrayList = new ArrayList<>();
        arrayList.add(text1);
        arrayList.add(text4);
        arrayList.add(text2);
        arrayList.add(text3);

        System.out.println(arrayList);

        for (String text : arrayList) {
            System.out.println(text);
        }

        List<String> secondArrayList = new ArrayList<>();


        secondArrayList.add(text5);
        secondArrayList.add(text6);
        secondArrayList.add(text7);
        secondArrayList.add(text8);

        List<String> thirdArrayList = new ArrayList<>();

        thirdArrayList.addAll(arrayList);
        thirdArrayList.addAll(secondArrayList);

        System.out.println(thirdArrayList);

        thirdArrayList.addAll(arrayList);
        thirdArrayList.addAll(secondArrayList);
        System.out.println(thirdArrayList);

        System.out.println(thirdArrayList.contains(text6));

        thirdArrayList.remove(text6);

        System.out.println(thirdArrayList.contains(text6));
    }
}
