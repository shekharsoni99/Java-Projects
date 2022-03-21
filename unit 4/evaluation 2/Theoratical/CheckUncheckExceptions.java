
//What is the difference between Checked and Unchecked Exceptions in Java, create a user-defined checked and unchecked exception class?
//Ans: Checked exceptions are caught during compile time while unchecked errors are caught during runtime.

//ques 2: What is the difference between the throw and throws keyword in Java?
//Ans: The throws keyword is used to declare which exceptions can be thrown from the method, while throw keyword is used to throw an exception within a method.

//ques 3: Final is the keyword and access modifier which apply restrictions on class, method, or variable.
//Finally is used in Exception handling in Java, whether the code has expection or not, this block always excute.


import java.util.Scanner;


//Checked Exception
public class CheckUncheckExceptions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = 6;
        int y = 0;
        
        try {
            int z = x/y;
            System.out.println(z);
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}


//unchecked exception:

//public class CheckUncheckExceptions{
//    public static void main(String[] args) throws error{
//        Scanner sc = new Scanner(System.in);
//
//        int x = 6;
//        int y = 0;
//
//        System.out.println(z);
// 
//    }
//}
