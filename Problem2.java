public class Problem2
{  
    public static void main(String[] args)
    {
        int Num = 550;
        System.out.println("Initial value: " + Num);
        System.out.println("Here are the digits: ");
        int Num1 = (Num % 10);
        Num /= 10;
        int Num2 = (Num % 10);
        Num /= 10;
        int Num3 = (Num % 10);
        System.out.println(Num3);
        System.out.println(Num2);
        System.out.println(Num1);
    }
}
