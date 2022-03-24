 import java . io . *;

class Lesson6B3 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		if (num > 1 && num < 21 ) {
			
	   		for(int i = 0; i < num ; i++){
	   			System.out.println("Hello");

	   		}
		} else {
				System.out.print("H");
		 }
	}
}		
