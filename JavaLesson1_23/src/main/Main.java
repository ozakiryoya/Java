package main;

import info.Info;

public class Main {
	public static void main(String[] args) {
		Info info = new Info();
		//Info.java内のprivateフィールドの値を変更するsetterに引数を渡します。
		info.Setname("ライオン");
		info.Setheight(2.1);
		info.Setspeed(80);
		
		//getterから取得したいフィールドの値を受け取りコンソールに出力
		System.out.println("動物名：" + info.getName());
		System.out.println("体長：" + info.getHeight() + "m");
		System.out.println("速度：" + info.getSpeed() + "km/h");
	}
}
