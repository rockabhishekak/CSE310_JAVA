public class Counter {
    public static void main(String[] args){
    // Normal obj = new Normal();
    Normal.fun();
    System.out.println(Normal.count);        
        
    }
};
class Normal{
    static int count = 0;
    static void fun()
    {
        count++;
    }
    
};
