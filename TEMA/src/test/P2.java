package test;

public class P2 {
	public static boolean isSorted(int a[]) {
		int i;
		for (i = 0; i < a.length - 1; i++)
			if (a[i] > a[i + 1])
				return false;
		return true;
	}

}
