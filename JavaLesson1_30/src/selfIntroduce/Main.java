package selfIntroduce;

class Main {
	  public static void main(String[] args) {
		  
	    Person person1 = new Person("鈴木太郎", 20, 1.7,86.7);
	    Person person2 = new Person("山田花子",22,1.55,60.0);
	   
	    //下記コメントアウトしたコードは準備：入力してくださいとありましたが
	    //完成プログラムの実行結果と問題9でprint()から出力とありましたのでコメントアウトしています。
//	    System.out.println(person1.name);
//	    System.out.println(person1.age);
//	    System.out.println(person1.height);
	   
	    person1.print();
	    person2.print();
	    person1.countData();
	    
	  }
	}