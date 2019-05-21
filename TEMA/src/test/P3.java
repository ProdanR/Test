package test;

public class P3 {
	public static int next(int arr[], int n) {
		int i, l = arr.length;
		if (arr[l - 1] == n)
			return -1;
		for (i = 0; i < l - 2; i++)
			if (arr[i] == n)
				return arr[i + 1];
		return -2;
	}

}
