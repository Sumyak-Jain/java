class over{
    void fun(){
        System.out.println("2019 over");
    }
}
public class overriding extends over {
    void fun(){
        System.out.println("welcome 2020");
    }
    public static void main(String[] args) {
        overriding obj=new overriding();
        over obj1 =new over();
        obj.fun();
        obj1.fun();
    }
    
}
