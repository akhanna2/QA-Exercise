package org;

public class IsPrime {
	public boolean CheckIfPrime(int num) {
		int i = 2;
		boolean answer = true;
		
		while(i <= num/2) {
			if (num % i != 0)
			{
				i++;
			}
			else
			{
				answer = false;
				break;
			}
		}
		
		return answer;
	}

}
