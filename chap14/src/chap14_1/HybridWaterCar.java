package chap14_1;

class HybridWaterCar extends HybridCar {
	int waterGauge;
	public HybridWaterCar(int i,int j,int k) {
		super(i,j);
		waterGauge=k;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 :"+gasolineGauge);
		System.out.println("잔여 전기량 :"+electricGauge);
		System.out.println("잔여 워터량 :"+waterGauge);
	}
	public static void main(String[] args) {
		HybridWaterCar a=new HybridWaterCar(100,200,300);
		a.showCurrentGauge();
	}
}
