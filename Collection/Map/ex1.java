import java.util.*;

import java.util.HashMap;

public class ex1 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(10, "Abhishek");
        m.put(10, "Abhi");//overwrite the abhishek 
        m.put(9, "Ab");
        // System.out.println(m.get(10));


        // for(Map.Entry<Integer,String> e:m.entrySet())
        // {
        //     System.out.println(e.getKey()+ " "+ e.getValue());
        // }


        // for(Integer e:m.keySet())
        // {
        //     System.out.println(e+" "+m.get(e));
        // }


        m.forEach((k,v) -> {
            System.out.println(k+" "+v);

        }); 

    }
}
