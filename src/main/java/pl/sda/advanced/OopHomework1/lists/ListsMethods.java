package pl.sda.advanced.OopHomework1.lists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsMethods {

    // Utwórz metodę, która przyjmuje listę (List) np. ArrayList
    // elementów typu String a następnie zwrca listę w odwróconej kolejności.
    public static List<String> arrayList(){
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        String fourth = scanner.nextLine();

        arrayList().add(first);
        arrayList().add(second);
        arrayList().add(third);
        arrayList().add(fourth);
        return arrayList().stream()
                .collect(Collectors.toList());
    }
}
