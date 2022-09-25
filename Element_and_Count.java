import java.util.*;
class ElementAndCount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int i=0; i<N; i++)
            list.add(sc.nextInt());
        ArrayList<Integer>list1 = new ArrayList<Integer>();
        for(int i : list)
        {
            if(!list1.contains(i))
                list1.add(i);
        }
        for(int i : list1)
            System.out.print(i + " " + Collections.frequency(list,i) +" ");
        sc.close();
    }
}