import java.util.*;
import java.math.*;

class Lesson7B2{
	
	public static void main(String[] args) {
  
		System.out.println("整数を入力して」ください。");
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println( "最大5個の数字の中から最大値と最小値を求めます" ); 
		
		System.out.print("1つ目の数字：");
        int max = scanner.nextInt();
        int min = max;
        
			for(int i = 2; i <= 5; i++) {
				System.out.print(i + "つ目の数字：");
				int value = scanner.nextInt();
				max = Math.max(max , value);
				min = Math.min(min , value);
			}
         
			System.out.println("最大値:" + max);
			System.out.println("最小値:" + min);
    }
	}
  