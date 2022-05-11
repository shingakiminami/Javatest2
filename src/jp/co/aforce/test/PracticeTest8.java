package jp.co.aforce.test;

public class PracticeTest8 {


		// 練習問題①----------------------------------------------------
		public void printHello() {
			System.out.println("Hello");
		}

		// 練習問題②----------------------------------------------------
		public void  printRandomMessage() {
			int n = (int)(3 * Math.random());

			if(n == 0) {
				System.out.println("こんばんは");
			}else if (n == 1) {
				System.out.println("こんにちは");
			}else {
				System.out.println("おはよう");
			}
		}

		// 解答例：switch文を使った場合
		// String message = null;
		// switch (n){
		//  case 0:
		//  message = "こんばんは";
		//  break;
		//  ・・・case2まで続く・・・
		//  System.out.println(message);


		// 練習問題③----------------------------------------------------
		public void printMessage(String message) {
				System.out.println(message);
			}

		// ★練習問題④----------------------------------------------------
		public void printMessage(String message, int count) {
			for (int i = 1; i <=count; i++) {
				System.out.println(message);
			}
		}

		//練習問題⑤-----------------------------------------------------

		public void printRectangleArea(double height, double width) {
				System.out.println(height * width);
		}

		//練習問題⑥-----------------------------------------------------

		public String getWeatherForecast() {
			int i = (int)(3 * Math.random());
			int j = (int)(4 * Math.random());

			String date;
			String weather;

			if(i==0) {
				date = "今日";
			}else if(i==1) {
				date = "明日";
			}else {
				date = "明後日";
			}

			if(j==0) {
				weather = "晴れ";
			}else if(j==1) {
				weather = "曇り";
			}else if(j==2){
				weather = "雨";
			}else {
				weather = "雪";
			}
			return (date + "の天気は" + weather + "でしょう");
		}

		//★練習問題⑦------------------------------------------------------

		 public boolean isEvenNumber(int value) {

//			if (value %2 ==0) {
//				System.out.println("true");
//
//			}else {
//				System.out.println("false");
//			}
//			return ();  ←ここで何を返せばいいのか詰まってしまった。

		// 【解答】

			 if (value %2 ==0) {
				 return true;
			 }
				 return false;
			 }



		//★練習問題⑧---------------------------------------------------------

		 public String getMessage (String name, boolean isKid) {

//			 if(isKid == true) { ←結果を持っているので、書かなくれもいい
//				 System.out.println("こんにちは、"+ name + "ちゃん");
//			 }else {
//				 System.out.println("こんにちは、"+ name + "さん");
//			 }
//			 return ();  ←練習問題⑦と同じミス。

		// 【解答】

			 if(isKid == true) {
				 return "こんにちは、"+ name + "ちゃん";
			 }
			 	return "こんにちは、"+ name + "さん";

		 	}

		//★練習問題⑨----------------------------------------------------------

		 public String getLongestString(String[] array) {

			 String str = null;
			 int maxCount = array[0].length();

			 	for(int i = 1; i < array.length; i++) {
			 		if(maxCount <= array[i].length()) {
			 			maxCount = array[i].length();
			 			str = array[i];
			 		}
			 	}
			 	return str;
		 }


		//★練習問題⑩-------------------------------------------------------------

		 public boolean isAdult(Person person) {

			 if(person.getAge() >=  20) {
				 return true;
			 }
			 	return false;
		 }

}



