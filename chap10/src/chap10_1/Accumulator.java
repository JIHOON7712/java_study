package chap10_1;

public class Accumulator {
	static int total=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10l;i++)
			Accumulator.add(i);
		Accumulator.showResult();
		}
		
		

	public static int add(int i) {
		// TODO Auto-generated method stub
		total+=i;
		return total;
	}		

	public static void showResult() {
		System.out.println("total:"+ total);
		}

		

	}

