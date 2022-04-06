import java.util.*;
public class decimal {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of decimal number: " );
        int decimal = Scanner.nextInt();
        String binary="" ;
      int t=4;
      while(decimal>0)
      {
            int rem = decimal%2;
            binary = rem+binary;
            decimal = decimal/2;
        }
        System.out.println("Binary equivalent of" +4+ "is" +decimal);
    }
}
