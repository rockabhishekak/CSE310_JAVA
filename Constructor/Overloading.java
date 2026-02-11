class Add{
    float add(float a, float b)
    {
        return a+b;
    }
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b,int c)
    {
        return a+b+c;
    }
}
class Overloading {
    public static void main(String[] args)
    {
        Add obj1 = new Add();
        Add obj2 = new Add();
        Add obj3 = new Add();
        int result = obj1.add(4,5);
        float result2 = obj2.add(4.4f,9.0f);
        int result3 = obj3.add(4,5,7);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
