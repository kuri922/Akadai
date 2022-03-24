import java . io . *;

class Lesson10B1 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("整数を２つ入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		double ans = (num1 / num2);
		
		System.out.println("四捨五入前：" + str1 + "÷" +  str2 + "＝" + ans);
    System.out.println("四捨五入後："  + Math.round(ans));

		
	//	int num3 = Integer.parseInt(str1);
	//	int num4 = Integer.parseInt(str2);
		
	//	int ans1 = (num3 / num4);
		
		//System.out.println("四捨五入後：" + str1 + "÷" +  str2 + "＝" + Math.ceil(ans1));
		
		  
    }
}