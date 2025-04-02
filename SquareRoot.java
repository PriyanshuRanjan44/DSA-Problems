package Week_2;

public class SquareRoot {
	public static double squareRoot(int n) {
		if(n==0 || n==1) return n;
		double precision = 0.00001;
		double left = 0;
		double right = n;
		double mid = 0;
		double square = 0;
		while(right - left > precision) {
			mid = (right + left)/2;
			square = mid*mid;
			if(square == n) {
				return mid;
			}
			else if(square<n) {
				left = mid;
			}
			else {
				right = mid;
			}
		}
		return (left+right)/2;
	}
	public static void main(String[] args) {
		System.out.println(squareRoot(7));
	}

}
