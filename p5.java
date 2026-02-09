package COLLECTIONS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p5 {
    public static void main(String[] args) {
        //iteration on collections
        List<String> l1 = new ArrayList<>();
        l1.add("abhi");
        l1.add("anoop");
        l1.add("shayana");
        l1.add("varuni");
        //1st approch
        l1.get(1);
        //2nd we use for each loop or enhance
        for(String user:l1)
        {
            System.out.println(user);
        }
        //3rd method using for loop
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
//4th using iterator
        Iterator<String> it = l1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
            if(it.next().equals("shayana"))
            {
                it.remove();
            }
        }
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
