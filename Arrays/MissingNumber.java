import java.util.Scanner;
public class NewClass1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int []numbers=new int[n-1];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
        int expectedSum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<numbers.length;i++)
        {
            actualsum+=numbers[i];
        }
        int missing=expectedSum-actualsum;
        System.out.println(+missing);
    }
}
