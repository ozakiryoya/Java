package array2;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		string型の配列を作成し、アルファベットa～jまでを格納してください。
		brake文を使用し、a～dまで表示してください。
		
		 出力結果：a
		           b
		           c
		           d
		          
		cotinue文を使用し、i以外を表示してください。
		
		 出力結果：a
		           b
		           c
		           d
		           e
		           f
		           g
		           h
		           j
	*/
		String[] array = {"a","b","c","d","e","f","g","h","i","j"};
		for(int i = 0;i < array.length;i++) {
			if(array[i] == "e") {
				break;
			}
			System.out.println(array[i]);
		}
		for(int i = 0;i < array.length;i++) {
			if(array[i] == "i") {
				continue;
			}
			System.out.println(array[i]);
		}
	}

}
