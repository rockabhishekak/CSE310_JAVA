

public class upeerwildcard {
    static void print(Box<? extends Number> box) {
        System.out.println("Value: " + box.get());
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        Box<Double> doubleBox = new Box<>(45.67);
        print(intBox);
        print(doubleBox);

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