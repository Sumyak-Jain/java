package collection;
import java.util.*;
public class hashmap0 {
    public static void main(String[] args){
        HashMap <Integer, String> map=new HashMap<Integer, String>();
        map.put(1,"arsh");
        map.put(2,"gaurav");
        map.put(2,"arsh");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        
    }
}
