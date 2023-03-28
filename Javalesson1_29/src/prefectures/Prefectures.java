package prefectures;

import java.util.Collections;
import java.util.List;

//都道府県クラス
class Prefectures {
	protected List list;
	//都道府県のリストを作成
	private String[][] preList = {
			{"0", "北海道:札幌市:83424"},
			{"1", "青森県:青森市:9646"},
			{"2", "岩手県:盛岡市:15275"},
			{"3", "宮城県:仙台市:7282"},
			{"4", "秋田県:秋田市:11638"},
			{"5", "山形県:山形市:9323"},
			{"6", "福島県:福島市:13784"},
			{"7", "茨城県:水戸市:6097"},
			{"8", "栃木県:宇都宮市:6408"},
			{"9", "群馬県:前橋市:6362"},
			{"10", "埼玉県:さいたま市:3798"}
	};
	
	 Prefectures(){
	 }
	
	public void setList(List list) {
		this.list = list;
	}
	
	public void ascData() {
		Collections.sort(this.list);
		
	}
	public void descData() {
		Collections.sort(this.list, Collections.reverseOrder());
		
	}
	
	public void printData(List nums) {
		Integer[] int_arr=new Integer[nums.size()];
	      int_arr=(Integer[]) nums.toArray(int_arr);
	      int[] arr=new int[nums.size()];
	      for(int i=0;i<int_arr.length;i++)
	      {
	        arr[i]=int_arr[i];
	      }
	      for (int i=0;i<arr.length;i++) {
	    	  String[] output = preList[arr[i]][1].split(":");
	    	  System.out.println("都道府県名：" + output[0]);
	    	  System.out.println("県庁所在地：" + output[1]);
	    	  System.out.println("面積：" + output[2] + "km2");
	    	  System.out.println("");
	      }
	}

}
