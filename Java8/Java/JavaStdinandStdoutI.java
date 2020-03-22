package Java8.Java;
import java.util.*;

public class JavaStdinandStdoutI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Complete this line
        int b = scan.nextInt();
        // Complete this line
        int c = scan.nextInt();

        System.out.println(a);
        // Complete this line
        System.out.println(b);
        // Complete this line
        System.out.println(c);

        /*
            Scanner sc=new Scanner(System.in);
            while(sc.hasNextInt()){
                int a=sc.nextInt();
                System.out.println(a);
            }
        */
    }
}