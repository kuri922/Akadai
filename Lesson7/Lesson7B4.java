import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Lesson7B4 {
	public static void main(String[] args) throws Exception {
		
		Integer [] Num = new Integer[100];
        Random random = new Random();
		
        for(int i=0; i < 100; i++){
			    Num [i] = random.nextInt(999)+1; 
        }
		
        System.out.println("ソート前");
        for(int i=0; i < 100; i++){
			    System.out.printf("%3d ",Num[i]);
        	
            if((i+1)%10==0){
				      System.out.println();
            }
        }

        System.out.println("ソート後");
		    Arrays.sort(Num, Collections.reverseOrder());
        
        for(int i = 0; i < Num.length; i++) {
			    System.out.printf("%3d ",Num[i]);
        	
			    if((i+1)%10==0){
				    System.out.println();
          } 
        }
    }
 }
