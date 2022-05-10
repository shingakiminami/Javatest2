package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeTest3 {
	public static void main(String[] args) {


		//練習問題①,②
		String[] dates = new String[4];

			dates[0] = "1";
			dates[1] = "田中太郎";
			dates[2] = "男性";
			dates[3] = "27";

				System.out.println(dates[1]);

		//練習問題④

				Employee Tanaka = new Employee();
				Employee Sato   = new Employee();
				Employee Suzuki = new Employee();

				Tanaka.setNumber(1);
				Tanaka.setName("田中太郎");
				Tanaka.setGender("男性");
				Tanaka.setAge(27);

				Sato.setNumber(2);
				Sato.setName("佐藤花子");
				Sato.setGender("女性");
				Sato.setAge(22);

				Suzuki.setNumber(3);
				Suzuki.setName("鈴木次郎");
				Suzuki.setGender("男性");
				Suzuki.setAge(31);

				ArrayList<Employee> Employees = new ArrayList<>();

				Employees.add(Tanaka);
				Employees.add(Sato);
				Employees.add(Suzuki);

				for(Employee employee : Employees) {
					System.out.println("番号は" + employee.getNumber() + "、名前は" + employee.getName() + "、年齢は" + employee.getAge() + "です");
				}




		//練習問題⑤

		HashMap<String,Integer> Test = new HashMap<>();

		Test.put("国語",90);
		Test.put("数学",80);
		Test.put("英語",65);

		for(Map.Entry<String,Integer> test : Test.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue());
		}

		//練習問題⑥

		//Mapはキー・バリュー形式でデータ管理を行えるため。



	}

}
