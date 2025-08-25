import java.util.TreeMap;

public class PhoneBook {
    private final TreeMap<String, String> nameToNumber = new TreeMap<>();

    public int add(String name, String number) {
        if (nameToNumber.containsKey(name)) {
            return nameToNumber.size();
        }
        nameToNumber.put(name, number);
        return nameToNumber.size();
    }
}