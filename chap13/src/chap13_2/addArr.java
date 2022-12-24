package chap13_2;

public class addArr {
	public static void addOneArr(int[] ar1,int add) {
		for(int i=0;i<ar1.length;i++)
			ar1[i]+=add;
	}
	
	public static void addTwoArr(int[][] ar2,int add) {
		for(int j=0;j<ar2.length;j++) {
			addOneArr(ar2[j],add);
		}

	}

	public static void main(String[] args) {
		int[][] arr= {
				{11,22,33},
				{44,55},
				{66,77,88,99}
			};
		
		addTwoArr(arr,2);
		
		for(int[] e : arr) {
			for(int f : e)
				System.out.print(f+" ");
			System.out.println();
		}
		
	}
}
