import java.util.Scanner;
class UsernameValidator {
    /*
     * ^           : Start of string
     * [a-zA-Z]    : First character must be a letter
     * [a-zA-Z0-9_]: Remaining characters can be alphanumeric or underscore
     * {7,29}      : Total length is 8 to 30 (1 + 7 to 1 + 29)
     * $           : End of string
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}



public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
