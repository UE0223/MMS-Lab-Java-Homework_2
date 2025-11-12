import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2 { //CH2_p34

    public static void main(String[] args) throws IOException {
		
		System.out.println("要跳過第幾次的處理呢? (1~10)");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		
        for (int i = 1; i <= 10; i++) {
			
			if (i == res) continue;

			System.out.println("第" + i + "次的處理。");
			
        }
    }
}