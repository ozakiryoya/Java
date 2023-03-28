package main;

import java.util.ArrayList;

import prefectures.Execution;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Execution exe = new Execution();
		ArrayList<Integer> numArray = exe.input();
		exe.sortBy(numArray);
	}

}
