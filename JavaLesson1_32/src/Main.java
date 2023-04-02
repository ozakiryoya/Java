
class Main{
	public static void main(String[] argos){
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		//クラスに属しているクラスフィールドのcountを呼び出すためクラス名.クラスフィールド名で入力
		//System.out.println("合計" + Person.count + "人です");
			
		//クラスに属しているクラスメソッドを呼び出すためクラス名.クラスメソッドで入力
		Person.printCount();
	}
}