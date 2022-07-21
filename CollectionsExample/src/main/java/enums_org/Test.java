package enums_org;

public class Test {

	public static void main(String[] args) {
		for(Seasons s:Seasons.values()) {
			System.out.println(s);
			System.out.println("The index of " + s + "is: " + s.ordinal());
		}

	}

}
