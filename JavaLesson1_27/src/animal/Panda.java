package animal;

public class Panda extends Animal{
	//フィールドに学名をprivateで作成
	private String scName = "アイルロポダ・メラノレウカ";

	public Panda(String name,double height, int speed) {
		super(name,height,speed);
	}
	public void printData() {
		System.out.println("動物名：" + this.name);
		System.out.println("体長：" + this.height + "m");
		System.out.println("速度：" + this.speed + "km/h");
		System.out.println("学名：" + this.scName);
		System.out.println();
	}

}
