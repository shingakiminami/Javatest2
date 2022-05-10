package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String[] args) {


		int x = 10;
		int y = 28;
		double z = 3.14;

		//練習問題①
		System.out.println(x*y);

		//練習問題②
		System.out.println(y/x);

		//練習問題③
		double total = y*z;
		System.out.println(total);

		//練習問題④
		total++;
		System.out.println(total);

		//練習問題⑤
		int age = 23;
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(101);

		if (age> randomNumber ) {
			System.out.println("私の方が年上です");
		}else if (age< randomNumber ){
			System.out.println("私の方が年下です");
		}else {
			System.out.println("私と同い年です");
		}
		System.out.println("randomNumber=" + randomNumber);




	}
}
