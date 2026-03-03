import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String y="Yes";
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i))
            y="No";
        }
        System.out.println(y);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
