package test;

public class P4 {
	public static int[] insert(int[] arr, int pos, int n) {
		int i, l = arr.length, k = 0, sw = 0;
		int[] a = new int[l + 1];
		for (i = 0; i < l; i++)
			if (pos == i && sw == 0) {
				a[k] = n;
				k++;
				i--;
				sw = 1;
			} else {
				a[k] = arr[i];
				k++;
			}
		if (pos == l)
			a[l] = n;
		return a;
	}

	public static void main(String[] args) {
		int[] v = new int[7];
		int[] a = new int[6];
		int i;
		a[0] = 1;
		a[1] = 2;
		a[2] = 6;
		a[3] = 9;
		a[4] = 3;
		a[5] = 4;
		v = insert(a, 6, 10);
		for (i = 0; i <= 6; i++)
			System.out.println(v[i]);

	}
}
