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
        
    }
}
