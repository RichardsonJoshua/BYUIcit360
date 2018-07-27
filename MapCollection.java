import java.util.HashMap;


public class MapCollection {
    public static void main(String[] args) {
    

        // creating a HashMap with a variable types of Strings for keys and values
        HashMap map1 = new HashMap();
        map1.put("key1", "Alpha");
        map1.put("key2", "Beta");
        map1.put("key3", "Gamma");
        map1.put("key4", "Delta");
        System.out.println(map1);

        // get the value for any key
        System.out.println(map1.get("key3"));
        
        // remove key3 from the HashMap
        map1.remove("key3");
        System.out.println(map1);

        // display the value of each key using a loop
        map1.values().forEach((s) -> {
            System.out.println(s);
        });
        
        //add a new key
        map1.put("key5", "Epsilon");

        // display the keys and their values using a loop
        map1.entrySet().forEach((s) -> {
            System.out.println(s);
        });

        

    }
}
