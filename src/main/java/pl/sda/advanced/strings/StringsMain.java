package pl.sda.advanced.strings;

import java.util.Arrays;

public class StringsMain {
    private static String text = "12  , Adam, 1200";

    public static void main(String[] args) {

        String[] split = text.split(",");
        for (String s : split) {
            System.out.println(s.trim());
        }

        text.split("\\W+");
        for (String s : split) {
            System.out.println(s);
        }

        Arrays.stream(split)
                .skip(',');

        System.out.println(Arrays.toString(split));

    }
}
