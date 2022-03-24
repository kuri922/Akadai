package studya.a21;
import java.text.*;

public class A21_StrArray {
	// 文字列を保持する
	public String[] items = new String[0];
	public String[] items2 = new String [items.length + 1];
	public int size = 0;

	
	// 最下行に要素を追加
	public void DynamicArrayTest() {
		items2 = new String [items.length + 1];
		System.arraycopy(items, 0, items2, 0, items.length);
		items = items2;			
	}			

	public void add(String data){
		DynamicArrayTest( );
		items[size] = data;
		System.out.println(items[size]);
		size++;

	}

	// 指定インデックスの要素を上書き（指定インデックスが無い場合エラー）
	public void set(int index, String data){
	
		try {
			size = index;
			items[size] = data;
			System.out.println(items[size]);
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("指定のインデックスがありません");
		}
	
	}

// 指定インデックスの要素を取得（指定インデックスが無い場合エラー）;
	public String get(int index){
		size = index;
		try {
			System.out.println(items[size]);
		}
		catch(NullPointerException e) {
			System.out.println("指定のインデックスがありません。");
		}
		return items[size];

	}


// 全ての要素をクリア
	public void clear(){
			items = new String[0];
			size = 0;
			System.out.println("削除しました");
	}
	
}	

	class AAA{
		
		public static void main(String[] args) {
			
			A21_StrArray strArray = new A21_StrArray();
			
			//aaa～ddを追加
			strArray.add("aaa");
			strArray.add("bbb");
			strArray.add("ccc");
			strArray.add("dd");
			
			//4つの要素を取得して表示
			for(int i = 0; i < 4 ; i++){
				System.out.println(strArray.items[i]);
			
			}
			//すべてクリア
			strArray.clear();
			
			//ee001～e100の100個追加
			java.text.DecimalFormat format = new java.text.DecimalFormat("ee000");
			for(int i = 1; i <= 100; i++){
			strArray.add(format.format(i));
			}
			
			//76番目の要素を取得して表示
			String number = strArray.get(76);
			
			//先頭の要素をa001に上書き
			strArray.set(0 , "a001");
			
			//最後の要素をz100に上書き
			strArray.set(99 , "z100");
			
			//先頭の要素を取得して表示
			String number1 = strArray.get(0);
			
			//最後の要素を取得して表示
			String number2 = strArray.get(99);
			
			strArray.clear();
       
		
			
		}
	}

