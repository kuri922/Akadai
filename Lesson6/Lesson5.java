public class Lesson5 {
  public static void main (String[] args) {
  
for(int i = 0; i < 5; i++) {

  int v = 1;
  for(int j = 0; j < i; j++) {
    v = v * 10 + 1;

  }

  int sum = 0;
  sum = v * v;
  System.out.println( v +"×" + v +"=" + sum +" ");
  }
}
}
