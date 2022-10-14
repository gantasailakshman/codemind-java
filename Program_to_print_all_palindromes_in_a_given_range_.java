import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<n;i++)
        {
            int j = i;
            int sum = 0;
            while(j>0)
            {
                int r =j%10;
                sum =sum*10+r;
                j=j/10;
            }
            if(sum ==i)
            System.out.print(i+" ");
    }
    sc.close();
 }
}