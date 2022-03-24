import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


class Sample100 {
public static void main(String[] args)throws IOException
{

  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("数値を入力してください。");
  int num = Integer.parseInt(reader.readLine());
  
  int[] n = new int[num]; //…配列の作成
      for(int i=1; i<3 ; i++){// …各要素に値を設定
          n[i] = Integer.parseInt(reader.readLine());
      }
      System.out.println(" ");// …改行
	        for(int i=0; i<n.length; i++){//…設定後の値を見る
	            System.out.print(n[i] + " ");
	        }




}

}


