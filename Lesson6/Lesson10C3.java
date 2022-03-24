import java.time.LocalDate;
import java.util.Scanner;

class Lesson10C3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("年月入力:");
		String[] s = sc.nextLine().split(" ");

		if(Integer.parseInt(s[1]) > 12){
			System.out.println("月は1～12の間で入力してください");
			System.exit(0);
		}

  		 System.out.println("入力した年月は" + s[0]+ "年" + s[1] + "月です。");
 		LocalDate now = LocalDate.of(Integer.parseInt(s[0]),Integer.parseInt(s[1]),1);
 		System.out.println("月の日数は" + now.lengthOfMonth() + "日です。");

		int all=0;

   		for(int i=Integer.parseInt(s[1]); i <= 12; i++){
      		LocalDate nn = LocalDate.of(Integer.parseInt(s[0]) , i , 1);
      		all+=nn.lengthOfMonth();

   		}

    	System.out.println("入力年月の1日からその年の年末まであと" + (all-1) + "日です。");

 }
}