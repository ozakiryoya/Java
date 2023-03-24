package animal;

public class Other extends Animal{

	public Other(String name,double height, int speed) {
		super(name,height,speed);
	}
	
	//学名が不明なものは不明とそのままコンソールへ入力
	public void printData() {
		System.out.println("動物名：" + this.name);
		System.out.println("体長：" + this.height + "m");
		System.out.println("速度：" + this.speed + "km/h");
		System.out.println("学名：不明");
		System.out.println();
	}
	
}
