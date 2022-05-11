package jp.co.aforce.test;

public class PracticeTest8 {


		// 練習問題①
		public void printHello() {
			System.out.println("Hello");
		}

		// 練習問題②
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

		// 練習問題③
		public void printMessage(String message) {
				System.out.println(message);
			}

		// 練習問題④
		public void printMessage(String message, int count) {
				System.out.println();
		}

		//練習問題⑤

		public void printRectangleArea(double height, double width) {
				System.out.println(height * width);
		}

		//練習問題⑥

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

		//練習問題⑦

		 public boolean isEvenNumber(int value) {

			if (value %2 ==0) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}


		//練習問題⑧

		 public String getMessage (String name, boolean isKid) {

			 if(isKid == true) {
				 System.out.println("こんにちは、"+ name + "ちゃん");
			 }else {
				 System.out.println("こんにちは、"+ name + "さん");
			 }

		 }

		//練習問題⑨

		 public String getLongestString(String array) {

		 }


		//練習問題⑩






}



