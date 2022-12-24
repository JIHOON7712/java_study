package chap9_1;

class point{
	int xpos,ypos;
	public point(int x,int y) {
		xpos=x;
		ypos=y;
	}
	
	public void showPointInfo() {
		System.out.println("["+xpos+","+ypos+"]");
		
	}
}

public class circle {
	int xpos,ypos,rad;
	
	public circle(int x,int y,int r) {
		xpos=x;
		ypos=y;
		rad=r;
	}
	
	public void showcircleinfo() {
		point a=new point(xpos,ypos);
		a.showPointInfo();
		System.out.println("rad="+rad);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle(2,2,4);
		c.showcircleinfo();
	}

}
