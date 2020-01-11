import java.io.FileOutputStream;
import java.io.IOException;
public class file_output {
    public static void main(String[] args) {
        try{
            FileOutputStream fout= new FileOutputStream("C:\\Users\\GAURAV\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
            fout.write(65);
            fout.close();
            System.out.println("over");
        } catch(IOException e){System.out.println(e);
                
    }
    }
}
