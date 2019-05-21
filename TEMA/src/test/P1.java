package test;

public class P1 {
	public static double harmonicAvg(int a, int b) {
		double mh = 0;
		if (a + b == 0)
			return mh;
		mh = (2 * a * b) / (a + b);
		return mh;
	}
}
