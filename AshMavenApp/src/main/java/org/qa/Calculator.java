package org.qa;

public class Calculator {
	public static int findBig(int x, int y) 
	{
		if(x>y)
			return x;
		else
			return y;
	}
	
	public static int findBiggest(int x, int y, int z)
	{
		if(x>y && x>z)
		{
			return x;
		}
		else if(y>x && y>x)
		{
			return y;
		}else
		{
			return z;
		}
	}
	
	public static boolean checkCCNum(String ccNum)
	{
		int len = ccNum.length();
		if(len == 16) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
