package Java8.Java;

import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    
        /*
        boolean flag=true;
        for(int i=0;i<A.length()/2 && flag==true;i++)
        {
            if(Character.valueOf(A.charAt(i)).compareTo(Character.valueOf(A.charAt(A.length()-i-1)))!=0){               
                flag=false;            
            }
        }
            System.out.print((flag==true ? "Yes" :"No"));
        */
    }
}



