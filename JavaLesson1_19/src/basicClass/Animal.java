package basicClass;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog name = new Dog("犬");
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog num = new Dog(3);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date date1 = new Date();
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fdate1 = sdformat.format(date1);
		System.out.println(fdate1);
	}
}
