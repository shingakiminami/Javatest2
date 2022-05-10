package jp.co.aforce.test;

public class MinMax {


	public int getMaxValue(int a, int b, int c) {
		int Max = a;
			if(b > Max) Max = b;
			if(c > Max) Max = c;

			return Max;
	}

	public int getMinValue(int a, int b, int c) {
		int Min = a;
			if(b < Min) Min = b;
			if(c < Min) Min = c;

			return Min;
	}
}
