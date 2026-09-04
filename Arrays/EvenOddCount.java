import java.util.Scanner;
public class NewClass1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the numbers");
        int even=0;
        int odd=0;
        
        for(int i=0;i<n;i++)
        {
             int numbers=sc.nextInt();
            if(numbers%2==0)
            {
             even++; 
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
