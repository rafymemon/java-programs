import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileOutputStream;
import java.io.*;

public class Lab_22Sep {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.bin");
        DataOutputStream dos = new DataOutputStream(fos);

        String s = "Rafy Mustafa";

        byte[] b=s.getBytes();
        dos.writeBytes(s);

        DataInputStream dis = new DataInputStream(new FileInputStream("test .bin"));
        int i=0;
        while((i=dis.read())!=-1) {
            System.out.println((char)i);
        }
    }
}