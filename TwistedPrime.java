class Prime
{
    public static boolean isPrime(int n)
    {
        int count = 0;

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count++;
        }

        return count == 2;
    }
}
class Reverse
{
    public static int reverse(int n)
    {
        int rev = 0;

        while (n != 0)
        {
            int l = n % 10;
            rev = rev * 10 + l;
            n = n / 10;
        }

        return rev;
    }
}
class TwistedPrime
{
    public static void main(String[] args)
    {
        int n = 13;

        if (Prime.isPrime(n))
        {
            int r = Reverse.reverse(n);

            if (Prime.isPrime(r))
            {
                System.out.println("Twisted Prime");
            }
            else
            {
                System.out.println("Not Twisted Prime");
            }
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}