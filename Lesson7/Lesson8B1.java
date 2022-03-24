class Dog {

  int age;
  String name;
  
  void setName(String n) {
   name = n;

  }

  void setAge(int a) {
    age = a;
  
   }
 
  void showNameAge()
{
System.out.println("犬の名前は" + name + "です。");
System.out.println("犬の年齢は" + age + "歳です。");
}
}
class Sample {

	public static void main (String [] args) {
  
	
		Dog dog1 = new Dog();
		dog1.setName("ポチ");
    dog1.setAge(8);
    dog1.showNameAge();
	
  	
	
		Dog dog2 = new Dog();
		dog2.setName( "シロ");
    dog2.setAge(3);
    dog2.showNameAge();
  }

}