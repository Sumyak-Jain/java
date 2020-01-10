public class eqaual {
    public static void main(String[] args) {
        String s1="gaurav";
        String s2="tyagi";
        String s3=new String ("gaurav");
        String s4="arsh";
        String s5="arsh";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s5);
        System.out.println(s4.compareTo(s5));
        System.out.println(s5.compareTo(s1));
    }
    
}
