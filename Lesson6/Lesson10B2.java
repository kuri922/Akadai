import java . io . *;

class Lesson10B2 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("文字列を入力してください。");
		
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("入力した文章は" + str + "です。");
		
		
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println("入力した文章を逆から読むと\n" + str);
		
		  
    }
}