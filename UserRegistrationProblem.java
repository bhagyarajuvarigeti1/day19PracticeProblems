import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationProblem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Name");
        String firstName = in.nextLine();
        Pattern pattern1 = Pattern.compile("[A-Z]{1}[a-z]");
        Matcher matcher1 = pattern1.matcher(firstName);
        if(matcher1.matches()){
            System.out.println("Valid First Name");
        }
        else System.out.println("Not valid");
        System.out.println("Enter last Name");
        String lastName = in.nextLine();

        Matcher matcher2 = pattern1.matcher(lastName);
        if(matcher2.matches()){
            System.out.println("Valid Last Name");
        }else System.out.println("Not valid");
        System.out.println("Enter the User Email");
        String gmail = in.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(gmail);
        if(matcher.matches()){
            System.out.println("vaild");
        }
        else System.out.println("not Valid");
        System.out.println("Enter Phone Number ");
        String phoneNO = in.nextLine();
        Pattern pattern2 = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
        Matcher matcher3 = pattern2.matcher(phoneNO);
        if(matcher3.matches()){
            System.out.println("valid phone number");
        }
        else{
            System.out.println("Not a valid Phone number");
        }
        System.out.println("Enter Password");
        String password = in.nextLine();
        Pattern pattern3 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher4 = pattern3.matcher(password);
        if(matcher4.matches()){
            System.out.println("valid password");
        }
        else System.out.println("not valid password");
    }
}
