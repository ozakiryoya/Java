package method;

import java.util.Arrays;

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

		greetQ1();
		
		int q2 = add(123);
		System.out.println(q2);
		
		int q3 = multica(12,34);
		System.out.println(q3);
		
		double q4 = multica(1.2,3.4);
		System.out.println(q4);
		
		int[] q5 = array(5);
		System.out.println(Arrays.toString(q5));
		
		int q6 = average(6);
		System.out.println(q6);
	}
	public static void greetQ1() {
		System.out.println("Hello Java");
	}
	public static int add(int a) {
		return a + 1;
	}
	public static int multica(int a,int b) {
		return a * b;
	}
	public static double multica(double a,double b) {
		return a * b;
	}
	public static int[] array(int x) {
		int[] array2 = new int[x];
		for(int a = 0;a < array2.length;a++) {
			array2[a] = (int)(Math.random() * 100 + 1);
		}
		return array2;
	}

	public static int average(int a) {
		int[] b = array(a);
		int sum = 0;
		for(int x = 0; x < b.length;x++) {
			sum += b[x];
		}
		return sum / b.length;
	}
}
