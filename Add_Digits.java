import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        if (num%9==0)
            System.out.println("9");
            else
            System.out.println(num%9);
            sc.close();
        
    }
}