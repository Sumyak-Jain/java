import java.io.*;
public class buffered_writer {
    public static void main(String[] args) throws Exception{
        FileWriter writerss=new FileWriter("C:\\Users\\GAURAV\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
        BufferedWriter buff=new BufferedWriter(writerss);
        buff.write("hello peeps");
        buff.close();
        System.out.println("done");
    }   
}
