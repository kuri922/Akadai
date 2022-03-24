class Creature {
	
	private int hp;
	private String name;

  	public Creature() {
    	hp = 10;
    	name = "スライム";
  	}

  	public void setName(String n){ 
      name = n;
    }
    
    public String getName(){ 
      return name;
    }
    
    public void setHp(int h){ 
      hp = h;
    }
    
    public int getHp(){ 
      return hp;
     }
  
   	public void show() {
     	System.out.println("生物の名前は" + name + "です。");
     	System.out.println("生物の生命値は" + hp + "です。");
   	}
}

class Lesson9C {

	public static void main (String [] args) {
  
    	Creature creature1 = new Creature();
    	creature1.show();
  		
  		Creature creature2 = new Creature();
  		creature2.setName("ドラキー");
  		creature2.setHp(50);
    	creature2.show();
  
  }
}