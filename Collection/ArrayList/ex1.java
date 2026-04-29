import java.util.ArrayList;
public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrr = new ArrayList<>();
        arrr.add(11);
        arrr.add(18);
        arrr.add(12);
        arrr.add(13);
        arrr.add(14);
        System.out.println(arrr);
        int n= arrr.size();
        // for(int i=0;i<n;++i)
        // {
        //     System.out.println(arrr.get(i)+" ");
        // }

        // for(int e:arrr)
        // {
        //     System.out.println(e+" ");
        // }

        arrr.remove(3);
        arrr.sort((a, b)-> a-b);
        System.out.println(arrr);
    }
}
