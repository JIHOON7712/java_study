package chap14_1;

class HybridWaterCar extends HybridCar {
	int waterGauge;
	public HybridWaterCar(int i,int j,int k) {
		super(i,j);
		waterGauge=k;
	}
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ� :"+gasolineGauge);
		System.out.println("�ܿ� ���ⷮ :"+electricGauge);
		System.out.println("�ܿ� ���ͷ� :"+waterGauge);
	}
	public static void main(String[] args) {
		HybridWaterCar a=new HybridWaterCar(100,200,300);
		a.showCurrentGauge();
	}
}
