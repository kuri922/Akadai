import java.text.*;
public class Sample112 {

    public String[] items = new String[0];
    public String[] items2 = new String [items.length + 1];
    public int size = 0;

    //配列要素の確保
    public void DynamicArrayTest() {
        items2 = new String [items.length + 1];
        System.arraycopy(items, 0, items2, 0, items.length);
        items = items2;
    }
    //最下位に要素を追加
    public  void add(String data) {
        DynamicArrayTest( );
        items[size] = data;
        System.out.println(items[size]);
        size++;
    }
    // 指定のインデックスの要素を追加
    public void set(int index, String data){

        try {
            size = index;
            items[size] = data;
            System.out.println(items[size]);
        }
        catch(java.lang.NullPointerException e) {
            System.out.println("指定のインデックスがありません。");
        }
    }

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

        public void clear(){
            String[] items = new String[0];
            System.out.println("全てクリアされました。");
        }

        // 昇順
        public static final int ASC_SORT = 0;
        // 降順
        public static final int DESC_SORT = 1;
        // ソートする
        // 引数 mode ASC_SORT:昇順/DESC_SORT:降順

        public void sort(int mode){
            if(mode == 0) {
				for(int i= 0; i < items.length-1; i++){
					for(int j = i+1 ; j < items.length; j++){
                            if(Integer.parseInt(items[i]) < Integer.parseInt(items[j])){
								 String k = items[i];
								items[i] = items[j];
								items[j] = k;
                             }
					}
            	}	
            }
		else {
			for(int i = 0; i < items.length-1; i++){
				for(int j = i+1; j < items.length; j++){
					if(items[j] != null) {
						if(Integer.parseInt(items[i]) > Integer.parseInt(items[j])){
							String k = items[i];
							items[i] = items[j];
							items[j] = k;
						}
						
					}
				}
			}
			
        }
		for(int j = 0; j < items.length; j++) {
        	System.out.println(items[j]);
		}
        
		
        }



}



   class Sample111 {
        
        public static void main(String[] args) {
            
            Sample112 sample = new Sample112();

            //sample.add("aaa");
            //sample.add("bbb");
            //sample.add("ccc");
            //sample.add("dd");
           // for(int i = 0; i < 4; i++){
                //System.out.println(sample.items[i]);
            //}
           //sample.clear();
           //java.text.DecimalFormat format = new java.text.DecimalFormat("ee000");
           // for(int i = 1; i <= 100; i++){ 
                //sample.add(format.format(i));
           // }

           // sample.clear();
            for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 3; j++){ 
                        java.text.DecimalFormat f = new java.text.DecimalFormat("0");
                        sample.add(f.format(j));
                     }
                     sample.clear();
            }
            sample.sort(0);
     }  
}
    

