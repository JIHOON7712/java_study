package chap7_1;

public class Triangle {
	static double bas,hei;
	
	public Triangle(double base,double height)
	{
		bas=base;
		hei=height;
	}

	public static void baschange(double newbase) {
		bas=newbase;
	}
	
	public static double square()
	{
		return bas*hei/2;
	}

}
