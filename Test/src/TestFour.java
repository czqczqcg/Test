public class TestFour {

	public static void main(String[] args) {

		int x, y, z;
		for (int m = 100; m < 999; m++) {
			x = m / 100;
			y = (m % 100) / 10;
			z = (m % 100) % 10;
			if (m == x * x * x + y * y * y + z * z * z)
				System.out.print(m + " ");
		}

		System.out.println("");
		
		for (int i = 100; i < 1000; i++) {

			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 100;
			int s = a * a * a + b * b * b + c * c * c;
			if (i == s)
				System.out.println(i);

		}
	}

}
