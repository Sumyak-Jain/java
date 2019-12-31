class fun{
    void function1(){
        System.out.println("hello");
    }
}
public class super1 extends fun {
    void function2 (){
        System.out.println("world");
    }
    void function3(){
        super.function1();
        
    }
    public static void main(String[] args) {
        super1 obj =new super1();
        obj.function3();
        
    }
}
