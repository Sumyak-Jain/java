//User-defined class objects in Java ArrayList

package collection;
import java.util.*;
class student{
    String name;
    int rollno;
    student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
public class arraylist1 {
    public static void main(String[] args){
        student s1=new student("gaurav",106);
        student s2=new student("arsh",17);
        ArrayList<student> list =new ArrayList<student>();
        list.add(s1);
        list.add(s2);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            student s=(student)itr.next();
            System.out.println(s.name+" "+s.rollno);
        }



    }

}
