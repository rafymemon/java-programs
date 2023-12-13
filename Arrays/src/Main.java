//public class Main {
//    public static void main(String args[]){
//        String [] cars={"BMW","benz","Toyota"};
//        for (int i=0;i< cars.length;i++){
//            System.out.println(cars[i]);
//        }
//}
//        }
//import java.util.*;
//public class Main {
//    public static void main(String args[])
//
//    {int []marks=new int[4];
//       // String[] marks;
//        //for(int i=0; i<=marks.length;i++){
//        marks[0]=98;
//        marks[1]=97;
//        marks[2]=87;
//        marks[3]=93;
//        for (int i = 0; i<4; i++) {
//
//            System.out.println(marks[i]);
//        }
//    }
//}
//
//import java.util.*;
//public class Main {
//    public static void main(String args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//        for (int i = 0; i < size; i++) {
//        }
//    }
//}
//
//import java.util.*;
//public class Main {
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int number[]=new int[size];
//        //for input-->
//        for (int i=0;i<size;i++){
//            number[i]=sc.nextInt();
//            //for output-->
//        }  for (int i=0;i<size;i++){
//            System.out.println(number[i]);
//        }
//    }
//}

//Finding index of the x
import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }  int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==x){
                System.out.println("X found at index :" +i);
            }
        }
    }
}