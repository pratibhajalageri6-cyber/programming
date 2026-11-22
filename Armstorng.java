class Expo
{
    public static int expo(int base, int power)
    {
        int res = 1;
        for (int i = 1; i <= power; i++)
        {
            res = res * base;
        }
        return res;
    }
}

class Armstrong
{
    public static void main(String args[])
    {
        int n = 370, count = 0, temp = n;

        int num = n;

        while (num != 0)
        {
            count++;
            num = num / 10;
        }

        int sum = 0;

        while (n != 0)
        {
            int last = n % 10;
            sum = sum + Expo.expo(last, count);
            n = n / 10;
        }

        if (temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}