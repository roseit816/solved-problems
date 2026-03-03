import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
        Map<String,Integer> phn=new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phn.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phn.containsKey(s)){
                System.out.println(s+"="+phn.get(s));
            }
            else{
                System.out.println("Not found");
            }
            }
		}
	}




