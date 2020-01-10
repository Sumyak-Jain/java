//s will only print gaurav and not concat jain because s is only reffred to string gaurav not on gaurav jain
public class string {
    public static void main(String[] args) {
        String s="gaurav";
        s.concat("jain");
        System.out.println(s);
    }
    
}
