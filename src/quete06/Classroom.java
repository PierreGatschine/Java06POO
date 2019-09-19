package quete06;

public class Classroom {

	public static void main(String[] args) {

		Wilder pierre = new Wilder("Pierre", true);
		System.out.println(pierre.whoAmI());

		Wilder pedro = new Wilder("Pierre", false);
		System.out.println(pedro.whoAmI());

	}

}
