package Task29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class task30 {
    public static void main(String[] agrs){
        ArrayList<Integer> list=new ArrayList<Integer>(20);
        for(int i=0;i<20;i++){
            Integer number=(int)(Math.random()*10+1);
            list.add(i,number);
        }
        System.out.println(list);
        Set<Integer> set = new LinkedHashSet<Integer>(list);
        System.out.println(set);
    }
}
