package Exception;

public class Test {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 2;
			int z = x/y;
			int[] m = new int[5];
			m[5] = 100;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This will always execute");
		}
	}

}
