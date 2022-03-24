class Creature {

  int hp;
  String name;
  
  String getName(String n) {
    name = n;
    System.out.println("名前は" + name + "です。");
    return name;
    
  }
  
  int getHp(int h) {
   if(h < 0) {
   	  System.out.println("体力は0です。");

   } else {
      hp = h;
       System.out.println("体力は" + hp + "です。");

  	}	
  	  return hp;
   }
}

class Lesson8C1 {
  public static void main (String [] args) {
  
    Creature creature1 = new Creature();
    
    creature1.getName("ネコ");
    creature1.getHp(1);
    
  }
}
