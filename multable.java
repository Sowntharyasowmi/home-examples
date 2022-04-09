import java.util.Scanner;
public class multable {
    public static void main(String[] args) {
        Scanner multable = new Scanner(System.in);
        System.out.println("Input the number is: ");
        int n = multable.nextInt();
        for (int i = 0; i <=10; i++)
        {
            System.out.println(n + "x" + (i+1)  + "=" +  (n * (i+1)));
        }
    }
}