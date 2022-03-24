import java.io.*;

class Lesson14B2 {
	
	public static void main(String[] args){
		
		System.out.println("2つの整数を入力してください。");
		
		try {
			BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String str1 = br.readLine();
			int num = Integer.parseInt(str);
			int num2 = Integer.parseInt(str1);
			System.out.println(num  + "÷" + num2 + "の商は" + (num / num2) + "、余りは" + (num % num2) + "です");

		}	catch(ArithmeticException e) {
			 System.out.println("0除算エラーです。");

			} catch(Exception e) {
			   System.out.println("数値以外が入力されました");

		  }

	}
}