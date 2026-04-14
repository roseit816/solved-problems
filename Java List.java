import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
        
        // 1. Initialize the List
        int n = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        // 2. Process Queries
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String queryType = sc.next();
            if (queryType.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        sc.close();
        
        // 3. Print the Result
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        
    }
}
