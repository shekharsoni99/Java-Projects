import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TimeDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Date of Birth in dd/mm/yyyy format");
            String dob = sc.next();

            AgeCheck ac = new AgeCheck(dob);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class AgeCheck {
    public AgeCheck(String input) throws Invalid {

        FormatCheck formatCheck = new FormatCheck();

        if (!formatCheck.FormatCheck(input)){
            Invalid invalid = new Invalid("please pass the date in the proper format");
            throw invalid;
        }
        LocalDate cdate = LocalDate.now();

        LocalDate age1 = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period age = Period.between(age1, cdate);

        if (age.getYears() < 0) {
            System.out.println("Date of birth should not be in future");
        }
        else {
            System.out.println("Your age is: " + age.getYears());
        }
    }
}

class Invalid extends Exception {
    public Invalid(String message) {
        super(message);
    }
}

class FormatCheck{
    public boolean FormatCheck(String str) {
        return Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", str);
    }
}