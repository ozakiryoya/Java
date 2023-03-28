package prefectures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Execution extends Prefectures{
		
	public Execution() {
		super();
	}

	public ArrayList<Integer> input() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numArray = new ArrayList<>();

		System.out.println("0から10まで好きな数字を複数入れて終了時は入力せずEnterを押してください");
		while(true){
			String num = sc.nextLine();
			if(num.equals("")) {
				break;
			}else if(Integer.parseInt(num) > 10 || Integer.parseInt(num) < 0) {
				System.out.println("0以下又は10以上入力しています。");
				continue;
			}
			numArray.add(Integer.parseInt(num));
		}
		return numArray;
	}
	
	
@SuppressWarnings("unchecked")
public void sortBy(List list) {
	Scanner sc = new Scanner(System.in);
	System.out.println("昇順か降順のどちらかを選択してください");
	while(true) {
		String answer = sc.nextLine();
		switch(answer) {
		case("降順"):
			Collections.sort(list, Collections.reverseOrder());
			super.printData(list);
			break;
		case("昇順"):
			Collections.sort(list);
			super.printData(list);
			break;
		default:
			System.out.println("昇順か降順以外を入力されてますので入力しなおしてください");
			continue;
		}
	}
}
}
