public class Problem3
{  
    public static void main(String[] args)
    {
        int Num = 5501;
        System.out.println("Initial value: " + Num);
        System.out.println("Here are the digits: ");
        System.out.println(Num % 10);
        Num /= 10;
        System.out.println(Num % 10);
        Num /= 10;
        System.out.println(Num % 10);
        Num /= 10;
        System.out.println(Num);
    }
}
