package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Process {
	private String country;
	private String food;
	private String kinds;
	
	public void greet(String country) {
		this.country = country;
		System.out.println("こんにちは！ここは" + this.country + "です！");
	}
	
	public void taste(String food) {
		this.food = food;
		System.out.println("この" + this.food + "はうまい");
	}
	public void kinds(String kinds) {
		this.kinds = kinds;
		System.out.println(this.food + "は" + kinds + "です");
	}
	public void todayNow() {
		Date date1 = new Date();
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fdate1 = sdformat.format(date1);
		System.out.println("今の現在日時は" + fdate1 + "です");
	}
}


