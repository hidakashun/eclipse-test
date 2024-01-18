import java.util.Scanner;

public class D_1 {

	public static void main(String[] args) {
		// 標準入力で1つの文字列が与えられるので、それを入力して、そのまま1行で出力してください。
		
		// Scannerオブジェクトの作成
		Scanner scanner = new Scanner(System.in);
		
		// 標準入力から1つの文字列を読み取る
		String word = scanner.next();
		
		// 読み取った文字列をそのまま出力する
		System.out.println(word);
		
		// Scannerオブジェクトのクローズ
		scanner.close();

	}

}
