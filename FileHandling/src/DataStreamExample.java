
import java.io.*;
public class DataStreamExample {
    public static void main(String[] args) throws IOException {
        byte arr[] = {'a','b','c','d','e'};
        InputStream input = new FileInputStream("testout.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+"-");
        }
    }
}