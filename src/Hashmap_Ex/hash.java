package Hashmap_Ex;

import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("Jays", 29);
        data.put("Raj", 53);

        if(data.containsKey("Jays")){
            System.out.println("Value of Jaysu is : " + data.get("Jays"));
        }
        else {
            System.out.println("Not available");
        }
    }
}
