import java.util.Scanner;

public class D_3 {

    public static void main(String[] args) {
    	// 標準入力でN行それぞれで文字列が与えられるので、それらを入力して、順にそのままN行で出力してください。
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();
    	
    	for (int i = 1;i <= N; i++) {
    		System.out.println(scanner.next());
    	}
    }
}