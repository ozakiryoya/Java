
class Person{
public String name;
public int age;
public double height;
public double weight;
//クラスフィールドにcountを作成
public static int count;

Person(String name, int age, double height, double weight){
	//person1,person2とインスタンスの生成ごとにcountを1ずつ増やしていく
	this.count++;
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
}

public double bmi(){
return this.weight / this.height / this.height;
}

public void print(){
	System.out.println("名前は" + this.name + "です");
	System.out.println("年は" + this.age + "です");
	}

//クラスメソッドの作成のためstaticをつける
public static void printCount() {
	System.out.println("合計" + count + "人です");
}
}