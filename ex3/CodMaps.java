package ex3;

import java.util.HashMap;
import java.util.Map;

public class CodMaps {
    private static final Map<Character, Character> tabCod = createTabCod();
    private static final Map<Character, Character> tabDeCod = createTabDeCod();

    private static Map<Character, Character> createTabCod() {
        Map<Character, Character> map = new HashMap<>();
        map.put('a', '@');
        map.put('e', '#');
        map.put('i', '!');
        map.put('o', '$');
        map.put('u', '%');
        return map;
    }

    private static Map<Character, Character> createTabDeCod() {
        Map<Character, Character> map = new HashMap<>();
        map.put('@', 'a');
        map.put('#', 'e');
        map.put('!', 'i');
        map.put('$', 'o');
        map.put('%', 'u');
        return map;
    }

    public static Map<Character, Character> getTabCod() {
        return tabCod;
    }

    public static Map<Character, Character> getTabDeCod() {
        return tabDeCod;
    }
}
