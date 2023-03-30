class Person{
// インスタンスフィールドを定義
public static int count = 0;
public String name;
public int age;
public double height;
public double weight;
// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age,double height,double weight){
		//インスタンスの生成(人数)の回数分countを加算
		this.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public double bmi() {
		//BMI = 体重　÷　身長　÷　身長
		return this.weight / this.height / this.height;
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMI" + (double)Math.round(this.bmi()) + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	public static void countData() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	//Carのbuyメソッド
	//Car型の変数carを仮引数として受け取る
	public void buy(Car car) {
		//VehicleクラスのsetOwnerへnameを渡し値を設定
		car.setOwner(this.name);
		//VehicleクラスのgetOwnerへ値を受け取る
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	//Bicycleのbuyメソッド
	//Bicycle型の変数bicycleを仮引数として受け取る
	public void buy(Bicycle bicycle) {
		//VehicleクラスのsetOwnerへnameを渡し値を設定
		bicycle.setOwner(this.name);
		//VehicleクラスのgetOwnerへ値を受け取る
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}