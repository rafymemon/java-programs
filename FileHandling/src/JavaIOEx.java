import java.io.*;
import java.util.*;

class Student implements Serializable {
    String name;
    String id;
    Student(String name,String id){
        this.name  = name;
        this.id = id;
    }
}


public class JavaIOEx {
    public static void main(String[] args) {
        FileOutputStream fos;
        ObjectOutputStream Oos;

        FileInputStream fis;
        ObjectInputStream Ois;


        Student s1 = new Student("Izhar", "22sw064");
        List<Student> list = new ArrayList<>();
        list.add(s1);


        try {
            fos = new FileOutputStream("file1.db");
            Oos = new ObjectOutputStream(fos);
            Oos.writeObject(s1);

            fis = new FileInputStream("");
            Ois = new ObjectInputStream(fis);
            Ois.readObject();
            Oos.writeObject(s1);

        } catch (Exception E) {
            //TODO : handle Exception
        }
        /*
        try(ObjectInputStream ois = new ObjectInputStream(new FileInoutStream("File2.txt"));){
        Student s2 = (Student)ois.readObject();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInoutStream("File2.txt"));){
        while(true){
        Student s2 = (Student)ois.readObject();
        System.out.println(s2.id);
    }
    }
    catch(Exception e){

    }


         */


    }
}
