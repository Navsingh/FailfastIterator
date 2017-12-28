import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class OddRange {
   public static void main(String args[])
{
     int []oddnumbers =findInRange(3, 9);
     for(int i=0;i<oddnumbers.length;i++)
     {
         System.out.println(oddnumbers[i]);
     }

}
public static int[] findInRange(int l, int r)
{
     int odd[];
    ArrayList<Integer>arrayList = new ArrayList<>();
     for(int i=l;i<=r;i++)
     {
         if(i%2!=0)
         {
             arrayList.add(i);
         }

     }
    odd = new int[arrayList.size()];
     for(int i=0;i<arrayList.size();i++)
     {
         odd[i]=arrayList.get(i);
     }
    return odd;
}

}
