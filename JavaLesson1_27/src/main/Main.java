package main;

import Array.InputArray;
import animal.Elephant;
import animal.Lion;
import animal.Monky;
import animal.Other;
import animal.Panda;
import animal.Zebra;;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//InputArrayクラスのinputメソッドを呼び出し配列arrayに入力した情報を格納する	
		InputArray ip = new InputArray();
		String[] array = ip.input();
		
			//名前、体長、速度の順番に配列へ格納しているため名前が一致すれば名前から速度まで渡しコンソールへ出力、次の名前の配列まで変数を加算する
		try {
			for(int a = 0;a < array.length;a += 3) {
				switch(array[a]) {
				case "ライオン":
					Lion lion = new Lion(array[a],Double.parseDouble(array[a + 1]),Integer.parseInt(array[a + 2]));
					lion.printData();
					break;
				case "ゾウ":
					Elephant elephant = new Elephant(array[a],Double.parseDouble(array[a + 1]),Integer.parseInt(array[a + 2]));
					elephant.printData();
					break;
				case "パンダ":
					Panda panda = new Panda(array[a],Double.parseDouble(array[a + 1]),Integer.parseInt(array[a + 2]));
					panda.printData();
					break;
				case "チンパンジー":
					Monky monky = new Monky(array[a],Double.parseDouble(array[a + 1]),Integer.parseInt(array[a + 2]));
					monky.printData();
					break;
				case "シマウマ":
					Zebra zebra = new Zebra(array[a],Double.parseDouble(array[a + 1]),Integer.parseInt(array[a + 2]));
					zebra.printData();
				break;
				default:
					Other other = new Other(array[a],Double.parseDouble(array[a + 1]),Integer.parseInt(array[a + 2]));
					other.printData();
					break;
				}
			}
			//配列内の体長か速度が文字で入っていればエラーとなるので例外処理にてコンソールへ出力
		}catch(NumberFormatException e) {
			System.out.println("入力が正しくありません。再度実行し入力してください");
		}
	}
}


