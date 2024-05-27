import java.util.Scanner;

public class PostiveNegativeArray
{
    public static void main(String[] args) 
    {int temp=0;
        System.out.println("--> Enetr your array size: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int [size];
        System.out.println("--> Enter your element: ");
        for(int i=0;i<size;i++)
        {
            a[i] =s.nextInt();
        }
        System.out.print("--> Your eneterd Array: ");
        for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println("Sorted array: ");
            for(int i=0;i<a.length;i++)
            {
                for(int j=1;j<a.length;j++)
                {
                    if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;}
                    // else{
                    //     System.out.println(a[i]+" ");
                    // }
                }
                }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}