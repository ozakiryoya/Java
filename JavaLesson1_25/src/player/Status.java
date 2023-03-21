package player;


//Playerクラスから継承
//HP、MP、攻撃、素早さ、防御力のステータスをオーバーライドする。

public class Status extends Player{
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;
	
	public Status(String name){
		super(name);
	}
	
	public void setHp() {
		this.hp = (int)(Math.random() * 1000 + 1);
	}
	
	public void setMp() {
		this.mp = (int)(Math.random() * 1000 + 1);
	}
	
	public void setAttack() {
		this.attack = (int)(Math.random() * 1000 + 1);
	}
	
	public void setSpeed() {
		this.speed = (int)(Math.random() * 1000 + 1);
	}
	
	public void setDefence() {
		this.defence = (int)(Math.random() * 1000 + 1);
	}
	
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	
	public int getAttack() {
		return this.attack;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int getDefence() {
		return this.defence;
	}
	public void printData() {
		super.printData();
		System.out.println("ステータス");
		System.out.println("HP：" + this.hp);
		System.out.println("MP：" + this.mp);
		System.out.println("攻撃力：" + this.attack);
		System.out.println("素早さ" + this.speed);
		System.out.println("防御力" + this.defence);
	}
	
}
