package method;

import java.util.Arrays;
import java.util.Random;

public class Method {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		
		// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
			
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
			
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
			
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
			
		// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
		//     配列の要素の平均値を返すメソッド（関数）を作成してください。

		
		//Q1 greetQ1のメソッドを呼び出します。
		greetQ1();
		
		//Q2 値を渡し+1して返すaddメソッドを呼出し、その値を変数q2へ代入しコンソールに出力します。
		int q2 = add(123);
		System.out.println(q2);
		
		//Q3 整数2つの値を渡し乗算して返すmulticaメソッドを呼出し、その値を変数q3へ代入しコンソールに出力します。
		int q3 = multica(12,34);
		System.out.println(q3);
		
		//Q4 小数2つの値を渡しmulticaメソッドを呼出し、その値を変数q4へ代入しコンソールに出力します。
		double q4 = multica(1.2,3.4);
		System.out.println(q4);
		
		//Q5 数字を渡しarrayメソッドを呼出し、1～100のランダムな数字を引数分を配列q5へ格納し出力します。
		int [] q5 = random(5);
		System.out.println(Arrays.toString(q5));
		
		//Q6 数字をQ5で作成したarrayメソッドへ渡し出力します。
		int[] q6 = random(6);
		//Q5で作成した配列q6をコンソールへ出力しています。
		System.out.println(Arrays.toString(q6));
		//Q5で作成した配列q6を配列の要素の平均値を返すarrayメソッドを変数aveへ代入しています。
		double ave = average(q6);
		//arrayメソッドから受け取った変数aveを出力します。
		System.out.println(ave);
	}
	//Q1 Hello Javaと出力します。
	public static void greetQ1() {
		System.out.println("Hello Java");
	}
	//Q2 受け取った引数から+1した値を返します。
	public static int add(int a) {
		return a + 1;
	}
	//Q3 受け取った2つの整数型の引数から乗算した値を返します。
	public static int multica(int a,int b) {
		return a * b;
	}
	//Q4 受け取った2つの浮動小数点型の引数から乗算した値を返します。
	public static double multica(double a,double b) {
		return a * b;
	}
	//Q5 引数分要素数の配列を作成し、1～100のランダムな数字を引数分格納し返します。
	public static int [] random(int x) {
		int[] array2 = new int[x];
		Random rnd = new Random();
		for(int a = 0;a < array2.length;a++) {
			array2[a] = rnd.nextInt(100);
		}
		return array2;
	}
	/*受け取った引数をarrayメソッドへ渡し受け取った配列をsumへ順番に加算します。
	 * 配列の要素を加算したsumを平均値として配列の要素数を除算した変数aveを返します。*/
	public static double average(int[] q6) {
		double sum = 0;
		for(int a = 0; a < q6.length;a++) {
			sum += q6[a];
		}
		double ave = (double)sum / q6.length;
		return ave;
	}
}
