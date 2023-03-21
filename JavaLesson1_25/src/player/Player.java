package player;

//Playerクラスをスーパークラスとして作成
//nameをフィールドとセッターとゲッターを作成

public class Player {
	protected String name;

	
	Player(String name){
		this.name = name;
	}

	
	public void setName() {
		this.name = name;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	
	public void printData() {
		System.out.println("こんにちは「 " + this.name + " 」さん");
	}
	
}
