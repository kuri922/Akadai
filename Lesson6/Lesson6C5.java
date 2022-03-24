
import java.io.*;

class Lesson6C5 {

	public static void main(String[] args)throws IOException {
 
		int i,r,x;
 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("２つの自然数を入力してください");
  
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

    int num = a;
    int num2 = b;
    
		x = num * num2;
		if(num < num2){
			i = num;
			num = num2;
			num2 = i;

		}
		r = num % num2;
		
		while(r != 0){
			num = num2;
			num2 = r;
			r = num % num2;

		}
   
		System.out.println(a + "と" + b + "の最小公倍数は " + x/num2 + "です。");
   
	}

}