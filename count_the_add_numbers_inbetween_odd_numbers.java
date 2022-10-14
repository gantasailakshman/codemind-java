import java.util.*;
class CountTheOddNumbersInBetweenTwoOddNumbers
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int c = 0;
            ArrayList<Integer>list1 = new ArrayList<Integer>();
            for(int i=0; i<N; i++)
                list1.add(sc.nextInt());
            for(int i=1; i<N-1; i++)
            {
                if((list1.get(i-1)%2 != 0 && list1.get(i+1)%2!=0) || (list1.get(i-1)%2 != 0 && list1.get(i+1)%2!=0))
                {
                    if(list1.get(i) % 2 != 0)
                        c++;
                }
            }
            System.out.print(c);
        sc.close();
    }
}