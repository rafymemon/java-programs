//import java.util.*;
//public class Main{
//////    public static void printMyName(String name){
//////            System.out.println(name);
//////            return;
//////        }
//////        public static void main(String args[]){
//////            Scanner sc = new Scanner(System.in);
//////            String name = sc.next();
//////            printMyName(name);
//////
////
////////////////////////FOR SUM////////////
//////    public static int calculateSum(int a, int b){
//////        int sum = a+b;
//////        return sum;
//////    }
//////////////////////FOR PRODUCT/////////
////    public static int calculateProduct(int a, int b){
////        //int product = a*b;
////        return a*b;
////    }
////    public static void main(String args[]){
////        Scanner sc= new Scanner(System.in);
////        System.out.println("-------CALCULATING SUM OF NUMBERS-------");
////        System.out.println("Enter the first number");
////        int a = sc.nextInt();
////        System.out.println("Enter the Second number");
////        int b = sc.nextInt();
////
////        //int sum = calculateSum(a,b);
////        //System.out.println("Sum of two numbers is : "+sum);
////        System.out.println("The product of two numbers are :"+calculateProduct(a,b));
//
//
//
//    public static void printFactorial(int n){
//        if(n<=0){
//            System.out.println("invalid number");
//            return;
//        }
//        int factorial = 1;
//        for (int i=n; i>=1;i--){
//            factorial = factorial*i;
//        }
//        System.out.println(factorial);
//        return;
//    }
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number to find the factorial");
//        int n=sc.nextInt();
//        System.out.print("Factorial of the given number is :");
//        printFactorial(n);
//    }
//}

///////////////////////////PERCENTAGE//////
//import java.util.*;
//public class Main{
//    public static int printPercentage(int a,int b,int c){
//
//        return (a+b+c)/3;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int a=sc.nextInt();
//        System.out.println("Enter the second number");
//        int b=sc.nextInt();
//        System.out.println("Enter the third number");
//        int c=sc.nextInt();
//
//
//        System.out.println("percentage of the given numbers is:"+printPercentage(a,b,c));
//    }
//}

///////////////////SUM OF ODD NUMBERS FROM 1 TO N
//import java.util.*;
//public class Main{
//    public static int printOddNumbers(int n){
//
//         int sum=0;
//        for (int i=1;i<=n;i+=2){
//            sum+=i;
//        }
////        System.out.println(sum);
//        return sum;
//
//    }
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the n value");
//        int n=sc.nextInt();
//        System.out.println("Sum of odd number between n are:"+printOddNumbers(n));
//

//////////////////////////PRINT THE GREATEST ONE////////////////
//import java.util.*;
//public class Main {
//    public static int printGreater(int a,int b){
//        if (a!=b||a>b){
//            return a;
//        }   else {
//           return b;
//
//        }
//    }
//    public static void  main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the first number:");
//        int a=sc.nextInt();
//        System.out.print("Enter the second number:");
//        int b=sc.nextInt();
//
//        System.out.println("The greater number from these two numbers are:"+printGreater(a,b));
//    }
//}


