package collection;
import java.util.*;
public class linkedlist0 {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("gaurav");
        list.add("jain");
        list.add("devops");
        list.push("hello");
        list.addFirst("first");
        list.addLast("last");
        list.pop();
        Iterator itr=list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
