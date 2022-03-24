import java . io . *;

class Lesson10C2 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("文字列を入力してください。");
	
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		 System.out.print("「" + str + "」" + "は、");
        if(isPalindrome(str)) {
            System.out.println("回文です。");

        } else {
            System.out.println("回文ではありません。");

        }
    }
 
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
		