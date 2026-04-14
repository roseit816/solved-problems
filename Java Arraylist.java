import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
    int num1=in.nextInt();
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    for(int i=0;i<num1;i++){
        int n=in.nextInt();
        ArrayList<Integer> row = new ArrayList<>();
        for(int j=0;j<n;j++){
            row.add(in.nextInt());
        }
        matrix.add(row);
    }
    int disp=in.nextInt();
    for(int i=0;i<disp;i++){
        int x=in.nextInt()-1;
        int y=in.nextInt()-1;
        if(x<matrix.size() && y< matrix.get(x).size()){
            System.out.println(matrix.get(x).get(y));
        }
        else{
            System.out.println("ERROR!");
        }

    }
    in.close();

    }
}
