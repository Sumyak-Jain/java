package collection;
import java.util.*;
public class arraylist0 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("gaurav");
        list.add("jain");
        list.add("devops");

       /** Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        **/

       /**for(String data:list){
           System.out.println(data);
        }
        **/

        /**
        System.out.println(list.get(1));
       list.set(2,"branch devops");
       System.out.println(list);
         **/

        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(2);
        list2.add(5);
        list2.add(1);
        list2.add(9);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println(list2.isEmpty());



    }

}




