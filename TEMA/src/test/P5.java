package test;

public class P5 {
	private static boolean valid(int[] a, int n) {
		int j;
		if (n == 1)
			return true;
		for (j = 0; j < n; j++)
			if (a[j] > a[j + 1])
				return false;
		return true;
	}

	public static void back(int[] a, int k, int n) {
		int i;

		for (i = 0; i < n; i++)
			a[k] = i;
		if (k == n - 1) {
			if (valid(a, n))
				for (i = 0; i < n; i++)
					System.out.println(a[i]);
		} else
			back(a, k + 1, n);

	}

	public static void combinations(int n) {
		int[] a = new int[n];
		back(a, 0, n);
	}

	public static void main(String[] args) {

		combinations(3);
	}

}
