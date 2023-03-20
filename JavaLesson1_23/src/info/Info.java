package info;

public class Info {
	//フィールド name、height、speedをprivateにして作成
	private String name;
	private double height;
	private int speed;
	
	//フィールドのアクセス権をprivateのためフィールドの値を変更するセッターを作成
	public void Setname(String name) {
		this.name = name;
	}
	public void Setheight(double height) {
		this.height = height;
	}
	public void Setspeed(int speed) {
		this.speed = speed;
	}
	
	
	//クラス外からフィールドの値を返すゲッターを作成
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
}
