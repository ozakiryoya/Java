package Array;

import java.util.Scanner;

public class InputArray {
	
	public String[] input() {
		Scanner sc = new Scanner(System.in);
		
		String[] array;
		
		//入力の際名前、体長、速度がしっかりと入っていて配列内のデータがnullに入っていなければ配列を返します
		//配列を返すまで入力が続きます。
		while(true) {
			System.out.println("コンソールに文字を入力してください");
			//問題文にて「ライオン:2.1:80,ゾウ:3.2:40,…」と入力の為名前、体長、速度が1つずつ取得できるようsplitで分けていく
			array = sc.nextLine().split("[:,]");
				if(array.length % 3 != 0) {
				System.out.println("名前、体長、速度のいずれかが足りません。再度初めから入力してください");
				continue;
			}
			//checkメソッドを呼び出し問題なければ配列を返す
			boolean result = check(array);
			
			if(result) {
				return array;
			}else {
				System.out.println("配列内に未入力がありましたので再度初めから入力してください");
			}
		}

	}
	
	public boolean check(String[] array) {
		//入力が17行目のsplitの区切り文字のみの場合falseで返す
		if(array.length == 0) {
			return false;
		}
		//配列内に未入力があればfalseで返す
		for(int i = 0;i < array.length;i++) {
			if(array[i] == "") {
				return false;
			}
		}
		//未入力がなければtrueで返す
		return true;
	}
}
