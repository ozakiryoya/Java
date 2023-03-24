package animal;

abstract class Animal {
	protected String name;
	protected double height;
	protected int speed;
	
	Animal(String name,double height,int speed){
		this.name = name;
		this.height = height;
		this.speed = speed;
	}
	
	//学名があるクラスと無いクラスで処理が異なるので抽象メソッドとして作成
	abstract void printData();
	
}


/*	public void setName() {
		this.name = name;
	}
	
	public void setHeight() {
		this.height = height;
	}
	
	public void setSpeed() {
		this.speed = speed;
	}*/