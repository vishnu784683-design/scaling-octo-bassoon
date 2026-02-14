import java.util.Scanner;
public class Armstrong{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int digit=temp%10;
            sum=sum+digit*digit*digit;
            temp=temp/10;
        }
        if(num==sum)
        {
            System.out.println("it is a Armstrong");
        }
        else{
            System.out.println("it is not a Armstrong");
        }
    }
}