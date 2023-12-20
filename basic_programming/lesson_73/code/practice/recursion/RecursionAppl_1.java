package practice.recursion;

public class RecursionAppl_1 {

	public static void main(String[] args) {

//		Алгоритм Евклида — это эффективный метод для нахождения наибольшего общего делителя (НОД) двух чисел.
//		Он основан на простой идее: НОД двух чисел не изменится, если большее число заменить на разность между ним
//		и меньшим числом.

		int res = gcd(77, 35); // наибольший общий делитель
		System.out.println(res); // 7

		double root = sqrt(81, 0.00001);
		System.out.println(root); // 9

		print100();
	}

	public static int gcd(int a, int b) {
		// TODO Greatest Common divisor
		// Euclidean algorithm
//		if (a == b) {
//			return a;
//		}
//		if (a > b) {
//			return gcd(a - b, b);
//		} else {
//			return gcd(a, b - a);
//		}
		return b == 0 ? a : gcd(b, a % b);
	}

	public static double sqrt(double x, double precision) {
		// TODO square root
		// Hero's method ask Hero from Alexandria
		return sqrt(x, x / 2, precision);
	}
	
	private static double sqrt(double x, double prev, double precision) {
		double next = 0.5 * (prev + x / prev);
		return Math.abs(next - prev) < precision ? next : sqrt(x, next, precision);
	}

	// Advanced
	public static void print100() {
		// TODO *
		// print all numbers from 1 to 100
		// don't use any loops, stream, if-else and other choice operations
		print100(1);
	}
	
	private static void print100(int i) {
		try {
			int x = 1 / (101 - i);
			System.out.println(i);
			print100(i + 1);
		} catch (Exception e) {
			return;
		}
	}

}
