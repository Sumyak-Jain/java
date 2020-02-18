public class string_convert {
    String funtn(String name){
        String [] st=name.split(" ");
        String str=" ";
        for(int i=0;i<st.length -1;i++){
            str=str+st[i].charAt(0)+".";
        }
        return (str+st[st.length-1]);           
    }
    public static void main(String[] args) {
        String name;
        string_convert obj=new string_convert();
        System.out.println(obj.funtn("gaurav jain"));
    }
    
}
