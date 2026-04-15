public class lowerwildcard {
    static void print(Box<? super Integer>obj) {
        System.out.println("Value: " + obj.get());
    }
    public static void main(String[] args) {
        Box<Number> numberBox = new Box<>(45.67);
        print(numberBox);
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
