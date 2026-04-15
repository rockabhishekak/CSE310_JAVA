public class bounded{
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        Box<Double> doubleBox = new Box<>(45.67);
        System.out.println("Integer Box: " + intBox.getValue());
        System.out.println("Double Box: " + doubleBox.getValue());

    }
    
}
class Box <T extends Number> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}