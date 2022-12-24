package chap6_3;

public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("2^"+n+"="+power(n));
	}
	
	public static int power(int n) {
		if(n==0)
			return 1;
		else
			return 2*power(n-1);
	}
}
	

