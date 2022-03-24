
class Creature{
	protected String name; 
	protected int hp; 

	public Creature() {
		name = "スライム";
		hp = 10;
	}
	
	public Creature(String n, int h){
		name = n;
		hp = h;
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

//抽象クラス Attackerクラス

abstract class Attacker extends Creature {
   
   //引数なしコンストラクタ

	public Attacker() {

  	}
  //引数ありコンストラクタ

	public Attacker(String n, int h) {
		super(n , h);

  	}
  
   // 抽象メソッド

	abstract public void attack(Attacker a);       

}

class Human extends Attacker {

    //コンストラクタで名前が設定できる

	public Human(String n) {
    
      //生命値は２０で固定

		super(n , 20);
    }
    
    //Attackerの生命の生命値を減らせる

	@Override
	public void attack(Attacker a) {
		int p = (int)Math.round(5 * Math.random());
		int h = a.getHp() - p;
		a.setHp(h);
    }
}

class Monster extends Attacker {

	protected int power;

    //コンストラクタで名前と生命値と攻撃力が設定できる

	public Monster(String n , int h , int p) {
		super(n , h);
		power = p;

    }
    
    //Attackerの生命の生命値を減らせる

	@Override
    public void attack(Attacker a) {
      int f = (int)Math.round(power * Math.random());
      int h = a.getHp() - f;
       a.setHp(h);
    }
}

//Battleクラス

class Battle{
	public Battle(Attacker a1 , Attacker a2) {

		System.out.println("#############################");
		System.out.println(a1.getName() + "VS" + a2.getName() + "戦闘開始！");
		System.out.println("#############################");
		
		while(true) {
			a1.attack(a2);
			System.out.println(a1.getName() + "が" + a2.getName() + "を攻撃した");

			if(a2.getHp() <= 0) {
				System.out.println(a1.getName() + "は" + a2.getName() + "を倒した");
				break;

			}
			System.out.println(a2.getName()+"の生命力は"+a2.getHp()+"に減った");
				
			a2.attack(a1);
			System.out.println(a2.getName() + "が" + a1.getName() + "を攻撃した");

			if(a1.getHp() <= 0) {
				System.out.println(a2.getName() + "は" + a1.getName() + "を倒した");
			break;

			}
			System.out.println(a1.getName()+"の生命力は"+a1.getHp()+"に減った");
			
		}
	}
}
class Lesson12C {
	public static void main (String[] args) {

		Battle battle = new Battle(

		new Human("勇者ロト"),
		new Monster("スライム" , 10 , 5)
		);
    
	}
}
