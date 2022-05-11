package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeTest3 {
	public static void main(String[] args) {


		//練習問題①,②--------------------------------------------------------
		String[] dates = new String[4];

			dates[0] = "1";
			dates[1] = "田中太郎";
			dates[2] = "男性";
			dates[3] = "27";

				System.out.println(dates[1]);


		// 解答例：String[] tanakaData = {"1","田中太郎","男性","27"}
		//         System.out.println(tanakaData[1]);

		//練習問題④-----------------------------------------------------------


				ArrayList<Employee> Employees = new ArrayList<>();

				Employee tanaka = new Employee(1,"田中太郎","男性",27);
				Employee sato = new Employee(2,"佐藤花子","女性",22);
				Employee suzuki = new Employee(3,"鈴木次郎","男性",31);

				Employees.add(tanaka);
				Employees.add(sato);
				Employees.add(suzuki);

				for(Employee employee : Employees) {
					System.out.println("番号は" + employee.getNumber()
						+ "、名前は" + employee.getName()
							+ "、年齢は" + employee.getAge() + "です");
				}




		//練習問題⑤-------------------------------------------------------------

		HashMap<String,Integer> Test = new HashMap<>();

		Test.put("国語",90);
		Test.put("数学",80);
		Test.put("英語",65);

		for(Map.Entry<String,Integer> test : Test.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue());
		}


		//練習問題⑥-------------------------------------------------------------

		//Mapはキー・バリュー形式でデータ管理を行えるため。

		// 解答例：今回は順番で持つ必要がないのと、科目名と得点を
		//         紐づけてコレクションに格納するのが良いと考えられるため。



	}

}
