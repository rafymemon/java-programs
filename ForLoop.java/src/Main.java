import java.util.*;
public class Main {
    public static void main(String[] args) {
//        for (int a = 0; a < 11; a++) {
//            System.out.print(a + " ");

//     int i = 0;   WHILE LOOP
//     while(i<11){
//         System.out.println(i);
//         i++;

//          int i = 0;
//         do {
//             System.out.println(i);
//             i++;
//         } while(i<11);
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;

        } System.out.println(sum);
    }
}