import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read the number of test cases
        if (in.hasNextLine()) {
            int testCases = Integer.parseInt(in.nextLine());
            
            while (testCases > 0 && in.hasNextLine()) {
                String pattern = in.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (PatternSyntaxException e) {
                    System.out.println("Invalid");
                }
                testCases--;
            }
        }
        in.close();
    }
}
