import java.util.*;
class AverageOfSuperElements
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            float c=0,sum=0;
            int N = sc.nextInt();
            ArrayList<Integer>list = new ArrayList<Integer>();
            HashSet<Integer>hash = new HashSet<Integer>();
            for(int i=0; i<N; i++)
            {
                list.add(sc.nextInt());
                hash.add(list.get(i));
            }
            for(int i : hash) 
            {
                if(i == Collections.frequency(list,i))
                {
                    c++;
                    sum = sum + i;
                }
            }
            if(c == 0)
                System.out.print(-1);
            else
            {
                System.out.format("%.2f",sum/c);
            }
            
        sc.close();
    }
}