import java.io.*;

class Lesson14C2 {
	
	public static void main(String[] args) {

    System.out.println("整数を入力してください。");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("入力した値を2倍にすると" + inputIntNumber(br.readLine()) + "です。");

		} catch (Exception e) {
		 	 System.out.println("数値以外が入力されました。");

		}

	}
	private static int inputIntNumber(String str) throws Exception {
		
		int n = 0;
		try {
		n = Integer.parseInt(str) * 2;

		} catch (Exception e) {
		   throw new Exception(e); 
		}
		return n;
	}
}