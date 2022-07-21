package firstFifteenEvenNumbers;

public class Test {
	
	public static int num = 1;
	public static int evenCount = 0;
	
	public static void main(String[] args) {
		while(num < 100 && evenCount < 15) {
			if(num % 2 == 0) {
				System.out.println(num);
				evenCount++;
			}
			
			num++;
		}

	}

}
