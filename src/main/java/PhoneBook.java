import java.util.*;

public class PhoneBook {
    private final TreeMap<String, String> nameToNumber = new TreeMap<>();
    private final Map<String, String> numberToName = new HashMap<>();

    public int add(String name, String number) {
        if (nameToNumber.containsKey(name)) {
            return nameToNumber.size();
        }
        nameToNumber.put(name, number);
        numberToName.put(number, name);
        return nameToNumber.size();
    }

    public String findByNumber(String number) {
        return numberToName.get(number);
    }
}