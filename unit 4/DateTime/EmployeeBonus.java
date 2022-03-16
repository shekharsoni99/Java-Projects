import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date of Joining in DD-MM-YYYY format");
        String doj = sc.next();

        EmployeeBonus eb = new EmployeeBonus();

        try {
            System.out.println("Your Bonus is: " + eb.method(doj));
        }catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Please enter a valid date");
        }
    }
}

public class EmployeeBonus{
    double method(String input) throws InvalidAge {
        double bonus = 0;

        try {
            LocalDate doj = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate cdate = LocalDate.now();

            Period diff = Period.between(doj, cdate);

            if (diff.getYears() < 0) {
                InvalidAge invalidAge = new InvalidAge("Joining Date should not be in the future");
                throw invalidAge;
            }

            else if(diff.getYears() < 1) {
                System.out.println("Your Experience is: " + diff.getYears());
                bonus = 5000;
            }
            else if(diff.getYears() >= 1 && diff.getYears() < 2) {
                System.out.println("Your Experience is: " + diff.getYears() + " Years");
                bonus = 8000;
            }
            else {
                System.out.println("Your Experience is: " + diff.getYears());
                bonus = 10000;
            }
            return bonus;
        }catch (DateTimeParseException e) {
            InvalidAge invalidAge = new InvalidAge("Please pass the date in correct format");
            throw invalidAge;
        }
    }
}

class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}