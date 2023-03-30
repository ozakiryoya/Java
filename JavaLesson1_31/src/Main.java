
class Main {

	public static void main(String[] args) {
			  
		 Person person1 = new Person("鈴木太郎", 20, 1.7,86.7);
		 Person person2 = new Person("山田花子",22,1.55,60.0);
		   
		  //下記コメントアウトしたコードは準備：入力してくださいとありましたが
		  //完成プログラムの実行結果と問題9でprint()から出力とありましたのでコメントアウトしています。
//		  System.out.println(person1.name);
//		  System.out.println(person1.age);
//		  System.out.println(person1.height);
		   
		 Car car = new Car();
		 Bicycle bicycle = new Bicycle();
		 
		 //carの所有者をperson1、bicycleの所有者をperson2に設定
		 car.setOwner(person1.name);
		 bicycle.setOwner(person2.name);
		 //setOwnerで値を設定したcarの所有者をgetOwnerで受け取りコンソールに出力
		 System.out.println(car.getOwner());
		 //bicycleの所有者を受け取りコンソールに出力
		 System.out.println(bicycle.getOwner());
		 
		 //person1の引数をcarとしてbuyメソッドを呼ぶ
		 person1.buy(car);
		 //person2の引数をbicycleとしてbuyメソッドを呼ぶ
		 person2.buy(bicycle);
		 
//		  person1.print();
//		  person2.print();
//		  person1.countData();
	}
}