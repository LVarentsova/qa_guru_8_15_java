package guru.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Basic");
        list.add("C++");
        list.add("Python");
        list.add("SQL");

        System.out.println("list после инициализации " + list);

        list.remove(3);
        System.out.println("list после удаления элемента с index = 3 " + list);

        Collections.sort(list);
        System.out.println("list отсортированный по алфавиту " + list);

        Collections.reverse(list);
        System.out.println("list отсортированный по алфавиту в обратном порядке " + list);
    }
}
