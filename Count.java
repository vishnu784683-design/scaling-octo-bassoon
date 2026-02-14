public class Count {
   public static void main(String args[])
   {
    int num=12;
    int count=0;
    while(num!=0)
    {
        count++;
        num=num/10;
    }
     System.out.println(count);
   } 
}
