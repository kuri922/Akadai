interface Menseki{
  double calcArea();
}

class Circle implements Menseki{
  private double radius;

  public Circle(double r){
    radius = r;
  }
 
 //円クラス

  public double calcArea(){
    double Menseki = (Math.PI*radius*radius);
    return Menseki;
  }
}

//台形クラス

class Trapezoid implements Menseki{
  private double ue;
  private double sita;
  private double height;

  public Trapezoid(double u, double s, double h){
    ue = u;
    sita = s;
    height = h;
  }
 
  public double calcArea(){
    double Menseki = ((ue + sita) * height  * 0.5);
    return Menseki;
  }
}

//体積クラス

class Volume {
  private Menseki menseki;
  private double d3height;
 
  public Volume(Menseki m, double d3h){
    menseki = m;
    d3height = d3h;
  }
 
  public double getVolume(){
    return menseki.calcArea() * d3height;
  }
}

class Lesson12B {
  public static void main(String[] args) {
    
    double radius = 5;
    Menseki circle = new Circle(radius);
    System.out.println("半径" + radius + "の円の面積は" + circle.calcArea() + "です。");
    
     double d3height = 11;
     Volume vcircle = new Volume(circle,d3height);
     System.out.println("高さが" + d3height + "の上記円の円柱の体積は" + vcircle.getVolume() + "です。");
     
     double ue = 6;
     double sita = 9;
     double height = 7;
     Menseki trapezoid = new Trapezoid(ue , sita , height);
     System.out.println("上底" + ue + "、下底" + sita + "、高さ" + height + "の台形の面積は");
     System.out.println(trapezoid.calcArea() + "です。");
    
    
     double height2 = 11;
     Volume vtrapezoid = new Volume(trapezoid,height2);
     System.out.println("高さが" + height2 + "の上記台形の台形柱の体積は" + vtrapezoid.getVolume() + "です。");
  }  
}
