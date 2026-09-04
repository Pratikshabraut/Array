import java.util.Scanner;
public class NewClass1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]={10,20,0,24,0,67};
        int index=0;
        for(int i=0;i<numbers.length;i++)
        {
            
            if(numbers[i]!=0)
            {
               
                numbers[index]=numbers[i];
                index++;
                
            }
           
        }
         while(index<numbers.length)
            {
                numbers[index]=0;
                index++;
            }
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
