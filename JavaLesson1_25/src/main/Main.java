package main;

import java.util.Scanner;

import player.Status;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("名前を入力してください");
		Scanner sc = new Scanner(System.in);
		Status st = new Status(sc.next());
		st.setName();
		st.setHp();
		st.setMp();
		st.setAttack();
		st.setSpeed();
		st.setDefence();
		st.printData();
	}

}
