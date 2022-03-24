import java.util.*;
import java.util.Arrays;
import java.util.Random;

class Lesson7B3 {
	public static void main(String[] args) throws Exception {

		int[] Num = new int[100];
		Random random = new Random();

		int count =0; 

		for(int i = 0; i < 100; i++){
			Num [i] = random.nextInt(999)+1; 
		}
			System.out.println("ソート前");
		
		for(int i = 0; i < 100; i++){
			System.out.printf("%3d ",Num[i]);
			
			if((i + 1)% 10 == 0){
				System.out.println();

            }
        }

		Arrays.sort(Num); 

		System.out.println("ソート後");
		for(int i = 0; i < 100; i++){
			System.out.printf("%3d ",Num[i]);
			
			if((i +1) %10 == 0){
				System.out.println();

			}
		}	 
  }
}