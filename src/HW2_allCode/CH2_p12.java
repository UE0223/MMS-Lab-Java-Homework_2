import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Java_2{  //Ch2 p12
	public static void main(String[] args) throws  IOException {
		
		System.out.println("請輸入整數");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1) {
			
			System.out.println("輸入的是1");
			
		} else if (num == 2) {
			
			System.out.println("輸入的是2");
			
		} else {
			System.out.println("請輸入1或2");
		}

	}
}

/* ------------------------------------------------------------------ 優化程式
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2 {  //Ch2 p12
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num;  // 在迴圈外宣告變數
		
		while (true) {  // 持續要求輸入
			System.out.println("請輸入整數 (1或2)：");
			
			num = Integer.parseInt(br.readLine());
			
			if (num == 1) {
				System.out.println("輸入的是1");
				break;  // 輸入正確 → 離開迴圈
			} else if (num == 2) {
				System.out.println("輸入的是2");
				break;  // 輸入正確 → 離開迴圈
			} else {
				System.out.println("請重新輸入! 必須是 1 或 2");
			}
		}
	}
}
-----------------------------------------------------------------*/