
public class Test2 {

	public static void main(String[] args) {
		// 1から100までの数を使用して、それらの数をすべて足し合わせる際に、
		//3の倍数は加算せず、その結果を表示するプログラムを作成してください。

		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += 0;
			}
			else {
				sum += i;
			}

		}
		
		System.out.println(sum);
	}

}
