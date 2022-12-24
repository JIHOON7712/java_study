package chap13_2;

public class change {
	
	public static void change(int[][] arr) {
		int[] tmp;
		tmp=arr[2];
		arr[2]=arr[1];
		arr[1]=arr[0];
		arr[0]=tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		change(ar);
		for(int[] e : ar) {
			for(int f : e)
				System.out.print(f+" ");
			System.out.println();
		}
	}

}
