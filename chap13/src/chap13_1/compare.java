package chap13_1;

public class compare {
	public static int minValue(int[] ar) {
		int min=ar[0];
		for(int e : ar)
		{
			if(e<min)
				min=e;
		}
		return min;
	}
	
	public static int maxValue(int[] ar) {
		int max=ar[0];
		for(int e : ar)
		{
			if(e>max)
				max=e;
		}
		return max;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,50,60,890,90};
		System.out.println(minValue(arr));
		System.out.println(maxValue(arr));
	}

}
