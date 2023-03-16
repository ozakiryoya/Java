package multidimensional_array;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列int test[][]に以下の成績を格納し、表示してください。
			出力結果：生徒1：国語64点、数学73点、英語69点
					  生徒2：国語58点、数学81点、英語75点
					  生徒3：国語86点、数学68点、英語79点
					  生徒4：国語72点、数学55点、英語80点
			
		②それぞれの教科の平均点を表示してください。
			出力結果：国語の平均点は○○点です。
					  数学の平均点は○○点です。
					  英語の平均点は○○点です。
		*/
		int[][] test = {{64,73,69},
				{58,81,75},
				{86,68,79},
				{72,55,80}};
		String[] subject = {"国語","数学","英語"};
		for(int a = 0;a < test.length;a++) {
			System.out.print("生徒" + (a+1) + "：");
				for(int b = 0;b < test[a].length;b++) {
					System.out.print(subject[b] + test[a][b] + "点");
					if(b+1 == test[a].length) {
						System.out.println("");
					}else {
						System.out.print("、");
					}
				}
		}
		int avg[] = new int[3];
		for(int a = 0;a < test.length;a++) {

			for(int b = 0;b < test[a].length;b++) {
				avg[b] += test[a][b];
			}
		}
		for(int a = 0; a < avg.length;a++) {
			System.out.println(subject[a] + "の平均点は" + avg[a] / 4 + "点です。"); 
		}
	}

}
