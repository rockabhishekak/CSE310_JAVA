
public class ex8 {
    public static void main(String[] args)
    {
        Box<Integer> ob = new Box<>(10);
        Box<String> ob2 = new Box<>("Hello World");  
        System.out.println(ob.get());
        System.out.println(ob2.get());

    }
}

class Box<T>{
    T val;
    Box(T val)
    {
        this.val = val;
    }
    T get()
    {
        return val;
    }
}
