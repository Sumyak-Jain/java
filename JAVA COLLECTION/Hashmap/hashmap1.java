package collection;
import java.util.*;
public class hashmap1 {
    public static void main(String[] args){
        HashMap <Integer, String> map=new HashMap<Integer, String>();
        map.put(1,"apple");
        map.put(2,"samsung");
        map.putIfAbsent(3,"oneplus");
        System.out.println("before put all");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap <Integer, String> map1=new HashMap<Integer, String>();
        map1.putAll(map);
        map1.put(4,"nokia");
        map1.remove(3);
        System.out.println("after putt all");
        for(Map.Entry m: map1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }



    }
}
