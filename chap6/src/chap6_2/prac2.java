package chap6_2;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(;i<=100;i++)
		{
			if(prime(i)==true)
				System.out.println(i);
			else
				continue;
		}
	}
	
	public static boolean prime(int i)
	{
		int num=2;
		for(;num<=i-1;num++)
		{
			if(i%num==0)
				return false;
		}
		return true;
	}

}
