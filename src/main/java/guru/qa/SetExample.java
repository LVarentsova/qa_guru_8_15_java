package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> browserHashSet = new HashSet<>();

        browserHashSet.add("Chrome");
        browserHashSet.add("FireFox");
        browserHashSet.add("Opera");
        browserHashSet.add("Safari");

        System.out.println("Размер browserHashSet до удаления = " + browserHashSet.size());
        for (String element : browserHashSet) {
            System.out.println(element);
        }

        browserHashSet.remove("Safari");

        System.out.println("Размер browserHashSet после удаления = " + browserHashSet.size());
        for (String element : browserHashSet) {
            System.out.println(element);
        }

        System.out.println("Содержит browserHashSet 'Safari'? " + browserHashSet.contains("Safari"));
        System.out.println("Содержит browserHashSet 'Opera'? " + browserHashSet.contains("Opera"));
    }
}
