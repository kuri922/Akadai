
class Lesson6B6	{
	
	public static void main(String[] args)	{
   
		int num = 1;
		for(int i=1; i<20; i++){
			num *= 2;
			
			if (num > 100000) {
				System.out.println("2のn乗＞100000を満たす最小のnは" + i + "です。");
				System.out.println("その時の値は" + num + "です。");
			break;
			}
		}

  }
}