package chap6_3;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=23;
		bin(num1);
	}
	
	public static int bin(int num)
	{
		if(num>0)
		{
			System.out.print(num%2);
			num/=2;
			bin(num);
			
		}
		return 0;
	}
}
