import java.util.Scanner;
class Intterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Double p,r,t,a;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        Double k=(1+(r/100));
        a=p*(Math.pow(k,t));
        System.out.format("%.2f",a);
        sc.close();
    }
}