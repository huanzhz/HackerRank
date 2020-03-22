package Java8.Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==0)
                throw  new ArithmeticException("/ by zero");
            else
                System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}