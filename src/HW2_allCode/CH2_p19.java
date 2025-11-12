import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Java_2 { //CH2_p19

    public static void main(String[] args) throws IOException {
		
		System.out.println("請問你是男生嗎?");
        System.out.println("請輸入Y或N:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String input = br.readLine();
        char letter = input.charAt(0);

        if (letter == 'Y' || letter == 'y') {
			
            System.out.println("你是男生阿");
			
        } else if (letter == 'N' || letter == 'n') {
			
            System.out.println("你是女生阿");
			
        } else {
			
            System.out.println("請輸入Y或N:");

        }
    }
}