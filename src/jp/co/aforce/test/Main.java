package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {

	PracticeTest8 test8 = new PracticeTest8();

	//練習問題１

	test8.printHello();

	//練習問題２

	test8.printRandomMessage();

	//練習問題３

	test8.printMessage("Hello");

	//練習問題４

	test8.printMessage("こんにちは", 3);

	//練習問題５

	test8.printRectangleArea(10, 2.5);

	//練習問題６

	String weatherForecast = test8.getWeatherForecast();
	System.out.println(weatherForecast);

	//練習問題７

	boolean result = test8.isEvenNumber(3);
	System.out.println(result);

	//練習問題８

	String result2 = test8.getMessage("花子", false);
	System.out.println(result2);

	//練習問題９
	String[] names = {"太郎","一郎","次郎","三郎"};
	System.out.println(test8.getLongestString(names));


	//練習問題１０

	Person person = new Person("新垣実菜美",23);
	System.out.println(test8.isAdult(person));



	}
}
