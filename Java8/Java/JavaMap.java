package Java8.Java;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> phonebook = new HashMap<>();

		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();            
            phonebook.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phonebook.containsKey(s)) //if exists
                System.out.println(s + "=" + phonebook.get(s));
            else
                System.out.println("Not found");
		}
    }
    /*
            class Solution {
            public static void main(String [] args) throws Exception {
                // Read input and save as entries in a HashMap 
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.valueOf(br.readLine());
                HashMap<String, Integer> map = new HashMap<>();
                while (n-- > 0) {
                    String name = br.readLine();
                    int phone   = Integer.valueOf(br.readLine());
                    map.put(name, phone);
                }
                
                // Read each query and check if its in our HashMap 
                String s;
                while((s = br.readLine()) != null) {
                    if (map.containsKey(s)) {
                        System.out.println(s + "=" + map.get(s));
                    } else {
                        System.out.println("Not found");
                    }
                }
                
                br.close();
            }
        }
    */
}



