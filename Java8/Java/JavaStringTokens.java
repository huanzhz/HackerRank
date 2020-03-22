package Java8.Java;

import java.io.*;
import java.util.*;

public class JavaStringTokens{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] items = s.trim().split("[ !,?.\\_'@]+");
        if (s == null || s.trim().equals("")) {
            System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(items.length);
        }

        for(String item: items){
            System.out.println(item);
        }
        scan.close();
    }
}

