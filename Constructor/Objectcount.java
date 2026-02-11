class Objectcount{
    public static void main(String[] args)
    {
        Count obj = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();
        System.out.println(obj3.count);
    }
}
class Count{
    public static int count = 0;
    Count()
    {
        count++;
    }

}