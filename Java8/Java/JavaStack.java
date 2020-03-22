package Java8.Java;

import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());
        }
        
        // Stack<String> stack = new Stack<>();
        // stack.push(stack); 
        // stack.pop(stack); 
		
	}
}
