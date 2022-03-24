import java.util.*;
import java.util.Arrays;

class Lesson7C1 {
	
	public static void main(String[] args) {
		int [] Num = new int[200];
        Random random = new Random();
        int count =0; 
        for(int i=0; i < 200; i++){
        	Num[i]=(int)(Math.random()*101);
        	System.out.print(Num [i] + " ");
        	count += Num[1];
        	if((i+1)%10==0)
        	System.out.println("\n");
        }
        
    	/**平均*/
    	
    	int Sum = 0; 

		for (int i = 0; i < Num.length; i++) {
			Sum += Num[i];
		}
    	System.out.println("平均値は" + ((double)Sum / Num.length) + "です。");

    	
    	/**標準偏差*/
    	double dblSum = 0.0;
    	double Ave = 0.0;
    	
		for (int i = 0; i < Num.length; i++) {
			Sum += Num[i];
			Ave = (double)Sum / Num.length;
			dblSum += Math.pow((Ave - Num[i]), 2.0);
			
		}
    	System.out.println("標準偏差は" + Math.sqrt(dblSum / Num.length)  + "です。");
    	
    	
    	/**中央値*/
    	double d = ((Num[99] + Num[100]) / 2);

        System.out.println("中央値は" + d  + "です。");
    	
    	/**最頻値*/
    	int[] Mod=new int[101];

        for(int i = 0; i < 200; i++){
        Mod[Num[i]]++;
        }
        int Num2 = 0;
        int max = 0;
        for(int i = 0; i < 101; i++){
        	
          if(max <= Mod[i]){
           Num2 = i;
           max = Mod[i];
           }
        }

        for(int i = 0; i < 101; i++){
        	
          if(Mod[i] == max) {
            System.out.println("最頻値は" + i + "です。");
          }
        }
    }
}

