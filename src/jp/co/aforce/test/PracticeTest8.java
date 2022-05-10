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

		private void printRectangleArea(double height, double width) {
				System.out.println(height * width);
		}

		//練習問題⑥

		private String getWeatherForecast() {
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
		}



}



