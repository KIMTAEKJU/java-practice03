package prob3;

public class CurrencyConverter 
{
	private static double rate;
	private static int dollar;
	private static int krw;
	
	public static void setRate(double value) 
	{
		rate = value;
	}
	
	public static int toDollar(int value)
	{
		dollar = value;
		return dollar;
	}
	
	public static int toKRW(int value)
	{
		krw = value;
		return krw;
	}
	
	
}
