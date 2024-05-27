import java.util.*;
public class FIbonaci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<n)
        {
            sum=a+b;
            a=b;
            b=sum;  
            System.out.print(sum+", ");
            i++;
        }
    }
}