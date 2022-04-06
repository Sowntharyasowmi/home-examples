import java.util.Scanner;
public class comparsion {
    public static void main(String[]args){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = scanner.nextInt();
        System.out.println("Enter the second number:");
        int second = scanner.nextInt();
        if (first>second){
            System.out.println( first+" is greater than" +second);
        }
        if (first<second){
            System.out.println( first+" is lessthan" +second);
        }
        if (first>=second){
            System.out.println( first+" is greater than or equal to "+second);
        }
        if (first>=second){
            System.out.println( first+" is less than or equal to"+ second);
        }
        if (first==second){
            System.out.println( first+" is equal to"+ second);
        }
        if (first!=second){
            System.out.println(first+" not equal to"+ second);
        }
    }
}
