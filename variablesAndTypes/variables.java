package variablesAndTypes;

import java.util.Arrays;
import java.util.Date;

public class variables {
    public static void main(String[] args) {

        int age = 23;
        double price = 1000.5;
        char score = 'A';
        String name = "seungwoo";
        String[] hobby = new String[] {"독서", "게임", "코딩"};
        Date date = new Date();

        System.out.println(Arrays.toString(hobby));
        System.out.println(date);

    }
}
