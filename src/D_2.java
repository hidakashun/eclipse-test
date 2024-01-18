import java.util.Scanner;

public class D_2 {

	public static void main(String[] args) {
		// 標準入力で3行それぞれで文字列が与えられるので、それらを入力して、そのまま3行で出力してください。
		
		Scanner scanner = new Scanner(System.in);

		// 3回繰り返す
		for (int i = 1; i <= 3; i++) {
			
			// 標準入力から文字列を読み取る
			String Word = scanner.nextLine();
			
			// 読み取った文字列をそのまま出力する
			System.out.println(Word);
		}
		
		// Scannerオブジェクトのクローズ
		scanner.close();
	}

}
