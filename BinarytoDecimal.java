class Expo1
{
	public static int expo(int base,int power)
	{
		int res=1;
		for(int i=1;i<=power;i++)
		{
			res=res*base;
		}
		return res;
	}
}
class BinarytoDecimal
{
	public static void main(String[] args)
	{
		int n=1011;
		int decimal=0;
		int power=0;
		while(n!=0)
		{
			int binary=n%10;
			decimal=decimal+binary*Expo1.expo(2,power);
			power++;
			n=n/10;
		}
		System.out.println(decimal);
	}
}

		