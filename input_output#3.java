import java.io.*;
public class buffred_outputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout=new FileOutputStream("C:\\Users\\GAURAV\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
      byte b[]={65,66,67,68,69,70};
      bout.write(b);
      bout.flush();
      fout.close();
      bout.close();
    }
    
}
