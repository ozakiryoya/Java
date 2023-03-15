/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/
package JavaLesson1_10;

public class practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int a = 1; a < 10;a++) {
			for(int b = 1; b < 10;b++) {
				int c = a * b;
				System.out.print(a + "*" + b + "=" + c);
				if(b == 9) {
					System.out.println("");
				} else {
					System.out.print(" ");
				}
			}
		}
	}

}
