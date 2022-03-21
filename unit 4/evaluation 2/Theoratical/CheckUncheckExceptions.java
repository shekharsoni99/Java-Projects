
//What is the difference between Checked and Unchecked Exceptions in Java, create a user-defined checked and unchecked exception class?
//Ans: Checked exceptions are caught during compile time while unchecked errors are caught during runtime.

//ques 2: What is the difference between the throw and throws keyword in Java?
//Ans: The throws keyword is used to declare which exceptions can be thrown from the method, while throw keyword is used to throw an exception within a method.

//ques 3: Final is the keyword and access modifier which apply restrictions on class, method, or variable.
//Finally is used in Exception handling in Java, whether the code has expection or not, this block always excute.

import java.util.Scanner;

public class CheckUncheckExceptions{

    public static void main(String[] args) throws error{
        Scanner sc = new Scanner(System.in);

        try {
            String name = sc.next();
        }
        catch (error e) {
            System.out.println(e.getMessage());
        }
    }
}

class error extends Exception{
    public error(String message) throws error{
        message = "Enter valid input";
        error er = new error(message);
        throw er;
    }
}